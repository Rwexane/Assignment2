package za.ac.cput.multimdodule.Impl;

import za.ac.cput.multimdodule.TaxDeduction;

public class TaxDeductionImp implements TaxDeduction
{
    private static final double rate = 0.4;

    public double deductions(double salary)
    {
        return salary * 0.4;
    }
}
