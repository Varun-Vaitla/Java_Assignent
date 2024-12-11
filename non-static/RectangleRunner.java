class Rectangle
{
int area(int l,int b)
{
int res=l*b;

return res;
}
}
class RectangleRunner
{
public static void main(String[] args)
{
int x=new Rectangle().area(5,5);
System.out.println(x);
}
}