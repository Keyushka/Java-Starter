package javaEssential.lessons.l4_abstraction.models;

public interface SMSService extends MMSService {
    void sendSMS();
    void checkNumbed();
    void checkTelecomRules();
    void connectToNetwork();
    void disconnectToNetwork();
}
