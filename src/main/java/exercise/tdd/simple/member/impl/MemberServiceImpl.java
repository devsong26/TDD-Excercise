package exercise.tdd.simple.member.impl;

import exercise.tdd.simple.member.Member;
import exercise.tdd.simple.member.MemberService;
import exercise.tdd.simple.member.Validator;

import java.util.Objects;

public class MemberServiceImpl extends Validator<Object> implements MemberService {
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
