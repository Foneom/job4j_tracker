package ru.job4j.block2oop.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (int index = 0; index < users.length; index++) {
            if (user.getUsername().equals(login)) {
                user = users[index];
                System.out.println("User found");
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException i) {
            i.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

