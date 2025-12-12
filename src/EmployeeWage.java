import java.util.Scanner;

public class EmployeeWage {

    private static final int wagePerHour=20;
    public static int employeeWageCalculator(){
        Scanner scan=new Scanner(System.in);

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

}
