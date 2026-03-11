package school.faang.groupusers;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String workplace;
    private String address;

    public static Map<Integer, List<User>> groupUsers(List<User> users) {
        Map<Integer, List<User>> mapUser = new HashMap<Integer, List<User>>();

        if (users == null || users.isEmpty()) {
            return mapUser;
        }

        List<User> list;

        for (User user : users) {
            if (mapUser.containsKey(user.age)) {
                list = mapUser.get(user.age);
            } else {
                list = new ArrayList<>();
            }
            list.add(user);
            mapUser.put(user.age, list);
        }

        return mapUser;
    }
}
