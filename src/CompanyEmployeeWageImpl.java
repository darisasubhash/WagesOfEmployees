import java.util.ArrayList;
import java.util.List;

public class CompanyEmployeeWageImpl implements CompanyEmpWage {


    private List<EmployeeWageBuilder> companies;

    public void CompanyEmpWageImpl() {
        companies = new ArrayList<>();
    }


    @Override
    public void addCompany(String name,EmployeeWageBuilder empWageBuilder) {
        EmployeeWageBuilder ew=new EmployeeWageBuilder("TCS", 20,20,20);
        ew.setCompany(name);
        companies.add(empWageBuilder);
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
            if(empWageBuilder.getCompany().equalsIgnoreCase(name)){
                return empWageBuilder;
            }
        }
        return null;
    }
}
