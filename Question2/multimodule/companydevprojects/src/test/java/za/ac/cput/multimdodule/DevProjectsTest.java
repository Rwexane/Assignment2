package za.ac.cput.multimdodule;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
import za.ac.cput.multimdodule.Impl.DevProjecsImpl;

import java.util.ArrayList;

public class DevProjectsTest
{
  private  DevProjects devProject;

  @Before
  public void setUp() throws Exception
  {
      devProject = new DevProjecsImpl();
  }

  @Test
  public void testProjectSize() throws Exception
  {
      ArrayList<String> devProjects = new ArrayList<String>();
      devProjects.add("C#");
      devProjects.add("Java");
      devProjects.add("Python");
      devProjects.add("C++");

      Assert.assertEquals(4, devProject.devProjects(devProjects));
  }
}