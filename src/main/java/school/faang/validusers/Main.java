package school.faang.validusers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Oleg", 19, "Google", "London"));
        userList.add(new User("Alex", 20, "Uber", "New York"));
        userList.add(new User("Igor", 18, "Amazon", "Amsterdam"));
        userList.add(new User("Mira", 19, "Uber", "London"));

        for (User user : userList) {
            System.out.println("Name: " + user.getName() + " "
                    + "Age: " + user.getAge() + " "
                    + "Job: " + user.getJob() + " "
                    + "Address: " + user.getAddress());
        }
    }
}
