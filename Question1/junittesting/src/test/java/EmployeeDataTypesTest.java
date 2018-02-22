import org.junit.Test;
import org.junit.*;

public class EmployeeDataTypesTest
{
    public static Employee junior_dev;
    public static Employee intermediate_dev;
    public static Employee senior_dev;

    @Before
    public void setUp() throws Exception
    {
        junior_dev = new Employee("Rwexane","Bulelani", 18500.00);
        intermediate_dev = new Employee("Fani", "Luyanda", 24000.34);
        senior_dev = new Employee("Ntso", "Siyabonga", 65000.59);
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals(junior_dev, junior_dev);    // Testing object equality
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        Assert.assertNotSame(intermediate_dev, senior_dev); // Testing object identity
    }

    @Test
    public void testFailingTest() throws Exception
    {
        Assert.assertEquals(4, EmployeeDataTypes.INT_NUM);  // Failing test
    }

    @Test(timeout=11)   // Time in milliseconds
    public void testException_timeout() throws Exception
    {
        while (true)
        {}
    }

    @Ignore("This test is disabled for demonstration")
    @Test
    public void disablingTest()  throws Exception
    {
        Assert.assertEquals(5, EmployeeDataTypes.INT_NUM);
    }
}
