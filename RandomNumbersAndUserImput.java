
import java.io.*;
import java.util.*;

//challenge 1
public class RandomNumbersAndUserImput{
public static void main(String args[]){

Scanner myscanner = new Scanner(System.in);
System.out.println("type a negative number");
int negative = myscanner.nextInt();

System.out.println("type a positive number");
int positive = myscanner.nextInt();

System.out.println((int)(Math.random()* (positive - negative) + negative));


//challenge 2

Scanner myscanner2 = new Scanner( System.in);
System.out.println("positive whole number");
int age = myscanner2.nextInt();
System.out.println("positive whole number");
int days = myscanner2.nextInt();
System.out.println("any number");
Double grade = myscanner2.nextDouble();
Scanner myscanner3 = new Scanner(System.in);
System.out.println("adjective");
String feeling = myscanner3.nextLine();
System.out.println("adjective");
String feeling2 =  myscanner3.nextLine();



System.out.println("Hello everyone! I am " + age +" years old and I just got a " + grade +" percent on my math test. It made me feel " + feeling + ". When I got home I told my parents about my grade and they looked " + feeling2 +". So hopefully I don't get in trouble for more then " + days + " days.");
}
}