package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.upper.HrManager;
import edu.neu.ccs.cs5004.problem2.upper.Salary;

/**
 * represents a lawyer.
 */
public class Lawyer extends AbstractEmployee implements Ilawyer {

  /**
   * Constructor for lawyer.
   *
   * @param name a lawyer' name
   * @param workLoad a lawyer' work load
   * @param vacationDays a lawyer' vacation days
   * @param employeeId a lawyer' employee ID
   * @param workYears a lawyer' work years
   * @param multiply a lawyer' multiply
   */
  public Lawyer(Name name, Integer workLoad, Vacation vacationDays,
                String employeeId, Integer workYears, Integer multiply) {
    super(name, workLoad, vacationDays.addVacationDays(multiply * workYears), employeeId,
        workYears, multiply);
    salary = HrManager.multiplySalaryByHr(salary);
  }

  /**
   * Returns a lawyer with new salary.
   *
   * @param newSalary employee's new salary
   * @return a new lawyer with new salary
   */
  @Override
  public AbstractEmployee employeeCopyFactory(Salary newSalary) {
    Lawyer newLawyer = new Lawyer(this.getName(), this.getWorkLoad(),
        this.getVacationDays(), this.getEmployeeId(), this.getWorkYears(), this.getMultiply());
    this.salary = newSalary;
    return newLawyer;
  }

  /**
   * Call a lawyer's behavior "sue".
   *
   * @return "Let us sue"
   */
  public String sue() {
    return "Let us sue";
  }

  @Override
  public boolean equals(Object object) {
    return super.equals(object);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return "Lawyer{"
        + "name="
        + name
        + ", workLoad="
        + workLoad
        + ", salary="
        + salary
        + ", vacationDays="
        + vacationDays
        + ", employeeId='"
        + employeeId
        + '\''
        + ", workYears="
        + workYears
        + ", multiply="
        + multiply
        + "} "
        + super.toString();
  }
}
