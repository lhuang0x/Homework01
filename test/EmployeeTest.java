import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * A JUnit test class for the Employee class.
 *
 *  Lijie Huang
 *  CS5004 Assignment01-1
 *
 */

public class EmployeeTest {

  /**
   * Test  addHoursWorked.
   */
  @Test
  public void testAddHoursWorked() {

    Employee johnDoe = new Employee("John Doe","404",
            0.0,20.0);

    // Test for positive work hours
    johnDoe.addHoursWorked(50.0);
    double positiveHours = 50.0;
    assertEquals(positiveHours, johnDoe.getHoursWorked(), 0.001);

    // Test for negative work hours
    johnDoe.addHoursWorked(-60.0);
    assertEquals(0.0, johnDoe.getHoursWorked(), 0.001);

  }

  /**
   * Test resetHoursWorked.
   */
  @Test
  public void testResetHoursWorked() {
    Employee johnDoe = new Employee("John Doe","404",
            0.0,20.0);

    johnDoe.addHoursWorked(100.0);
    johnDoe.resetHoursWorked();
    assertEquals(0.0, johnDoe.getHoursWorked(), 0.001);
  }

  /**
   * Test getWeeklyCheck.
   */
  @Test
  public void testGetWeeklyCheck() {
    Paycheck test = new Paycheck(20,20);
    assertEquals(340,test.getPayAfterTaxes(),0.001);
  }

  /**
   * Test getName.
   */
  @Test
  public void testGetName() {
    Employee johnDoe = new Employee("John Doe","404",
            0.0,20.0);

    assertEquals("John Doe", johnDoe.getName());
  }

  /**
   * Test getEmployeeId.
   */
  @Test
  public void testGetEmployeeId() {
    Employee johnDoe = new Employee("John Doe","404",
            0.0,20.0);

    assertEquals("404", johnDoe.getEmployeeId());
  }

  /**
   * Test getPayRate.
   */
  @Test
  public void testGetPayRate() {
    Employee johnDoe = new Employee("John Doe","404",
            0.0,20.0);

    assertEquals(20.0, johnDoe.getPayRate(), 0.001);
  }

  /**
   * Test toString.
   */
  @Test
  public void testToString() {
    Employee johnDoe = new Employee("John Doe","404",
            10.0,20.0);
    String expected = "Name: John Doe\nID: 404\nPayment after taxes: $ 0.00";
    assertEquals(expected, johnDoe.toString());
  }



}