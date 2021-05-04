package Concrate;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService {
    @Override
    public void Sell(Customer customer, Game game, Campaign campaign) {
            System.out.println(game.getName() + " isimli oyun " + campaign.getName() + " isimli kampanya uygulanarak " + customer.getName() + " adlı kullanıcıya satışı gerçekleşti. " +
            "### İndirimli fiyat : " + (game.getPrice()-campaign.getDiscount()));
        }
    public void Sell(Customer customer, Game game) {
            System.out.println(game.getName() + " isimli oyun " + customer.getName() + " adlı kullanıcıya satışı gerçekleşti.");
    }
}
