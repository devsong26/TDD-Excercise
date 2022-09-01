package exercise.tdd.simple.member;

import java.util.Objects;

public class StubMemberService extends Validator<Object> implements MemberService {
    @Override
    public Member register(String username, String password) {
        validate(username, password);
        return null;
    }

    @Override
    protected void validate(Object... objects) {
        for(Object o : objects){
            Objects.requireNonNull(o);
        }
    }

}
