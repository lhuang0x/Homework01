import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * A JUnit test class for the PayCheck class.
 *
 *  Lijie Huang
 *  CS5004 Assignment01-1
 *
 */
public class PaycheckTest {

  private Paycheck johnDoePayCheck;

  /**
   * Test for the GetTotalPay method.
   */
  @Test
  public void testGetTotalPay() {

    Paycheck johnDoePayCheck = new Paycheck(26, 10.0);
    double expectedJohnDoePayCheck = 260.0;
    assertEquals(expectedJohnDoePayCheck, johnDoePayCheck.getTotalPay(), 0.001);
  }

  /**
   * Test GetPayAfterTaxes with lower and higher tax rate.
   */
  @Test
  public void testGetPayAfterTaxes() {

    Paycheck testLowerTaxRate = new Paycheck(35, 10.0);

    double expectedLowerTaxRate = 315.0;

    assertEquals(expectedLowerTaxRate, testLowerTaxRate.getPayAfterTaxes(), 0.01);

    Paycheck testHigherTaxRate = new Paycheck(60, 10.0);

    double expectedHigherTaxRate = 510.0;
    assertEquals(expectedHigherTaxRate, testHigherTaxRate.getPayAfterTaxes(), 0.01);
  }

  /**
   * Test the toString methods.
   */
  @Test
  public void testToString() {
    Paycheck johnDoePayCheck = new Paycheck(26, 10.0);
    String expected = "Payment after taxes: $ 234.00";
    assertEquals(expected, johnDoePayCheck.toString());
  }
  /**
   * Test the getWeeklyHours methods.
   */

  @Test
  public void testGetWeeklyHours() {
    Paycheck johnDoePayCheck = new Paycheck(26, 10.0);
    assertEquals(10.0, johnDoePayCheck.getWeeklyHours(), 0.001);
  }
  /**
   * Test the getPayRate methods.
   */

  @Test
  public void testGetPayRate() {
    Paycheck johnDoePayCheck = new Paycheck(26, 10.0);
    assertEquals(26, johnDoePayCheck.getPayRate(), 0.001);
  }
}