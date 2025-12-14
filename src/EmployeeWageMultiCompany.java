public class EmployeeWageMultiCompany {

    static class CompanyEmpWage {

        String company;
        int wagePerHour;
        int maxWorkingDays;
        int maxWorkingHours;
        int totalWage;

        CompanyEmpWage(String company, int wagePerHour,
                       int maxWorkingDays, int maxWorkingHours) {
            this.company = company;
            this.wagePerHour = wagePerHour;
            this.maxWorkingDays = maxWorkingDays;
            this.maxWorkingHours = maxWorkingHours;
        }
    }

    static class EmpWageBuilder {

        private CompanyEmpWage[] companies;
        private int companyCount;

        EmpWageBuilder(int size) {
            companies = new CompanyEmpWage[size];
            companyCount = 0;
        }

        void addCompany(String company, int wagePerHour,
                        int days, int hours) {

            companies[companyCount++] =
                    new CompanyEmpWage(company, wagePerHour, days, hours);
        }

        void computeEmpWages() {
            for (int i = 0; i < companyCount; i++) {
                computeEmpWage(companies[i]);
            }
        }

        private void computeEmpWage(CompanyEmpWage company) {

            int totalHours = 0;
            int totalDays = 0;

            while (totalDays < company.maxWorkingDays &&
                    totalHours < company.maxWorkingHours) {

                totalDays++;
                int empType = (int) (Math.random() * 3);
                int workHours;

                switch (empType) {
                    case 1: workHours = 8; break;
                    case 2: workHours = 6; break;
                    default: workHours = 0;
                }

                totalHours += workHours;
            }

            company.totalWage = totalHours * company.wagePerHour;

            System.out.println(company.company +
                    " Total Wage: " + company.totalWage);
        }
    }
}
