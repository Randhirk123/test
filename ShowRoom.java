import java.util.*;
class ShowRoom
{
	
	public static void main(String[] arg)
	{
		int i=0;
		Factory bajaj=new Factory();
		ArrayList bikes=bajaj.order(7);
		Iterator itr=bikes.iterator();
		while(itr.hasNext())
		{
			Bike b=(Bike)itr.next();
			System.out.print(b.name());
			System.out.println(++i);
		}
	}
}