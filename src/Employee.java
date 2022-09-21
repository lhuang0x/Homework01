import java.text.DecimalFormat;

/**
 * Lijie Huang
 * CS5004 Assignment01-1
 * This class represents an employee. An employee has a name, employee ID, the worked hours,
 * and pay rate.
 */

public class Employee {
  private final String name;
  private final String employeeID;
  private double hoursWorked;
  private double totalPayAfterTax;
  private final double payRate;


  /**
   * Construct an employee. Employee object that has the provided a name, employee ID,
   * hours worked, and pay rate.
   *
   * @param name  the employee name to be given to this employee
   * @param employeeID  the employee ID to be given to this employee
   * @param hoursWorked  the hours worked to be assigned to this employee
   * @param payRate the pay rate to be assigned to this employee
   */

  public Employee(String name, String employeeID, double hoursWorked, double payRate) {
    this.name = name;
    this.employeeID = employeeID;
    this.hoursWorked = 0.0;
    this.payRate = payRate;
    this.totalPayAfterTax = this.getWeeklyCheck();
  }
  /**
   * This method adds hours worked for the employee's total working hour.
   *
   * @param hoursAdded hours added to the total hours
   */

  public void addHoursWorked(double hoursAdded) {
    double totalHoursWorked = this.hoursWorked + hoursAdded;
    this.hoursWorked = Math.max(totalHoursWorked, 0.0);
  }
  /**
   * This method resets hours worked by the employee.
   */

  public void resetHoursWorked(){
      this.hoursWorked = 0.0;
  }
  /**
   * This getter method gets the class hoursWorked.
   *
   * @return the hoursWorked by the employee.
   */

  public double getHoursWorked() {
    return hoursWorked;
  }

  /**
   * Returns a paycheck object initiated with hoursWorked and payRate from the employee object.
   *
   * @return a paycheck object.
   */
  public double getWeeklyCheck() {
    Paycheck paycheck = new Paycheck(this.payRate, this.hoursWorked);
    return paycheck.getPayAfterTaxes();
  }
  /**
   * Returns a string of with the name, id, and payment after taxes.
   *
   * @return string of with the name, id, and payment after taxes.
   */

  public String toString() {
    DecimalFormat paycheck = new DecimalFormat("$ 0.00");
    return "Name: " + this.name + "\nID: " + this.employeeID + "\nPayment after taxes: "
            + paycheck.format(getWeeklyCheck());
  }
  /**
   * Get the employee's name.
   *
   * @return employee name
   */

  public String getName() {
    return name;
  }
  /**
   * Get the employee's ID.
   *
   * @return employeeId
   */
  public String getEmployeeId() {
    return employeeID;
  }
  /**
   * Return employee's pay rate.
   *
   * @return pay rate of an employee
   */

  public double getPayRate() {
    return payRate;
  }
}
