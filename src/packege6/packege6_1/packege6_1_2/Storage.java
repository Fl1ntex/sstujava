package packege6.packege6_1.packege6_1_2;

public class Storage <T>{
    private final T value;

    public Storage(T value){
        this.value = value;
    }

    public T getValue(T defaultValue){
        if (value == null){
            return defaultValue;
        }
        return value;
    }
}

//Storage<Number> s1 = new Storage<>(null);
//printStorage(s1, 0);
//
//Storage<Number> s2 = new Storage<>(99);
//printStorage(s2, -1);
//
//Storage<String> s3 = new Storage<>(null);
//printStorage(s3, "default");
//
//Storage<String> s4 = new Storage<>("hello");
//printStorage(s4, "hello world");
//public static <T> void printStorage(Storage<T> storage, T alternative) {
//    System.out.println(storage.getValue(alternative));
//}