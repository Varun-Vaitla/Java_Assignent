class Sector
{
double area()
{
double  pi=3.14;
double t=10;
double r=15;
double res=pi*t*r*r;
return res;
}


}
	class SecRunner
	{
	
	
public static void main(String[] args)
{
Sector s=new Sector();
double x=s.area();
System.out.println(x);
}
}