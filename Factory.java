import java.util.*;
class Factory
{
	ArrayList order(int items)
	{
		ArrayList a=new ArrayList();
		for(int i=0; i<items; i++)
		{
			Bike b=new Bike();
			b.name();
			a.add(b);
		}
		return a;
	}
}