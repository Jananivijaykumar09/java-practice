class ArithExec
{
public static void main(String args[])
{
int a=10;
int b=0;
try
{
a=a/b;
System.out.println("a=" +a);
}
catch(ArithmeticException e)
{
System.out.println("Division by zero error");
System.out.println("Please change the b values");
}
System.out.println("Quit");
}
}