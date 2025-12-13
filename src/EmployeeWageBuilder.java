public class EmployeeWageBuilder {

    // Instance variables (company-specific)
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    // Constructor
    public EmployeeWageBuilder(String company, int wagePerHour,
                          int maxWorkingDays, int maxWorkingHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Compute wage and SAVE it in instance variable
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
                    workHours = 8; // Full-time
                    break;
                case 2:
                    workHours = 6; // Part-time
                    break;
                default:
                    workHours = 0; // Absent
            }

            totalHours += workHours;
        }

        // Save total wage
        totalWage = totalHours * wagePerHour;
    }

    // Getter
    public int getTotalWage() {
        return totalWage;
    }

    public String getCompany() {
        return company;
    }
}