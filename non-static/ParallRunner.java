class Parall
{
int area(int l,int b)
{
int res=l*b;

return res;
}
}
class ParallRunner
{
public static void main(String[] args)
{
int x=new Parall().area(5,5);
System.out.println(x);
}
}