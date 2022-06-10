package javaEssential.lessons.l4_abstraction.models;

public abstract class SMSSender {
    public void sendSMS() {
        System.out.println("Отправляю смс...");
    }

    public void checkNumber() {
        System.out.println("Проверяю номер...");
    }

    public void checkTelecomRules() {
        System.out.println("Проверяю законность...");
    }

    public abstract void connectToNetwork();
    public abstract void disconnectToNetwork();
}
