package javaEssential.lessons.l6.anonymyos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(0110, "Vova", "Mishel"));
        users.add(new User(0111, "Angela", "Merkel"));
        users.add(new User(0112, "Emanuel", "Macron"){
                    @Override
                    public void print() {
                        System.out.println("I am super user");
                    }

                    public void newMethod() {
                        System.out.println("New method()");
                    }
                }
        );
        for (User u : users) {
            u.print();
        }

       // users.get(2).newMethod();
    }
}
