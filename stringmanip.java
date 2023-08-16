import java.io.DataInputStream;
class stringmanip
{
public static void main(String args[ ])
{
String s1="", s2="";
DataInputStream inp=new DataInputStream(System.in);
try
{
System.out.println("enter two strings");
s1=inp.readLine();
s2=inp.readLine();
}
catch(Exception e)
{}
System.out.println("The length of string1 is"+s1.length());
System.out.println("The length of string2 is"+s2.length());
if(s1.equals(s2))
System.out.println("strings are same");
else
System.out.println("strings are not same");
System.out.println("The concatenation of 2 strings is"+s1.concat(s2));
System.out.println("first character of string1 is"+s1.charAt(0));
System.out.println("first character of string2 is"+s2.charAt(0));
System.out.println("Uppercase of string1 is"+s1.toUpperCase());
System.out.println("Uppercase of string2 is"+s2.toUpperCase());
}
}