package PatternNullObject;

import java.util.ArrayList;

public class Company {

    private static final ArrayList<String> Employees = new ArrayList<String>();

    public void HireEmployee(String EmployeeName) {
        Employees.add(EmployeeName);
    }

    public AbstractEmployee getEmployee(String name) {
        for (String AE : Employees
                ) {
            for (int i = 0; i < Employees.size(); i++) {
                if (AE.equalsIgnoreCase(name))
                    return new ExistingEmployee(name);
            }
        }
        return new NullEmployee();
    }
}
