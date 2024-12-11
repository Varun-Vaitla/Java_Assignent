class Circle
{
static void area(double r)
{
final double pi=3.14;
double res=pi*r*r;
System.out.println(res);
}
}
class CircleRunner
{
public static void main(String[] args)
{
Circle.area(3.5);
}
}

