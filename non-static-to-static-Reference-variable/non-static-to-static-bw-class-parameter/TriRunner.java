class Tri
{
void area(double l,double b)
{

double res=0.5*l*b;



System.out.println(res);
}
}
class TriRunner
{

public static void main(String[] args)
{
Tri t=new Tri();
t.area(10,30);
}
}