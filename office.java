class office
{
private int rno;
private String Sname;
public void setstud(int no,String name)
{
rno=no;
Sname=name;
}
public void putstud()
{
System.out.println("Student regno:"+rno);
System.out.println("Student name:"+Sname);
}
}
class physical extends office
{
protected String gender;
public void setphy(String g)
{
gender=g;
}
public void putphy()
{
System.out.println("Gender:"+gender);
}
}
class test extends physical
{
private String grade;
public void setmark(String s)
{
grade=s;
}
public void putmark()
{
System.out.println("Grade:"+grade);
}
public static void main(String args[])
{
test T=new test();
T.setstud(101,"Harish");
T.setphy("Male");
T.setmark("A");
T.putstud();
T.putphy();
T.putmark();
} }