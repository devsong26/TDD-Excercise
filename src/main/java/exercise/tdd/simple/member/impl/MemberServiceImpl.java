package exercise.tdd.simple.member.impl;

import exercise.tdd.simple.member.Member;
import exercise.tdd.simple.member.MemberService;
import exercise.tdd.simple.member.ServiceValidator;

public class MemberServiceImpl extends ServiceValidator<Member> implements MemberService {
    @Override
    public Member register(String username, String password) {
        validate(new Member(username, password));
        return null;
    }

    @Override
    protected void validate(Member m) {
        m.validate();
    }

}
