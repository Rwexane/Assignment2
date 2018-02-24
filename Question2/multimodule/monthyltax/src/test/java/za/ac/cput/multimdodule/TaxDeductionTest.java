package za.ac.cput.multimdodule;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import za.ac.cput.multimdodule.Impl.TaxDeductionImp;

public class TaxDeductionTest
{
    private TaxDeduction tax;

    @Before
    public void setUp() throws Exception
    {
        tax = new TaxDeductionImp();
    }

    @Test
    public void testTaxDeduction() throws Exception
    {
        Assert.assertEquals(20000, tax.deductions(50000), 0.02);
    }

}