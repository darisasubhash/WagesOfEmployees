import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder {

    
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    
    public EmployeeWageBuilder(String company, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    
    public void computeEmpWage() {

        int totalHours = 0;
        int totalDays = 0;

        while (totalDays < maxWorkingDays &&
                totalHours < maxWorkingHours) {

            totalDays++;
            int empType = (int) (Math.random() * 3);
            int workHours;

            switch (empType) {
                case 1:
                    workHours = 8; 
                    break;
                case 2:
                    workHours = 6; 
                    break;
                default:
                    workHours = 0; 
            }

            totalHours += workHours;
        }

        
        totalWage = totalHours * wagePerHour;
    }

    
    public int getTotalWage() {
        return totalWage;
    }

    public String getCompany() {
        return company;
    }
}