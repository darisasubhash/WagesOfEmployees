import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello and welcome to Employee Wage Management System");
        Random rand=new Random();
        boolean isPresent= rand.nextBoolean();
        if(isPresent){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
        employeeWage();
        int partTimeWages=partTimeWage();
        System.out.println("Part time wage of an employee is "+partTimeWages);
        int totalwage = monthlyWage();
        System.out.println("Employee wage for one month is "+totalwage);


        System.out.println("Employee wage calculate by the company"+(employeeWageByCompany("tcs",20,20,100)));

        System.out.println(EmployeeWage.employeeWageCalculator());

        System.out.println(("Enter the employess in affice"));
        int empCount=scan.nextInt();
        int totalWageofCompany=0;
        while(empCount>0){
             totalWageofCompany=totalWageofCompany+EmployeeWages.singleEmployeeWage(scan.nextInt(),scan.nextInt(),scan.nextInt());
        }
        System.out.println("Total Company Wages "+totalWageofCompany);




        int wageOnCondition=calculatingWageByCondition();
        System.out.println("Employee salary basing on condition is "+wageOnCondition);
        System.out.println("Enter 1/ Full day wage  2/ Part time wage");
        int entry=scan.nextInt();
        switch(entry){
            case 1:employeeWage();
            break;
            case 2:System.out.println("Part time wage of an employee is "+partTimeWages);
            break;
            default:System.out.println("Enter either 1 or 2");
            break;
        }



    }
    public static void employeeWage(){
        int wagePerHour=20;
        int fullDayHours=8;
        System.out.println("Employee wage is "+wagePerHour*fullDayHours);
    }
    public static int partTimeWage(){
        int wagePerHour=20;
        int workHours=6;
        return wagePerHour*workHours;
    }
    public static int monthlyWage(){
        int workingDays=20;
        int wagePerHour=20;
        int fullDayHours=8;
        return workingDays*wagePerHour*fullDayHours;
    }
    public static int calculatingWageByCondition()
    {
        Scanner scan=new Scanner(System.in);
        int wagePerHour=20;
        System.out.println("Enter the hours you want to calculate ");
        int hours=scan.nextInt();
        System.out.println("Enter the days you want to calculate ");
        int days=scan.nextInt();
        int wages=0;
        if(days<=20 || hours<=100){
            if(days<=20){
                wages=days*8*wagePerHour;
            }
            else{
                wages=hours*wagePerHour;
            }
        }
        else if(hours>100){
            wages=100*wagePerHour;
        }
        else if (days>20) {
            wages=20*8*wagePerHour;

        }
        return wages;
    }
    public static int employeeWageByCompany(String company,int wagePerHour,int workingDays,int workingHours){
        int totalHours=0;
        int totalDays=0;
        while(totalDays <workingDays && totalHours<workingHours){
            totalDays++;
            int role=(int)Math.floor(Math.random()*3);
            int workesHours=0;
            switch(role){
                case 1:workesHours=8;
                break;
                case 2:workesHours=6;
                break;
                default:workesHours=0;
                break;
            }
            totalHours+=workesHours;
        }
        int totalWage=totalHours*wagePerHour;
        return totalWage;
    }
}