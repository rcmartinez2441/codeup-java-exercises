package oop.animals;

public class MarineAnimal {
    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltWater;
    private String name;

    public MarineAnimal(boolean canSwim, int length, int finCount, boolean isSaltWater, String name) {
        this.canSwim = canSwim;
        this.length = length;
        this.finCount = finCount;
        this.isSaltWater = isSaltWater;
        this.name = name;
    }

    public MarineAnimal(String name){
        setName(name);
    }

    public MarineAnimal () {
    }

    public boolean getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}