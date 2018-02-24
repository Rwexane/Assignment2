package za.ac.cput.multimdodule.Impl;

import za.ac.cput.multimdodule.MonthlySal;

public class MonthlySalImpl implements MonthlySal
{
    public double monthlysal(double rate, double hrs, int weeks)
    {
        return ( rate * hrs) * weeks;
    }
}
