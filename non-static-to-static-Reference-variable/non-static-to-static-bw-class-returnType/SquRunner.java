class Square
{
int area()
{
int a=10;
int res=a*a;
return res;
}
}
class SquRunner
{
public static void main(String[] args)
{
Square s=new Square();
int x=s.area();
System.out.println(x);
}
}
