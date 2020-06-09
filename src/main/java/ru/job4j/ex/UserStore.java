package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int index;
        for (index = 0; index < users.length; index++) {
            User user = users[index];
            if (user.getUsername().equals(login)) {
                System.out.println("User found");
                break;
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return new User(login, users[index].isValid());
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
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

