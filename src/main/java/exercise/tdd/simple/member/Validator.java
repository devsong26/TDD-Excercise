package exercise.tdd.simple.member;

public abstract class Validator<T> {

    protected abstract void validate(T... t);

}
