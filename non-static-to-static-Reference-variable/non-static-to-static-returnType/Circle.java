class Circle
{
double area()
{
double  pi=3.14;
double r=10;
double res=pi*r*r;
return res;
}
public static void main(String[] args)
{
Circle c=new Circle();
double x=c.area();
System.out.println(x);
}
}
