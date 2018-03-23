package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.upper.HrManager;
import edu.neu.ccs.cs5004.problem2.upper.Salary;


/**
 * represents a general secretary.
 */
public class GeneralSecre extends AbstractSecretary implements IgeneralSecre {

  /**
   * Represents a general secretary.
   *
   * @param name general secretary's name
   * @param workLoad general secretary's work load
   * @param vacationDays general secretary's vacation days
   * @param employeeId general secretary's employee ID
   * @param workYears general secretary's work years
   * @param multiply general secretary's multiply
   */
  public GeneralSecre(Name name, Integer workLoad,
                      Vacation vacationDays, String employeeId,
                      Integer workYears, Integer multiply) {
    super(name, workLoad,
        vacationDays.multiplyVacationDays(multiply), employeeId, workYears, multiply);
    this.salary = HrManager.BASIC_SALARY;
  }

  /**
   * Call to make legal secretary get promotion.
   *
   * @return a legal secretary
   */
  public LegalSecre getPromotion() {
    return new LegalSecre(getName(), getWorkLoad(),
        getVacationDays(), getEmployeeId(),
        getWorkYears(), getMultiply());
  }

  /**
   * Returns a legal secretary with new salary.
   *
   * @param newSalary employee's new salary
   * @return a new legal secretary with new salary
   */
  @Override
  public AbstractEmployee employeeCopyFactory(Salary newSalary) {
    GeneralSecre generalSecre = new GeneralSecre(this.getName(), this.getWorkLoad(),
        this.getVacationDays(), this.getEmployeeId(), this.getWorkYears(), this.getMultiply());
    this.salary = newSalary;
    return generalSecre;
  }

  /**
   * Call a general secretary's behavior "schedule meetings".
   *
   * @return "Let us schedule meetings"
   */
  @Override
  public String scheduleMeetings() {
    return "Let us schedule meetings";
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
    return "GeneralSecre{"
        + "name="
        + name
        + ", workLoad="
        + workLoad
        + ", salary="
        + salary
        + ", vacationDays="
        + vacationDays
        + ", employeeId='"
        + employeeId + '\''
        + ", workYears="
        + workYears
        + ", multiply="
        + multiply
        + "} "
        + super.toString();
  }
}
