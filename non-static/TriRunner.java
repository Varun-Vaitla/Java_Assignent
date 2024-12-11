class Tri
{
double area(int h,int b)
{
double res=0.5*h*b;

return res;
}
}
class TriRunner
{
public static void main(String[] args)
{
double x=new Tri().area(5,5);
System.out.println(x);
}
}