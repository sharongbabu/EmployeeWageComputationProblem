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




// employee daily wage

import java.util.*;
import java.util.Random;
public class EmployeeWage{
public static void main(String args[]){
int min =0;
int max=1;
int random_int = (int)(Math.random() * (max - min + 1) + min);
System.out.println(random_int);
if ( random_int > 0 ){
System.out.println("Employee is present");
int WagePerHr=20;
int FullDayHr=8;
int salary;
salary=  WagePerHr *  FullDayHr;
System.out.println(salary);
}
else
{
System.out.println("Employee is absent");
}
}
}





// Part time employee
import java.util.*;
import java.util.Random;
public class PartTime{
public static void main(String args[]){
int min =0;
int max=1;
int random_int = (int)(Math.random() * (max - min + 1) + min);
System.out.println(random_int);
if ( random_int > 0 ){
System.out.println("Employee is full day employee");
int WagePerHr=20;
int FullDayHr=10;
int salary;
salary=  WagePerHr *  FullDayHr;
System.out.println(salary);
}
else
{
int WagePerHr=20;
int PartDayHr=8;
int salary;
salary=  WagePerHr *  PartDayHr;
System.out.println(salary);

System.out.println("Employee is parttime employee");
}
}
}










