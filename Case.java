/*Que.1)Write a program to accept choice from the user and display the output
	   1.Arithmetic operator
	   2.Logical Operator
	   3.Relational Operator
	   4.Bitwise Operator
	   5.Conditional Operator
	   6.Assignment Operator*/
package practical;
import java.util.Scanner;
public class Case 
{
	    public static void main(String[] args)
	 {
		int num1,num2,num3,choice,result;
		Scanner sc = new Scanner(System.in);        //Scanner class to take input from the user
		System.out.println("Enter your choice to perform operations=1.Arithmetic Operator 2.Logical Operator 3.Relational Operator 4.Bitwise Operator 5.Conditional Operator 6.Assignment Operator");
	    choice=sc.nextInt();
	    System.out.println("Enter value for num1 =");
	    num1=sc.nextInt();
	    System.out.println("Enter value for num2 =");
	    num2=sc.nextInt();
	    switch(choice)
	  {
	    case 1: //Arithmetic Operator                                   //condition for Arithmetic operator
	          result=num1+num2;
	          System.out.println("addititon of two numbers ="+result);
	          result=num1-num2;
	          System.out.println("subtraction of two numbers ="+result);
	          result=num1*num2;
	          System.out.println("multiplication of two numbers ="+result);
	          result=num1/num2;
	          System.out.println("divisionon of two numbers ="+result);
	          result=num1%num2;
	          System.out.println("mode of two numbers ="+result);
	          break;
	    case 2: //Logical Operator
		      System.out.println("Enter value of num1=");
		      System.out.println("Enter value of num2=");
		      System.out.println(num1>num2 && num2>num1);		 
		      System.out.println((num1>num2)||(num2>num1));	
		      System.out.println(!(num1>num2)&&(num2>num1));
		      break;
	    case 3: //Relational Operator                                                 //condition for Relational Operator
	          System.out.println("The result of num1 == num2 is " + (num1 == num2) );
	          System.out.println("The result of num1 != num2 is " + (num1 != num2) );
	          System.out.println("The result of num1 > num2 is " + (num1 > num2) );
	          System.out.println("The result of num1 < num2 is " + (num1 < num2) );
	          System.out.println("The result of num1 >= num2 is " + (num2 >= num1) );
	          System.out.println("The result of num1 <= num2 is " + (num2 <= num1) );
              break;
	    case 4: //Bitwise Operator							
	    	  result = (num1 & num2);              			                         //condition for Bitwise Operator
	    	  System.out.println("The result of (num1&num2) is: " + result);    
	    	  result = (num1 | num2);
	    	  System.out.println("The result of (num1|num2) is: " + result);		
	    	  result = (num1 ^ num2);
	    	  System.out.println("The result of (num1^num2) is: " + result);
	    	  break;
	    case 5: //Conditional Operator												//condition for Conditional  Operator
	    	  System.out.println("Enter value for num3 =");
		      num3=sc.nextInt();
	    	  System.out.println(num1>num2 && num1>num3 || num2<num3);  
	    	  System.out.println((num1<num3 || num2>num3) && num1<num2);
	          break;
	   case 6: //Assignment Operator												//condition for Assignment  Operator
		      System.out.println(" The result of num1 = " + num1); 
		      num1 += num2;
		      System.out.println(" The result of num1 num1 += num2 is : " + num1); 
		      num1 -= num2;
		      System.out.println(" The result of num1 num1 -= num2 is : " + num1); 
		      num1 *= num2;
		      System.out.println(" The result of num1 num1 *= num2 is : " + num1); 
		      num1 /= num2;
		      System.out.println(" The result of num1 num1 /= num2 is : " + num1); 		     
		      num1 %= num2;
		      System.out.println(" The result of num1 num1 %=num2 is : " + num1);
		      break;
	   default:
             System.out.println("Invalid choice!");
             break;
	  } 
	}
}