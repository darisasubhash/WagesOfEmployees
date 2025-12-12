public class EmployeeWages {
    private String company;
    private int wagePerHour;
    private int hourPerMonth;
    private int workingDays;
    public int totalWage;

    public EmployeeWages(String company, int wagePerHour, int hourPerMonth, int workingDays) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.hourPerMonth = hourPerMonth;
        this.workingDays = workingDays;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public void setHourPerMonth(int hourPerMonth) {
        this.hourPerMonth = hourPerMonth;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public String getCompany() {
        return company;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getHourPerMonth() {
        return hourPerMonth;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public static int singleEmployeeWage(int wagePerHour, int workingDays, int workingHours) {
        int totalHours = 0;
        int totalDays = 0;
        while (totalDays < workingDays && totalHours < workingHours) {
            totalDays++;
            int role = (int) Math.floor(Math.random() * 3);
            int workesHours = 0;
            switch (role) {
                case 1:
                    workesHours = 8;
                    break;
                case 2:
                    workesHours = 6;
                    break;
                default:
                    workesHours = 0;
                    break;
            }
            totalHours += workesHours;
        }
        int totalWage = totalHours * wagePerHour;
        return totalWage;
    }
}
