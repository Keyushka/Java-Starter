package javaEssential.lessons.l4_abstraction.models;

public abstract class VipSMSSender extends SMSSender{

    public abstract void connectToNetwork();

    @Override
    public void disconnectToNetwork() {

    }
}
