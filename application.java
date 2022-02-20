Package com.company; 
Import java.util.Scanner;

 Public class Main {

 Public static void main (String [] args) { 

Scanner input = new Scanner (System.in);

 System.out.print ("Enter two numbers ");

 double a , b;

 a = input.nextInt ();

 b = input.nextInt ();

 System.out.print ("Enter operator, (+, -, /, *) ");

 Char operator = input. Next ().char At (0);

 System.out.print (a + ““+operator+ " " + b + " = "); 

Switch (operator)
 {
 Case '+' -> System.out.println (a + b);

 Case '-' -> System.out.println (a - b)
 ;
 Case '/' -> {System.out.println (a / b);

 If (a > b)

 System.out.println ("The remainder was” + a % b); 
 {
        Case '*' -> System.out.println (a * b);
Default -> System.out.println ("Wrong input detected. ");
 } 
}

