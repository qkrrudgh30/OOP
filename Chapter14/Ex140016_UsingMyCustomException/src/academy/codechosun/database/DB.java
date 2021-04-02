package academy.codechosun.database;

import academy.codechosun.exception.UserNotFoundException;

public class DB {
    public User fineUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }

        throw new UserNotFoundException(username);
    }
    

}



