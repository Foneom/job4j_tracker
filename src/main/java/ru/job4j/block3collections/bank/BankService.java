package ru.job4j.block3collections.bank;

import java.util.*;


public class BankService {
    /**
     * Пользователи системы
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавления нового пользователя в систему
     *
     * @param user - пользователь
     */
    public void addUser(User user) {
        users.computeIfAbsent(user, key -> new ArrayList<>());
    }

    /**
     * Метод добавления нового счета в систему
     *
     * @param passport - паспорт
     * @param account  - счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод поиска пользователя по паспорту
     *
     * @param passport - номер паспорта
     * @return
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> user = Optional.ofNullable(users.keySet()
                .stream()
                .filter(el -> el.getPassport()
                        .equals(passport))
                .findFirst()
                .orElse(null));
        return user;
    }

    /**
     * Метод поиска счета по реквизитам
     *
     * @param passport  - номер паспорта
     * @param requisite - реквизиты
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return this.users.get(user)
                    .stream()
                    .filter(e -> e.getRequisite().equals(requisite))
                    .findFirst().orElse(null);
        }
        return null;
    }
    /**
     * Метод перечисления денег с одного счета на другой
     *
     * @param srcPassport   - паспорт пользователя у которого переводят деньги
     * @param srcRequisite  - реквизиты пользователя у которого переводят деньги
     * @param destPassport  - паспорт пользователя которому переводят деньги
     * @param destRequisite - реквизиты пользователя которому переводят деньги
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null) {
            if (src.getBalance() >= amount && amount >= 0) {
                double newSrcBalance = src.getBalance() - amount;
                double newDestBalance = dest.getBalance() + amount;
                src.setBalance(newSrcBalance);
                dest.setBalance(newDestBalance);
                rsl = true;
            }
        }
        return rsl;
    }
}
