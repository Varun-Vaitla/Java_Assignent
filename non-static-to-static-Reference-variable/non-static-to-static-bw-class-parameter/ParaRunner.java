class Parallelogram
{
void area(int l,int b)
{

int res=l*b;
System.out.println(res);
}
}
class ParaRunner
{
public static void main(String[] args)
{
Parallelogram p=new Parallelogram();
p.area(10,5);
}
}