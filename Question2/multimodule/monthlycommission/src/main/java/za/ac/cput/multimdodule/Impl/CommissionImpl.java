package za.ac.cput.multimdodule.Impl;

import za.ac.cput.multimdodule.Commission;

public class CommissionImpl implements Commission
{
    private static final double rate01 = 0.5;
    private static final double rate02 = 0.15;

    //@Override
    public double commission(double salesAmount)
    {
        if (salesAmount > 30000)
            return salesAmount * 0.5;
        else if (salesAmount > 20000)
            return salesAmount * 0.15;
        else
            return 0;
    }
}
