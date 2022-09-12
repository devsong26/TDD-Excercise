package exercise.tdd.simple.capchar;

import exercise.tdd.annotation.TestDocument;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CapCharTest {

    @Test
    @TestDocument(comment = "캡챠 문자열을 생성하기")
    public void generate_1(){
        //given
        CapChar cc = new CapChar();

        //when
        String chars = cc.generate();

        //then
        assertNotNull(chars);
        System.out.println(chars);
    }

    @Test
    @TestDocument(comment = "대, 소문자, 숫자 조합 문자열을 생성하기")
    public void generate_2(){
        //given
        CapChar cc = new CapChar();

        //when
        String chars = cc.generate();

        //then
        assertNotNull(chars);
        System.out.println(chars);
    }

}
