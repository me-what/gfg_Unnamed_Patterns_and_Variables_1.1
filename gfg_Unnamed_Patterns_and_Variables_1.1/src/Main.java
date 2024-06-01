public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        if (person instanceof Person(String name, int _)) {
            System.out.println("Person's name is: " + name);
        }

        if (person instanceof Person(String _, int age)
                && age > 20) {
            System.out.println(
                    "Person is older than 20 years old.");
        }
    }
}