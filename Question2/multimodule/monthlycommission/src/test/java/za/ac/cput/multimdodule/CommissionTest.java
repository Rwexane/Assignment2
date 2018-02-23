package za.ac.cput.multimdodule;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.multimdodule.Impl.CommissionImpl;


public class CommissionTest
{
    private Commission com;

    @Before
    public void setUp() throws Exception
    {
        com = new CommissionImpl();
    }

    @Test
    public void testCommission() throws Exception
    {
        Assert.assertEquals(3150, com.commission(21000), 0.01);
    }
}