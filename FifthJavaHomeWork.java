import java.util.Arrays;
/**
 * author Viktor Shkuratov
 * date 26/07/2018
 * Java 1 HomeWork 5
 */
public class Person {

    String surname;
    String name;
    String secondName;
    String position;
    String eMail;
    String number;
    int salary;
    int age;

    public static void main(String[] args) {
        Person [] personArr = new Person[5];
        personArr [0] = new Person("Ivanov", "Ivan", "Ivanovich","java-developer",
                "i@gmail.com","88005553535",100000,35);

        personArr [1] = new Person("Ivanov", "Petr", "Ivanovich","java-developer",
                "i@gmail.com","88005553535",100000,20);

        personArr [2] = new Person("Sever", "Olga", "Ivanovna","java-developer",
                "i@gmail.com","88005553535",100000,26);

       personArr [3] = new Person("Malkina", "Nadeshda", "Petrovna","java-developer",
                "i@gmail.com","88005553535",100000,45);

        personArr [4] = new Person("Yhin", "Oleg", "Petrovich","java-developer",
                "i@gmail.com","88005553535",100000,50);

        for(Person person:personArr) {
            if (person.age > 40) {
                System.out.println();
                System.out.println("Person:\n"+person.toString());
            }
        }
    }

    public Person(String surname, String name, String secondName, String position, String eMail, String number,
                  int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.position = position;
        this.eMail = eMail;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + "\nName: " + name + "\nSecondName: " + secondName + "\nPosition: " + position +
                "\ne-Mail: " + eMail + "\nPhone Number: " + number + "\nSalary: " + salary + "\nAge: "
                + age;
    }
}
