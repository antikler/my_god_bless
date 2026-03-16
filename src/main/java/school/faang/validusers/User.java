package school.faang.validusers;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private static final Integer VALID_AGE = 18;
    private static final Set<String> VALID_JOBS = Set.of("Google", "Uber", "Amazon");
    private static final Set<String> VALID_ADDRESSES = Set.of("London", "New York", "Amsterdam");
    private String name;
    private Integer age;
    private String job;
    private String address;

    public User(String name, Integer age, String job, String address) {
        validUser(name, age, job, address);
        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
    }

    private void validUser(String name, Integer age, String job, String address) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name is empty");
        }
        if (age < VALID_AGE) {
            throw new IllegalArgumentException("Not valid age");
        }
        if (!VALID_JOBS.contains(job)) {
            throw new IllegalArgumentException("Not valid job");
        }
        if (!VALID_ADDRESSES.contains(address)) {
            throw new IllegalArgumentException("Not valid address");
        }
    }
}
