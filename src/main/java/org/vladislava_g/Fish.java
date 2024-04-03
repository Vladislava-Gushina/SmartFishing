package org.vladislava_g;

public class Fish {
    private String nameFish;
    private int maxSpeed;
    private int lengthFish;

    public Fish(String nameFish, int maxSpeed, int lengthFish) {
        this.nameFish = nameFish;
        this.maxSpeed = maxSpeed;
        this.lengthFish = lengthFish;
    }

    public String getNameFish() {
        return nameFish;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getLengthFish() {
        return lengthFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLengthFish(int lengthFish) {
        this.lengthFish = lengthFish;
    }

    @Override
    public String toString() {
        return "Наименование: " + getNameFish() + ", длина (в сантиметрах): " + getLengthFish() + ", скорость( км/ч ): " + getMaxSpeed();
    }
}
