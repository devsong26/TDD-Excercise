package exercise.tdd.simple.member;

import java.util.Objects;

public class Member implements DataValidator{
    private final String username;
    private final String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void validate() {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
    }

}
