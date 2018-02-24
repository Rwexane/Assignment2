package za.ac.cput.multimdodule.Impl;
import za.ac.cput.multimdodule.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.multimdodule.Config.AppConfig;
import java.util.ArrayList;

public class EmployeeImplTest
{
    private Employee emp;
    private ApplicationContext cntx;

    @Before
    public void setUp() throws Exception {

        cntx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee) cntx.getBean("emp");
    }
     @Test
    public void testMonthlysal() throws Exception
     {
            Assert.assertEquals(4000, emp.monthly_sal(200, 5, 4 ), 0.02);
     }

    @Test
    public void testDeductions() throws Exception
    {
        Assert.assertEquals(20000, emp.deductions(50000), 0.02);
    }
    @Test
    public void testCommission() throws Exception
    {
        Assert.assertEquals(0, emp.commission(200), 0.01);
    }
    @Test
    public void testDevProjects() throws Exception
    {
        ArrayList<String> devProjects = new ArrayList<String>();
        devProjects.add("C#");
        devProjects.add("Java");
        devProjects.add("Python");
        devProjects.add("C++");
        Assert.assertEquals(4, emp.devProjects(devProjects));
    }
}