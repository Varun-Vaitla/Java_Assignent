class Circle
{
void area(double r)
{
final double pi=3.14;
double res= pi*r*r;
System.out.println(res);
}
public static void main(String[] args)
{
new Circle().area(10);
}
}