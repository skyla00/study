public class Collection {
    public static void main(String[] args) {
        new CollectionClass<>(0).print();
    }
}
class Printer {
    void print(Integer x) {
        System.out.println("A" + x);
    }
    void print(Object x) {
        System.out.println("B" + x);
    }
    void print(Number x) {
        System.out.println("C" + x);
    }
}
class CollectionClass <T> {
    T value;
    public CollectionClass(T t) {
       value = t;
    }
    public void print() {
        new Printer().print(value);
    }
}
