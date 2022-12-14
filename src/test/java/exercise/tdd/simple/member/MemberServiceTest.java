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

    @Test
    @TestDocument(
            expected = "실패",
            comment = "회원가입 시도",
            failReason = "username이 이메일 포맷이 아닐 경우")
    public void test_register2(){
        //given
        String username = "username", password = "111";

        assertThrows(RegexException.class, () -> {
            //when
            Member member = memberService.register(username, password);

            //then
            assertNotNull(member);
        });
    }

    @Test
    @TestDocument(
            expected = "실패",
            comment = "회원가입 시도",
            failReason = "password가 숫자 & 특수문자 & 소문자 & 대문자 5글자 이상 아닐 경우")
    public void test_register3(){
        //given
        String username = "user@howser.co.kr", password = "111";

        assertThrows(RegexException.class, () -> {
            //when
            Member member = memberService.register(username, password);

            //then
            assertNotNull(member);
        });
    }
//  TODO 예외가 예상되는 메서드는 래핑해서 컨슈머로 짜보자.
//    public void expectThrows(){
//
//    }

}
