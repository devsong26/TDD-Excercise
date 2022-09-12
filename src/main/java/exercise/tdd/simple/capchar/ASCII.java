package exercise.tdd.simple.capchar;

import java.util.Random;

public enum ASCII{
    a(65)
    , A(97)
    , zero(48)
    ;

    private final int code;
    private static final Random RANDOM = new Random();

    ASCII(int code){
        this.code = code;
    }

    public static char getRandom(){
        int sel = RANDOM.nextInt(3) % 3;
        int res = zero.code;

        if(sel == 0) res = a.code;
        else if(sel == 1) res = A.code;

        return (char) (res + (
                    sel < 2 ?
                        RANDOM.nextInt(26) % 26
                        : RANDOM.nextInt(10) % 10
                ));
    }
}
