
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    public Person() {}
}

public class Main {
    public static void main(String[] args) {
        Person man = new Person("홍길동", 23);
        Person kid = new Person();

        System.out.println(man.name);
    }
}
