Welcome to Employee Wage Computation Program


//Employee present

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


//case statement



import java.util.*;
import java.util.Random;
public class CaseStatament{
public static void main(String args[]){
int min =0;
int max=1;
int random_int = (int)(Math.random() * (max - min + 1) + min);
System.out.println(random_int);

int random_int1='0';
switch(random_int1){
  case '1':
    System.out.println("Employee is fulltime employee");
    int WagePerHr=20;
     int FullDayHr=10;
     int salary;
     salary=  WagePerHr *  FullDayHr;
     System.out.println(salary);
break;
 case '0':
  System.out.println("Employee is   in parttime job");
  int PerHr=20;
  int PartDayHr=8;
  int salary1;
  salary1=  PerHr *  PartDayHr;
  System.out.println(salary1);
break;

 default:

}
}
}





// Month wage
import java.util.Scanner;
public class MonthWage{
public static void main(String args[]){
Scanner days= new Scanner(System.in);
System.out.println("enter  number of working days he or she present");
int working_days = days.nextInt();
int WagePerHr=20;
int FullDayHr=10;
int salary;
int Totalworking_days=20;

if (working_days >= 20 )
{
salary=  WagePerHr *  FullDayHr * working_days;
System.out.println(salary);
}
else
{

System.out.println("Employee is doesnot complete 20 days");
}
}
}





