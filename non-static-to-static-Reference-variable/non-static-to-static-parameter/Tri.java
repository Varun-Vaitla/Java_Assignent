class Tri
{
void area(double h,double b)
{

double res=0.5*h*b;
System.out.println(res);
}
public static void main(String[] args)
{
Tri t=new Tri();
t.area(10,20);
}
}