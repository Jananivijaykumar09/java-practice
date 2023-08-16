class illegalMarkException extends Exception
{}
class Test
{
int mark;
public Test(int m)
{
mark=m;
}
void display()throws illegalMarkException
{
if((mark<0)||(mark>100)) throw new illegalMarkException();
System.out.println("Mark="+mark);
}
}
public class markTest
{
public static void main(String args[])
{
Test t=new Test(-10);
try
{
t.display();
}
catch(illegalMarkException e)
{
System.out.println("illegal Mark:caught in main");
}
}
}