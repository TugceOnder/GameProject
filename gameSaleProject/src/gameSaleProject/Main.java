package gameSaleProject;

import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager1 = new GamerManager(new MernisServiceAdapter());
		gamerManager1.add(new Gamer(1, "Tugce", "Onder",LocalDate.of(1996,2,1), "1111111111"));
		
		GamerManager gamerManager2 = new GamerManager(new MernisServiceAdapter());
		gamerManager2.add(new Gamer(2, "Tuna", "Onder",LocalDate.of(1986,3,30), "22222222222"));
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Need For Speed-Most Wanted",1000,5));
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Yılbaşı", 10));
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.sale(new Game(1,"Need For Speed-Most Wanted",1000,5),new Gamer(1, "Tugce", "Onder",LocalDate.of(1996,2,1)), "1111111111"));
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.campaignSale(new Game(1,"Need For Speed-Most Wanted",1000,5),new Gamer(2, "Tuna", "Onder",LocalDate.of(1986,3,30), "22222222222"),new Campaign(1, "Yılbaşı", 10));
		

}
}
