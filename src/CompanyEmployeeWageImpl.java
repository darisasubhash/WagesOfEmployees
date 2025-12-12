import java.util.ArrayList;
import java.util.List;

public class CompanyEmployeeWageImpl implements CompanyEmpWage {


    private List<EmployeeWageBuilder> companies;

    public void CompanyEmpWageImpl() {
        companies = new ArrayList<>();
    }

    @Override
    public EmployeeWageBuilder addCompany(String name,EmployeeWageBuilder empWageBuilder) {
        Employee.setName(name);
        companies.add(empWageBuilder);
        return empWageBuilder;
    }

    @Override
    public EmployeeWageBuilder removeCompany(String name) {
        EmployeeWageBuilder empWageBuilder = getCompany(name);
        if(companies.remove(empWageBuilder))
            return empWageBuilder;
        else
            return null;
    }

    @Override
    public EmployeeWageBuilder getCompany(String name) {
        for (EmployeeWageBuilder empWageBuilder : companies) {
            if(Employee.getName().equalsIgnoreCase(name)){
                return empWageBuilder;
            }
        }
        return null;
    }
}
