class Rectangle
{
int area()
{
int l=10;
int b=20;
int res=l*b;
return res;
}
}
class RecRunner
{
public static void main (String[] args)
{
Rectangle r=new Rectangle();
int x=r.area();
System.out.println(x);
}
}