class Square
{
int area(int a)
{
int res=a*a;

return res;
}
}
class SquareRunner
{
public static void main(String[] args)
{
int x=new Square().area(5);
System.out.println(x);
}
}