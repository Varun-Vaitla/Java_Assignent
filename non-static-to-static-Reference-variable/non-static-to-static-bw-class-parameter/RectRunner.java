class Recta
{
void area(int l,int b)
{

int res=l*b;
System.out.println(res);
}
}
class RectRunner
{
public static void main(String[] args)
{
Recta r=new Recta();
r.area(10,5);
}
}