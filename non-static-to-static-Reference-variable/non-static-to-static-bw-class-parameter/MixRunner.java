class Mix
{
double area(double l,double b)
{
double res=l*b;
return res;
}

double area(double l,double b)
{
double res=l*b;
return res;
}

double area(double h,double b)
{
double area=0.5*h*b;
return res;
}

double area(double a)
{
double res=a*a;
return res;
}

double area(double r)
{
double pi=3.14;
double res=pi*r*r;
return res;
}

double area(double a,double b)
{
double pi=3.14;
double res=pi*a*b;
return res;
}

double area(double r,double t)
{
double pi=3.14;
double res=pi*r*r*t;
return res;
}

double area(double a,double b,double h)
{
double res=0.5*a+b*h;
return res;
}




}
class MixRunner
{
public static void main(String[] args)
{
Mix m=new Mix();
double x=m.area(10,20,30);
System.out.println(x);


}
}

