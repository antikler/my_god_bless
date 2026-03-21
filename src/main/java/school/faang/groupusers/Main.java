package school.faang.groupusers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Sergey", 50, "Alfa", "Spb"));
        users.add(new User("Anton", 40, "AlfaBet", "Spb"));
        users.add(new User("Andrey", 30, "Betta", "Syk"));
        users.add(new User("Denis", 50, "Terra", "Syk"));
        users.add(new User("Viktor", 40, "Nova", "Spb"));
        users.add(new User("Kirill", 30, "Status", "Msk"));
        users.add(new User("Vova", 50, "Retro", "Msk"));
        Map<Integer, List<User>> groupList = User.groupUsers(users);

        for (Map.Entry<Integer, List<User>> group : groupList.entrySet()) {
            System.out.println("Age: " + group.getKey());
            System.out.println("\tUsers:");
            for (User user : group.getValue()) {
                System.out.println("\t\t" + user.getName());
            }
        }
    }
}
