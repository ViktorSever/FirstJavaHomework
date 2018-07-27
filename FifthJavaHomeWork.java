/**
 * author Viktor Shkuratov
 * date 27/07/2018
 * Java 1 HomeWork 5
 */
public class JavaFifthHomeWork {
    private Person[] personArr;
    public static void main (String[] args) {
        JavaFifthHomeWork javaFifthHomeWork = new JavaFifthHomeWork();
        javaFifthHomeWork.firstTask(javaFifthHomeWork.getPersonArr());
    }

    public JavaFifthHomeWork() {
        personArr = initPersons();
    }

    private Person[] getPersonArr() {
        return personArr;
    }

    private Person[] initPersons() {
        Person [] people = new Person[5];
        people [0] = new Person("Ivanov", "Ivan", "Ivanovich","java-developer",
                "i@gmail.com","88005553535",100000,35);

        people [1] = new Person("Ivanov", "Petr", "Ivanovich","java-developer",
                "i@gmail.com","88005553535",100000,20);

        people [2] = new Person("Sever", "Olga", "Ivanovna","java-developer",
                "i@gmail.com","88005553535",100000,26);

        people [3] = new Person("Malkina", "Nadeshda", "Petrovna","java-developer",
                "i@gmail.com","88005553535",100000,45);

        people [4] = new Person("Yhin", "Oleg", "Petrovich","java-developer",
                "i@gmail.com","88005553535",100000,50);
        return people;
    }

    public void firstTask(Person [] personArr) {
        for(Person person:personArr) {
            if (person.getAge() > 40) {
                System.out.println();
                System.out.println("Person:\n"+person.toString());
            }
        }
    }

    public class Person {
        private String surname;
        private String name;
        private String secondName;
        private String position;
        private String eMail;
        private String number;
        private int salary;
        private int age;

        public Person(String surname, String name, String secondName, String position, String eMail, String number, int salary, int age) {
            this.surname = surname;
            this.name = name;
            this.secondName = secondName;
            this.position = position;
            this.eMail = eMail;
            this.number = number;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Surname: " + surname + "\nName: " + name + "\nSecondName: " + secondName + "\nPosition: " + position +
                    "\ne-Mail: " + eMail + "\nPhone Number: " + number + "\nSalary: " + salary + "\nAge: "
                    + age;
        }
    }
}
