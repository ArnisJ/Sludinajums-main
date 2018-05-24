package service;

import java.util.ArrayList;
import java.util.List;
import domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    String currentName = "Eduards";
    public List<User> nameUserList;
    public UserService() {
        nameUserList = hardcodedUserInitialization();
    }

    public List<User> getUserListByAuthor(String name) {
        List<User> filteredByName = new ArrayList<>();
        for (User user : nameUserList) {
            if (user.getName().equals(name)) {
                filteredByName.add(user);
            }
        }
        return filteredByName;
    }

    //pievienojam hardcoded user
    private List<User> hardcodedUserInitialization() {
        List<User> users = new ArrayList();
        for (int i = 1; i < currentName.length(); i++) {
            User user = new User(Long.valueOf(i), "Hai", "Yes" + i, getName(i));
            users.add(user);
        }
        return users;
    }

    private String getName(int i) {
        if (i % 2 == 0) {
            return "Aleksis";
        }
        return "Es";
    }
}
