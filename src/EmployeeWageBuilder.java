public class EmployeeWageBuilder {
    public static int employeeWageByCompany(int wagePerHour, int workingDays, int workingHours) {
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
