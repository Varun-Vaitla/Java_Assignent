class Square
{
void area(int a)
{


int res=a*a;
System.out.println(res);
}
}
class SquRunner
{
public static void main(String[] args)
{
Square s=new Square();
s.area(5);
}
}