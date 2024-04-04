package Dz2S;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Max";

        Market market = new Market();

        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();
    }
}
