import java.util.HashMap;
import java.util.Map;

public class CompanyEmployeeWageImpl implements CompanyEmpWage {

    private Map<String, EmployeeWageBuilder> companies;

    public void CompanyEmpWageImpl() {
        companies = new HashMap<String, EmployeeWageBuilder>();
    }

    @Override
    public EmployeeWageBuilder addCompany(String name, EmployeeWageBuilder empWageBuilder) {
        companies.put(name, empWageBuilder);
        return empWageBuilder;
    }

    @Override
    public EmployeeWageBuilder removeCompany(String name) {
        return companies.remove(name);
    }

    @Override
    public EmployeeWageBuilder getCompany(String name) {
        return companies.get(name);
    }
}
