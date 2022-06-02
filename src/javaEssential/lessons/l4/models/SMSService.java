package javaEssential.lessons.l4.models;

public interface SMSService extends MMSService {
    void sendSMS();
    void checkNumbed();
    void checkTelecomRules();
    void connectToNetwork();
    void disconnectToNetwork();
}
