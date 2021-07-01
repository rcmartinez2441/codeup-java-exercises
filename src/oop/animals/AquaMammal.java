package oop.animals;

public class AquaMammal extends MarineAnimal {

    private int maxTimeSubmerged;

    public AquaMammal(boolean canSwim, int length, int finCount, boolean isSaltWater, String name, int maxTimeSubmerged) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.maxTimeSubmerged = maxTimeSubmerged;
    }

    public AquaMammal(String name) {
        super(name);
    }

    public AquaMammal () {
        super();
    }

    public int getMaxTimeSubmerged() {
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged) {
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
}