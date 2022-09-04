package exercise.tdd.simple.member;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//TODO 이 어노테이션이 붙은 멤버 필드를 밸리데이션 메서드에서 
//서치하여 regex에 부합하는지 확인
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Data {
    String regex();
}
