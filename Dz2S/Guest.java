package Dz2S;

public abstract class Guest implements GuestBehavior{
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();
}
