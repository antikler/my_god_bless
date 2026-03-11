package school.faang.groupusers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        users.add(new User("Oleg", 19, "school", "NY"));
        users.add(new User("Alex", 20, "office", "LA"));
        users.add(new User("Igor", 21, "farm", "NM"));
        users.add(new User("Ivan", 19, "fabric", "NY"));
        users.add(new User("Anna", 20, "school", "LA"));
        users.add(new User("Poly", 21, "office", "NM"));
        users.add(new User("Max", 19, "farm", "CH"));
        users.add(new User("Tima", 21, "fabric", "DT"));
        users.add(new User("Yoru", 20, "station", "CH"));
        users.add(new User("Dima", 19, "station", "DT"));

        Map<Integer, List<User>> mapuser = User.groupUsers(users);

        for (Map.Entry<Integer, List<User>> entry : mapuser.entrySet()){
            System.out.println("Age: " + entry.getKey());
            System.out.println("Users: ");
            for (User user : entry.getValue()){
                System.out.println(user.getName());
            }
            System.out.println();
        }
    }
}
