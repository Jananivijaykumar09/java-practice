class Parent
{
void display()
{
System.out.println("parent method is executed");
}
}
class Child extends Parent
{
void display()
{
System.out.println("child method is executed");
}
}
public class MainClass
{
public static void main(String args[])
{
Parent c = new Child();
c.display();
Parent d = new Parent();
d.display();
}
}