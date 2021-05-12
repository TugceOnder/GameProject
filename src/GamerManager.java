
public class GamerManager {
private BaseLogger logger;
	
	public GamerManager(BaseLogger logger)
	{
		this.logger = logger;
	}
	public void add()
	{
		System.out.println("Gamer Logged");
		this.logger.log("Emirhan " ,"Unal ", 2004 , " " , 12329234); 

	}
	public void delete()
	{
		System.out.println("Gamer Deleted");
		this.logger.log("Emirhan " ,"Unal ", 2004 , " " , 12329234); 

	}
}
