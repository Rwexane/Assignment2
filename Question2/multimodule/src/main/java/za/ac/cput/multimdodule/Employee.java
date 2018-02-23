package za.ac.cput.multimdodule;

import java.util.ArrayList;

public interface Employee
{
    double monthly_sal(double rate, double hrs, int weeks);
    double deductions(double sal);
    double commission (double commi);
    int modules (ArrayList<String> modules );
}
