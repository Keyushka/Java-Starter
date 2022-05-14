package javaEssential.lessons.l1_oop.package1;

import javaEssential.lessons.l1_oop.package2.ExampleInPackage2;
import javaEssential.lessons.l1_oop.package2.Parent;

public class Main {
    public static void main(String[] args) {
        ExampleInPackage1 e1 = new ExampleInPackage1();
    //    System.out.println(e1.name1); //privet
        System.out.println(e1.name2); //package
        System.out.println(e1.name3); //protected
        System.out.println(e1.name4); //public
        ExampleInPackage2 e2 = new ExampleInPackage2();
    //    System.out.println(e2.name1); //privet
    //    System.out.println(e2.name2); //package
    //    System.out.println(e2.name3); //protected
        System.out.println(e2.name4); //public

        Parent p = new Parent();
    //    System.out.println(e2.name1); //privet
    //    System.out.println(e2.name2); //package
    //    System.out.println(e2.name3); //protected
        System.out.println(e2.name4); //public

    }
}
