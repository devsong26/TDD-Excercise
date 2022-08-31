package exercise.tdd.simple.member;

import java.util.Objects;

public class StubMemberService implements MemberService {
    @Override
    public Member register(String username, String password) {
        validateRegisterParam(username, password);
        return null;
    }

    private static void validateRegisterParam(String username, String password) {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
    }

}
