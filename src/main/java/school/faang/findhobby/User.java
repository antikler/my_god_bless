package school.faang.findhobby;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Set<String> activities;

    public User(Integer id, String name, Integer age, Set<String> activities) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.activities = activities;
    }

    public static Map<User, String> findHobbyLovers(List<User> list, Set<String> any_activities) {
        Map<User, String> users = new HashMap<>();

        for (User user: list) {
            for (String active: user.activities) {
                if (any_activities.contains(active)) {
                    users.put(user, active);
                    break;
                }
            }
        }

        return users;
    }
}
