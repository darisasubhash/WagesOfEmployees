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
        System.out.println("Enter 1/ Full day wage  2/ Part time wage");
        int entry=scan.nextInt();
        switch(entry){
            case 1:employeeWage();
            return;
            case 2:System.out.println("Part time wage of an employee is "+partTimeWages);
            return;
            default:System.out.println("Enter either 1 or 2");
            return;
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
}