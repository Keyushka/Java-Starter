package javaEssential.lessons.l2_classes_and_objects.lesson.models;

public class Velo {
    private String type;
    private int currentSpeed;
    public Velo(String type, int currentSpeed){
        this.type = type;
        this.currentSpeed = currentSpeed;
    }
    public int speedUp(int speed) {
        int currentSpeed = 10;
        int totalSpeed = this.currentSpeed + speed;
        return totalSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
