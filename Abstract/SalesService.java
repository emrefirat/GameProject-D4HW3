package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SalesService {
    void Sell(Customer customer, Game game, Campaign campaign);

}
