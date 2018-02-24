package za.ac.cput.multimdodule;

import java.util.ArrayList;

public interface Employee
{
    double monthly_sal(double rate, double hrs, int weeks);
    double deductions(double sal);
    double commission (double com);
    int devProjects (ArrayList<String> devProjects );

}
