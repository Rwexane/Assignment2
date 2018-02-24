package za.ac.cput.multimdodule.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.multimdodule.Employee;
import za.ac.cput.multimdodule.Impl.EmployeeImpl;

@Configuration
public class AppConfig
{
    @Bean(name = "emp")
    public Employee getEmployee()
    {
        return new  EmployeeImpl();
    }
}

