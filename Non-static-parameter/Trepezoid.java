class Trepezoid
{
void area(double a,double b,double h)
{

double res= 0.5*a+b*h;
System.out.println(res);
}
public static void main(String[] args)
{
new Trepezoid().area(10,5,7);
}
}