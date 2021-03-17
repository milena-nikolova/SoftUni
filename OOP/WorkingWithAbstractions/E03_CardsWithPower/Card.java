package _01_workingWithAbstraction_E03_CardsWithPower;

public class Card {

    private RankPowers rankNum;
    private SuitPowers suitColor;
    private int power;

    public Card(RankPowers rankNum, SuitPowers suitColor) {
        this.rankNum = rankNum;
        this.suitColor = suitColor;
        // The power of a card is calculated by adding
        // the power of its rank plus the power of its suit.
        this.power = rankNum.getRankPower() + suitColor.getSuitPower();

    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d" ,
                this.rankNum, this.suitColor, this.power);

    }
}
