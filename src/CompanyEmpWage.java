public interface CompanyEmpWage {

    void addCompany(String name, EmployeeWageBuilder empWageBuilder);

    EmployeeWageBuilder removeCompany(String name);

    EmployeeWageBuilder getCompany(String name);


}
