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
        Map<Integer, List<User>> mapuser = new HashMap<Integer, List<User>>();

        if (users == null || users.isEmpty()) {
            return mapuser;
        }

        List<User> list;

        for (User user : users) {
            if (mapuser.containsKey(user.age)) {
                list = mapuser.get(user.age);
            } else {
                list = new ArrayList<>();
            }
            list.add(user);
            mapuser.put(user.age, list);
        }

        return mapuser;
    }
}
