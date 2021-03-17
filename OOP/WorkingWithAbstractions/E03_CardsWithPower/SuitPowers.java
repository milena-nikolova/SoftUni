package _01_workingWithAbstraction_E03_CardsWithPower;

public enum SuitPowers {

    CLUBS (0), DIAMONDS (13), HEARTS (26), SPADES (39);

    private int suitPower;

    SuitPowers(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}
