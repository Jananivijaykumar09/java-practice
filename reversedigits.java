import java.io.DataInputStream;
class reversedigits
{
public static void main(String args[ ])
{
int n=0,n1,sum=0;
DataInputStream inp=new DataInputStream(System.in);
try
{
System.out.println("enter an integer value");
n=Integer.parseInt(inp.readLine( ));
}
catch(Exception e)
{ }
while(n>0)
{ n1=n%10;
n=n/10;
sum=(sum*10)+n1;
}
System.out.println("Reverse the digits is " +sum);
}
} 