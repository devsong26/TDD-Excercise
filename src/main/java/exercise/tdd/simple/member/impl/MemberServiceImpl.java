package exercise.tdd.simple.member.impl;

import exercise.tdd.simple.member.Member;
import exercise.tdd.simple.member.MemberService;
import exercise.tdd.simple.member.ServiceValidator;

public class MemberServiceImpl extends ServiceValidator<Member> implements MemberService {
    @Override
    public Member register(String username, String password) {
        Member m = new Member(username, password);
        validate(m);

        return null;
    }

    @Override
    protected void validate(Member m) {
        //TODO 기가입 회원 있는지 확인

        m.validate();
    }

}
