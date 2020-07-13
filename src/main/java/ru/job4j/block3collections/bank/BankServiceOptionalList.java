package ru.job4j.block3collections.bank;

import java.util.*;

public class BankServiceOptionalList {
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
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавления нового счета в систему
     *
     * @param passport - паспорт
     * @param account  - счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод поиска пользователя по паспорту
     *
     * @param passport - номер паспорта
     * @return
     */
    public Optional<User> findByPassport(String passport) {
        Optional user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = Optional.of(key);
                break;
            }
        }
        return user;
    }

    /**
     * Метод поиска счета по реквизитам
     *
     * @param passport  - номер паспорта
     * @param requisite - реквизиты
     * @return
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional account = null;
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            for (Account key : accounts) {
                if (key.getRequisite().contains(requisite)) {
                    account = Optional.of(key);
                    break;
                }
            }
        }
        return account;
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
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent()) {
            if (src.get().getBalance() >= amount && amount >= 0) {
                double newSrcBalance = src.get().getBalance() - amount;
                double newDestBalance = dest.get().getBalance() + amount;
                src.get().setBalance(newSrcBalance);
                dest.get().setBalance(newDestBalance);
                rsl = true;
            }
        }
        return rsl;
    }
}
