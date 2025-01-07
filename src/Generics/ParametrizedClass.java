package Generics;

public class ParametrizedClass {
    public static void main(String[] args) {

        Info<String> info1 = new Info<>("Privet!");

        System.out.println(info1);

    }
}
    class Info<T> {

        private T value;

        public Info(T value) {
            this.value = value;
        }

        public String toString() {
            return "{{__" + value + "__}}";
        }
    }