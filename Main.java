import Concrate.CampaignManager;
import Concrate.CustomerManager;
import Concrate.GameManager;
import Concrate.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Validators.MernisValidator;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Emre","FIRAT","1993","12345678901");
        Game game = new Game(1,"Counter Strike",100);
        Game game2 = new Game(2,"GTA Vice City",120);

        Campaign kampanya1 = new Campaign(1,"Eksi20TL","20 TL İndirim Kampanyası",20);

        CustomerManager customerManager = new CustomerManager(new MernisValidator());
        customerManager.add(customer1);
        System.out.println("**************************");
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(kampanya1);
        System.out.println("**************************");
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.add(game2);
        System.out.println("**************************");
        SalesManager salesManager = new SalesManager();
        salesManager.Sell(customer1,game);
        System.out.println("**************************");
        salesManager.Sell(customer1,game2,kampanya1);

    }
}
