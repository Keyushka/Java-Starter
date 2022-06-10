package javaEssential.lessons.l4_abstraction.abs_abstraction.ex005_abstraction;

public class ConcreteDerivedClass extends AbstractBaseClass {
    // ���� �� �� ������������� �����, �� ����� ����������� ����� �� �������� ������.

    // public void simpleMethod() {
    //     System.out.println("ConcreteDerivedClass.simpleMethod");
    // }

    // ��������� ����������� ����� abstractMethod() �������� ������������ ������.
    @Override
    public void abstractMethod() {
        System.out.println("ConcreteDerivedClass.abstractMethod();");
    }
}
