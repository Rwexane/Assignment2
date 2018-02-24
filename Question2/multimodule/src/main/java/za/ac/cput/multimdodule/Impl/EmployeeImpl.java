package za.ac.cput.multimdodule.Impl;
import za.ac.cput.multimdodule.*;

import java.util.ArrayList;

public class EmployeeImpl implements Employee
{
    private MonthlySal m_monthlySal = new MonthlySalImpl();

    TaxDeduction m_taxDeduction = new TaxDeductionImp();

    Commission m_com = new CommissionImpl();

    DevProjects m_devProjects = new DevProjecsImpl();

    public double monthly_sal(double rate, double hrs, int weeks)
    {
        return m_monthlySal.monthlysal(rate, hrs, weeks);
    }

    public double deductions(double salary)
    {
        return m_taxDeduction.deductions(salary);
    }

    public double commission(double salesAmount)
    {
        return m_com.commission(salesAmount);
    }

    public int devProjects(ArrayList<String> devProjecs)
    {
        return m_devProjects.devProjects(devProjecs);
    }
}
