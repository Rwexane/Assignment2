package za.ac.cput.multimdodule;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import za.ac.cput.multimdodule.Impl.MonthlySalImpl;


public class MonthlySalTest
{
    private MonthlySal salary;

    @Before
    public void setUp() throws Exception
    {
        salary = new MonthlySalImpl();
    }
    @Test
    public void testMonthlysal() throws Exception
    {
        Assert.assertEquals(12000, salary.monthlysal(300, 8, 5), 0.02);
    }
}