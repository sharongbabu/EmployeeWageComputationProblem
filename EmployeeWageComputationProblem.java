Welcome to Employee Wage Computation Program



import java.util.*;
import java.util.Random;
public class EmployeeWageComputation{
public static void main(String args[]){
int min =0;
int max=1;
int random_int = (int)(Math.random() * (max - min + 1) + min);
System.out.println(random_int);
if ( random_int > 0 ){
System.out.println("Employee is present");
}
else
{
System.out.println("Employee is absent");
}
}
}





