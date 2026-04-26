package CabProject;

public class Mini extends Cab
{
	String driver;
	long phno;
	String carModel;
	String carNum;
	int seats;
	double rating;
	double cost;

	
	public Mini(String pl, String dl,String driver,long phno,String carModel,String carNum,	int seats,	double rating,	double cost)
	
	{
		super(pl,dl);
		this.driver= driver;
		this.phno=  phno;
		this.carModel= carModel;
		this.carNum =  carNum;
		this.seats= seats;
		this.rating =  rating;
		this.cost= cost;
	}
}
