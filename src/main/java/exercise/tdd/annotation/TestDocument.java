package exercise.tdd.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface TestDocument {

    String expected() default "";
    String comment() default "";
    String failReason() default "";

}
