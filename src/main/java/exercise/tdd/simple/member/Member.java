package exercise.tdd.simple.member;

import java.util.Objects;

public class Member extends DataValidator{

    private final String username;
    private final String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void validate() {
        Objects.requireNonNull(username);
        final String usernameRegex = "^\\S+@\\S+\\.\\S+$";
        super.getRgxChecker().check(usernameRegex, username);

        Objects.requireNonNull(password);
        final String pwdRegex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()])[a-zA-Z\\d!@#$%^&*()]{10,}";
        super.getRgxChecker().check(pwdRegex, password);
    }

}
