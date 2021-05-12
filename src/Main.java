
public class Main {
private BaseLogger logger;
	
	public void GamerManager(BaseLogger logger)
	{
		this.logger = logger;
	}
	public void add()
	{
		System.out.println("Gamer Logged");
		this.logger.log("Tugce " ,"onder ", 1996 , " " , 12329234); 

	}
	public void delete()
	{
		System.out.println("Gamer Deleted");
		this.logger.log("Tugce " ,"onder ", 1996 , " " , 12329234); 

	}
}
