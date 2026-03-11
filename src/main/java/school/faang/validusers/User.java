package school.faang.validusers;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class User {
    private static final List<String> VALID_JOBS = Arrays.asList("Google", "Uber", "Amazon");
    private static final List<String> VALID_ADDRESSES = Arrays.asList("London", "New York", "Amsterdam");
    private String name;
    private Integer age;
    private String job;
    private String address;

    public User(String name, Integer age, String job, String address) {
        if (!name.isEmpty()) {
            if (age>=18) {
                if (VALID_JOBS.contains(job)) {
                    if (VALID_ADDRESSES.contains(address)) {
                        this.name = name;
                        this.age = age;
                        this.job = job;
                        this.address = address;
                    } else {
                        throw new IllegalArgumentException("Not valid address");
                    }
                } else {
                    throw new IllegalArgumentException("Not valid job");
                }
            } else {
                throw new IllegalArgumentException("Not valid age");
            }
        } else {
            throw new IllegalArgumentException("Name is empty");
        }
    }
}
