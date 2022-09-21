import java.text.DecimalFormat;

/**
 * Lijie Huang
 * CS5004 Assignment01-2
 * This class represents a paycheck. A paycheck has weekly hours, pay rate,and total pay.
 */

public class Paycheck {
  private double weeklyHours;
  private double payRate;
  private double totalPay;
  /**
   * The constructor is initialized with rate and hours worked by the employee.
   *
   * @param weeklyHours total hours worked by employee in a week
   * @param payRate     the pay rate of the employee
   */

  public Paycheck(double payRate, double weeklyHours) {
    this.weeklyHours = weeklyHours;
    this.payRate = payRate;
    double regularHours = 40.0;
    double overtimeRate = 1.5;
    if (this.weeklyHours > regularHours){
      this.totalPay = (this.weeklyHours - regularHours) * overtimeRate * this.payRate;
    } else {
      this.totalPay = weeklyHours * this.payRate;
    }
  }
  /**
   * Get weekly hours from paycheck
   *
   * @return weekly hours
   */

  public double getWeeklyHours() {
    return weeklyHours;
  }

  /**
   * Return pay rate from paycheck.
   *
   * @return paycheck's pay rate.
   */

  public double getPayRate() {
    return payRate;
  }

  /**
   * This method returns the total pay for an employee. For any overtime hours outside of
   * regular hours, employee gets 1.5x pay rate.
   *
   * @return the total pay
   */

  public double getTotalPay() {
    return totalPay;
  }
  /**
   * This method calculate employee's total pay after tax.
   *
   * @return the total pay after tax
   */

  public double getPayAfterTaxes() {
    double taxCut = 400.0;
    double lowerTaxRate = 0.1;
    double higherTaxRate = 0.15;
    if (getTotalPay() < taxCut) {
      return getTotalPay() * (1-lowerTaxRate);
    } else {
     return getTotalPay() * (1-higherTaxRate);
    }
  }
  /**
   * This method prints out the Paycheck after taxes are taken.
   *
   * @return a string of the payment after taxes.
   */
  public String toString() {
    DecimalFormat paycheck = new DecimalFormat("$ 0.00");
    getPayAfterTaxes();
    return "Payment after taxes: " + paycheck.format(getPayAfterTaxes());
  }
}
