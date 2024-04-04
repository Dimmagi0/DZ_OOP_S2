package Dz2S;

public interface QueueBehaviour {
    void takeInQueue(Guest actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
