class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, age, id);
    }
}

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant", 31, "001");
        Person person2 = new Person("Prashant", 31, "001");
        if (person1.equals(person2)){
            System.out.println("equals");
        } else {
            System.err.println("Not equal");
        }
    }

}
