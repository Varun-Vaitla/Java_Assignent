class Triangle
{
double area()
{
double  h=10;
double b=10;
double res=0.5*h*b;
return res;
}
public static void main(String[] args)
{
Triangle t=new Triangle();
double x=t.area();
System.out.println(x);
}
}
