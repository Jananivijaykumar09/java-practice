class Room
{
double len, bth;
Room(double a, double b)
{ len=a;
bth=b;
}
double area()
{
return(len*bth);
}
}
class Hall extends Room
{
double ht;
Hall(double a, double b, double c)
{ super(a,b);
ht=c;
}
double volume()
{
return(len*bth*ht);
}
}
class Roomareavolume
{
public static void main(String args[])
{
Hall t =new Hall(12.5,10.5,13.5);
System.out.println(" Area = " +t.area());
System.out.println(" Volume = " +t.volume());
}
}