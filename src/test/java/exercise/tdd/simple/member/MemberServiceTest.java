package exercise.tdd.simple.member;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MemberServiceTest {
    private MemberService memberService;

    @BeforeEach
    public void setUp(){
        this.memberService = new StubMemberService();
    }

    @Test
    @DisplayName("회원 가입 시도")
    public void test_register1(){
        //given
        String username = null, password = null;

        //when
        Member member = memberService.register(username, password);

        //then
        assertNotNull(member);
    }

}
