package exercise.tdd.simple.capchar;

import exercise.tdd.annotation.TestDocument;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CapCharTest {

    @Test
    @TestDocument(comment = "대, 소문자, 숫자 조합 문자열을 생성하기")
    public void generate_1(){
        //when
        String chars = new CapChar().get();

        //then
        assertNotNull(chars);
        System.out.println(chars);
    }

    @Test
    @TestDocument(comment = "생성된 문자열을 입력된 문자열과 비교하기")
    public void equals_1(){
        //given
        CapChar cc = new CapChar();
        String input = "asdbid1923";

        //when
        String chars = cc.get();

        //then
        assertFalse(cc.equals(input));
    }

}
