class Triangle
{
void area(int h,int b)
{
double res= 0.5*h*b;
System.out.println(res);
}
public static void main(String[] args)
{
new Triangle().area(10,5);
}
}