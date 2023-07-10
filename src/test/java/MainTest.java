import Classes.Person;
public class MainTest {
    public static void printJob(Person person){
        System.out.println(person.getJob());
    }
    public static void main(String[] args) {
        Person chris = new Person("Chris", 16, "Student");
        System.out.println(chris);
        printJob(chris);
    }
}