package packege2.packege2_3.packege2_3_4;

public interface InitMeowable {
    default void initMeow(Meowable meowable){
        meowable.meow();
    }
}
