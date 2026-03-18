package school.faang.findhobby;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Set<String> activities;

    public static Map<User, String> findHobbyLovers(List<User> users, Set<String> anyActivities) {
        Map<User, String> hobbyLovers = new HashMap<>();

        if (users.isEmpty() || anyActivities.isEmpty()) {
            return hobbyLovers;
        }

        for (User user : users) {
            for (String active : user.activities) {
                if (anyActivities.contains(active)) {
                    hobbyLovers.put(user, active);
                    break;
                }
            }
        }

        return hobbyLovers;
    }
}
