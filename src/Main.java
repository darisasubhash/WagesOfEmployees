import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
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

    }
    public static void employeeWage(){
        int wagePerHour=20;
        int fullDayHours=8;
        System.out.println("Employee wage is "+wagePerHour*fullDayHours);
    }
}