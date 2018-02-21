public class Employee
{
    public String lname;

    public String fname;

    public double salary;

    public Employee(String lname, String fname, double salary)
    {
        this.lname = lname;
        this.fname = fname;
        this.salary = salary;
    }

    public String getLname() { return lname; }

    public String getFname() { return fname; }

    public double getSalary() { return salary; }
}
