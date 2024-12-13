class Trepe
{
void area(double a,double b,double h)
{

double res=0.5*a+b*h;
System.out.println(res);
}
public static void main(String[] args)
{
Trepe s=new Trepe();
s.area(30,5,20);
}
}