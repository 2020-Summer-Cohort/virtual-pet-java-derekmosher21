package virtual_pet;

public class VirtualPet {
    private int hunger = 8;
    private int thirst = 8;
    private int happiness = 8;
    private int energy = 8;

    int getHunger() {
        return hunger;
    }

    int getThirst() {
        return thirst;
    }

    int getHappiness() {
        return happiness;
    }

    int getEnergy() {
        return energy;
    }

    void feedCat() {
        hunger = hunger - 4;
    }

    void waterCat() {
        thirst = thirst - 4;
    }

    void playWithCat() {
        happiness = happiness + 3;
    }

    void putCatToBed() {
        energy = energy + 3;
    }

    void doNothing() {

    }

    void tick() {
        hunger = hunger + 1;
        thirst = thirst + 1;
        happiness = happiness - 1;
        energy = energy - 1;
    }

}
