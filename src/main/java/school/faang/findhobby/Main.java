package school.faang.findhobby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Oleg",  20, Set.of("Snowboard", "Shooting")));
        userList.add(new User(2, "Alex",  21, Set.of("Windsurfing", "Reading")));
        userList.add(new User(3, "Igor",  23, Set.of("Surfing", "Shooting")));
        userList.add(new User(4, "Mira",  18, Set.of("Snowboard", "Windsurfing")));

        Set<String> activities = Set.of("Shooting", "Windsurfing", "Surfing", "Snowboard", "Reading");
        Map<User, String> users = User.findHobbyLovers(userList, activities);

        for (Map.Entry<User, String> entry : users.entrySet()) {
            System.out.printf("Name: %s Activity: %s\n", entry.getKey().getName(), entry.getValue());
        }
    }
}
