package exercise.tdd.singleModule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {

    private Adder adder;

    @BeforeEach
    public void setUp(){
        adder = new Adder();
    }

    @Test
    @DisplayName("더하기 실패")
    public void test1(){
        // given
        int a = 10;
        int b = 10;

        // when
        int result = adder.process(a, b);

        assertEquals(result, 20);
    }

}
