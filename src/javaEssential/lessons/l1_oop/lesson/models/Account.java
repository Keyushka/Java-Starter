package javaEssential.lessons.l1_oop.lesson.models;

public class Account {
    private long id;

    public Account(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                '}';
    }
}
