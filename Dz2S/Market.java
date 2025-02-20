package Dz2S;

import java.util.*;


public class Market implements MarketBehavior, QueueBehaviour{
    List<Guest> actors = new LinkedList<>();
    Queue<Guest> actorsQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Guest actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor);
    }

        @Override
    public void takeInQueue(Guest actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void releaseFromMarket(Guest actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " покинул магазин");
    }

    @Override
    public void update() {
    }
}
