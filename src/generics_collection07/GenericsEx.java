package generics_collection07;

class GenClass<T> {
    T val;
    void set(T t) {
        val = t;
    }
    T get() {
        return val;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        // GenClass의 T를 String으로 지정하겠다
        GenClass<String> strGen = new GenClass<String>();
        strGen.set("Hello");
        System.out.println("strGen : " + strGen.get()); // Hello

        // GenClass의 T를 Integer로 지정하겠다
        GenClass<Integer> intGen = new GenClass<>();
        intGen.set(111);
        System.out.println("intGen : " + intGen.get()); // 111

        // GenClass의 T를 Integer로 지정하겠다
        GenClass<Float> floatGen = new GenClass<>();
        floatGen.set(10.2f);
        System.out.println("floatGen : " + floatGen.get()); // 10.2
    }
}
