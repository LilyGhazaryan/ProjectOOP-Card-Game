public abstract class Card {
    //attributes that every card is going to have
    private String name;
    private int cost;
    private int health;
    private int attack;

    //constructor which will be inherited
    public Card(String name, int cost, int health, int attack) {
        this.name = name;
        this.cost = cost;
        this.health = cost;
        this.attack = attack;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void attackAction(Card card) {

    }

    public void attackAction(Player player) {

    }




}
