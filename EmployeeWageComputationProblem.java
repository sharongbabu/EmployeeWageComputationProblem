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




//Total Month Wage

import java.util.Scanner;
public class MonthTotalWage{
public static void main(String args[]){
Scanner days= new Scanner(System.in);
Scanner hours= new Scanner(System.in);

System.out.println("enter  number of working days he or she present");
int working_days = days.nextInt();

System.out.println("enter total working hours he or she worked in a month");
int totalworkinghours = hours.nextInt();



int WagePerHr=20;
int FullDayHr=10;
int salary;
int Totalworking_days=20;
int TotalWorkingHours=100;
if (working_days >= 20 && totalworkinghours>=100 )
{
salary=  WagePerHr *  FullDayHr * working_days* totalworkinghours;
System.out.println(salary);
}
else
{

System.out.println("Employee is doesnot complete 20 days and 100 hours");
}
}
}





// refactor the code 

public class Company{

public void employeeWage( int wagePerHr){
System.out.println("Full day wage:" +wagePerHr);
}
public void hours( int workingHour){
System.out.println(" Full day workingHour:" +workingHour);
}
public void days( int workingDays){
System.out.println(" Full day workingdays:" +workingDays);
}
public void partTimeHours( int workingHours){
System.out.println(" Partime hour:" +workingHours);
}
public void partTimeWage( int workingWage){
System.out.println(" Parttime wage:" +workingWage);
}
public void partTimeDays( int workingDay){
System.out.println("Parttime working days:" +workingDay);
}


public void Salary(int workingHour, int wagePerHr,int workingDays){
 int salary= wagePerHr * workingHour * workingDays;
System.out.println("The salary of full day employee:" +salary);
}
public void Salary1(int workingHours, int workingWage,int workingDay){
 int salaryPartTime= workingWage * workingHours * workingDay;
System.out.println("The salary of parttime employee:" +salaryPartTime);
}


public static void main(String[] args){
Company newCompany = new Company();
newCompany.hours(8);
newCompany.employeeWage(20);
newCompany.days(20);
newCompany.partTimeHours(4);
newCompany.partTimeWage(10);
newCompany.partTimeDays(15);

newCompany.Salary(8,20,20);
newCompany.Salary1(4,10,15);


}
}








public class Companies{

public void employeeWage( int wagePerHr){
System.out.println("Full day wage:" +wagePerHr);
}
public void hours( int workingHour){
System.out.println(" Full day workingHour:" +workingHour);
}
public void days( int workingDays){
System.out.println(" Full day workingdays:" +workingDays);
}
public void partTimeHours( int workingHours){
System.out.println(" Partime hour:" +workingHours);
}
public void partTimeWage( int workingWage){
System.out.println(" Parttime wage:" +workingWage);
}
public void partTimeDays( int workingDay){
System.out.println("Parttime working days:" +workingDay);
}
}
class Intel extends Companies{
public void Salary(int workingHour, int wagePerHr,int workingDays){
 int salary= wagePerHr * workingHour * workingDays;
System.out.println("The salary of full day employee in intel:" +salary);
}
public void Salary1(int workingHours, int workingWage,int workingDay){
 int salaryPartTime= workingWage * workingHours * workingDay;
System.out.println("The salary of parttime employee in intel:" +salaryPartTime);
}
}
class Wipro extends Companies{
public void Salary(int workingHour, int wagePerHr,int workingDays){
 int salary= wagePerHr * workingHour * workingDays;
System.out.println("The salary of full day employee in Wipro:" +salary);
}
public void Salary1(int workingHours, int workingWage,int workingDay){
 int salaryPartTime= workingWage * workingHours * workingDay;
System.out.println("The salary of parttime employee in Wipro:" +salaryPartTime);
}
}
class Tcs extends Companies{
public void Salary(int workingHour, int wagePerHr,int workingDays){
 int salary= wagePerHr * workingHour * workingDays;
System.out.println("The salary of full day employee Tcs:" +salary);
}
public void Salary1(int workingHours, int workingWage,int workingDay){
 int salaryPartTime= workingWage * workingHours * workingDay;
System.out.println("The salary of parttime employee Tcs:" +salaryPartTime);

}
}
class Main{
public static void main(String[] args){
Company newCompany = new Company();
newCompany.hours(8);
newCompany.employeeWage(20);
newCompany.days(20);
newCompany.partTimeHours(4);
newCompany.partTimeWage(10);
newCompany.partTimeDays(15);

newCompany.Salary(8,20,20);
newCompany.Salary1(4,10,15);

Company newCompany1 = new Company();
newCompany1.hours(10);
newCompany1.employeeWage(25);
newCompany1.days(22);
newCompany1.partTimeHours(8);
newCompany1.partTimeWage(18);
newCompany1.partTimeDays(16);

newCompany1.Salary(10,25,22);
newCompany1.Salary1(8,18,16);

Company newCompany2 = new Company();
newCompany2.hours(15);
newCompany2.employeeWage(30);
newCompany2.days(25);
newCompany2.partTimeHours(7);
newCompany2.partTimeWage(14);
newCompany2.partTimeDays(12);

newCompany2.Salary(15,30,25);
newCompany2.Salary1(7,14,12);



}
}












