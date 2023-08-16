class employee
{
int empid;
String empname,empaddress;
void personal()
{
 System.out.println("Employee id:"+empid);
 System.out.println("Employee Name:"+empname);
 System.out.println("Employee address:"+empaddress);
}
}
class emp extends employee
{
String desig,dept;
void depart()
{
System.out.println("Employee Designation:"+desig);
System.out.println("Employee Department:"+dept);
}
}
interface deduction
{
 int pf=1000;
 }
class salary extends emp implements deduction
{
int gross,basic,hra,ta,da;
void calc()
{
System.out.println("Employee Basicpay:"+basic);
System.out.println("Employee HRA:"+hra);
System.out.println("Employee TA:"+ta);
System.out.println("Employee DA:"+da);
gross=(basic+hra+ta+da)-pf;
System.out.println("Employee Gross Salary:"+gross);
}
}
class payslip
{
public static void main(String args[])
{
salary s=new salary();
s.empid=Integer.parseInt(args[0]);
s.empname=args[1];
s.empaddress=args[2];
s.desig=args[3];
s.dept=args[4];
s.basic=Integer.parseInt(args[5]);
s.hra=Integer.parseInt(args[6]);
s.ta=Integer.parseInt(args[7]);
s.da=Integer.parseInt(args[8]);
 s.personal();
s.depart();
s.calc(); } }