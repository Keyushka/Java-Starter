package javaEssential.lessons.l1_oop.lesson.models;

public class Main {
    public static void main(String[] args) {
        Account ac = new Account(1335L);
        Account ac2 = new Account(1335L);
        Person person = new Person("Vasiliy", "passport", 19, ac);
       // System.out.println(person.getAccount());
        Employee employee = new Employee("Stepan", "foreign passport", 25, ac2, "Operator");
        //person.print();
        //employee.print();

        Person[] people = new Person[2];
        people[0] = new Person("Poza", "passport", 69, ac);
        people[1] = new Employee("Poza", "passport", 69, ac2, "Director");
        for (int i = 0; i < people.length; i++) {
            people[i].print("");
        }
    }
}
