package exercise.tdd.simple.member;

import exercise.tdd.annotation.TestDocument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MemberServiceTest {
    private MemberService memberService;

    @BeforeEach
    public void setUp(){
        this.memberService = new StubMemberService();
    }

    @Test
    @TestDocument(
            expected = "실패",
            comment = "회원가입 시도",
            failReason = "username, password is null")
    public void test_register1(){
        //given
        String username = null, password = null;

        assertThrows(NullPointerException.class, () -> {
            //when
            Member member = memberService.register(username, password);

            //then
            assertNotNull(member);
        });
    }
//
//    public void expectThrows(){
//
//    }

}
