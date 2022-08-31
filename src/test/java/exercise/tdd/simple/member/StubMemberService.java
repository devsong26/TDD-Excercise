package exercise.tdd.simple.member;

public class StubMemberService implements MemberService {
    @Override
    public Member register(String username, String password) {
        return null;
    }
}
