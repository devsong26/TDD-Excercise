package exercise.tdd.simple.capchar;

import exercise.tdd.annotation.TestDocument;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CapCharTest {

    @Test
    @TestDocument(comment = "캡챠 문자열을 내려받기")
    public void test_1(){
        //given
        CapChar cc = new CapChar();

        //when
        String chars = cc.generate();

        //then
        assertNotNull(chars);
        System.out.println(chars);
    }

}
