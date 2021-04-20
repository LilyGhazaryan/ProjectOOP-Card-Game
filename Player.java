import java.util.ArrayList;

public class Player {
    //general attributes for both players
    private String name;
    private int health;
    private int crystals;
    //cards in the hand of a player that can be played, you get a new card every round by taking a card from the deck
    private ArrayList<Card> cardsInHand;


    public Player(String name, int health, int crystals, ArrayList<Card> cardsInHand) {
        this.name = name;
        this.health = health;
        this.crystals = crystals;
        this.cardsInHand = cardsInHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public int getCrystals() {
        return crystals;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void addToCardsInHand(Card card) {
        cardsInHand.add(card);
    }

    public void addCrystal() {
        if(crystals < 10) {crystals++;}
    }





}
