package javaEssential.lessons.l4.models;

public abstract class VipSMSSender extends SMSSender{

    public abstract void connectToNetwork();

    @Override
    public void disconnectToNetwork() {

    }
}
