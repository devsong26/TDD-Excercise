package exercise.tdd.simple.member;

public class RegexException extends RuntimeException{
    private RegexException(String msg) {
        super(msg);
    }

    public static RegexException newEx(String msg){
        return new RegexException(msg);
    }
}
