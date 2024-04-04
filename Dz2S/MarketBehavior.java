package Dz2S;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Guest actor);
    void releaseFromMarket(Guest actor);
    void update();
}
