class Parallelogram
{
int area()
{
int l=10;
int b=20;
int res=l*b;
return res;
}
}
class ParaRunner
{
public static void main(String[] args)
{
Parallelogram p=new Parallelogram();
int x=p.area();
System.out.println(x);
}
}