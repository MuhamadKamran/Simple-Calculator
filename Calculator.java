import java.util.Scanner;
class Calculator{
public static void main(String[] args){
double a,b,c,d;
char op;
Scanner ob=new Scanner(System.in);
System.out.print("Enter Number 1: ");
a=ob.nextDouble();
Scanner bb=new Scanner(System.in);
System.out.print("Enter Number 2: ");
b=bb.nextDouble();
Scanner opp=new Scanner(System.in);
System.out.print("Enter Operator: ");
op=opp.next().charAt(0); 
switch(op)
{
 case '+':
     {c=a+b;
     System.out.println("Anser of   "  +a+ "  + " +b+ " is " +c);
     break;}
 case '-':
     {c=a-b;
      System.out.println("Anser of  " +a+  " - "  +b+ " is "+c);
     break;}
 case '*':
     {c=a*b;
      System.out.println("Anser of  " +a+  " * "  +b+ " is "+c);
      break;}
 case '/':
       {c=a/b;
        System.out.println("Anser of  "  +a+  " / "  +b+  " is " +c);
        break;}
 case '%':
       {d=a%b;
        System.out.println("Anser of  "  +a+  " % "  +b+  " is "  +d);
        break;}  
default:
 System.out.println("Sorry wrong input");}}}
