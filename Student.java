public class Student
{
public Student()
{
System.out.println("Default Constructor");
System.out.println("Hello Student ");
}
public Student(String name)
{
System.out.println("\n Single Parameterized Constructor");
System.out.println("Student name is " + name+"");
}
public Student(String name, int marks)
{
System.out.println("\n Two Parameterized Constructor");
System.out.println("Student name is " + name + " and marks are " +
marks);
}
public static void main(String args[])
{
Student std1 = new Student();
Student std2 = new Student();
Student std3 = new Student("Vijaya Kumar", 35);
}
}