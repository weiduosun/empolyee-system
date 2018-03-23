package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.upper.HrManager;
import edu.neu.ccs.cs5004.problem2.upper.Salary;

/**
 * represents a legal secretary.
 */
public class LegalSecre extends AbstractSecretary implements IlegalSecre {

  /**
   * Constructor for legal secretary.
   *
   * @param name a legal secretary' name
   * @param workLoad a legal secretary' work load
   * @param vacationDays a legal secretary' vacation days
   * @param employeeId a legal secretary' employee ID
   * @param workYears a legal secretary' work years
   * @param multiply a legal secretary' multiply
   */
  LegalSecre(Name name, Integer workLoad,
                    Vacation vacationDays, String employeeId, Integer workYears,
                    Integer multiply) {
    super(name, workLoad, vacationDays.addVacationDays(multiply * workYears),
        employeeId, workYears, multiply);
    salary = HrManager.addSalaryByHr(salary);
  }

  /**
   * Returns a legal secretary with new salary.
   *
   * @param newSalary employee's new salary
   * @return a new legal secretary with new salary
   */
  @Override
  public AbstractEmployee employeeCopyFactory(Salary newSalary) {
    LegalSecre newLegalSecre = new LegalSecre(this.getName(), this.getWorkLoad(),
        this.getVacationDays(), this.getEmployeeId(), this.getWorkYears(), this.getMultiply());
//    this.salary = newSalary;
    newLegalSecre.salary = newSalary;
    return newLegalSecre;
  }

  /**
   * call a legal secretary's behaviour "prepare legal documents".
   *
   * @return "Let us prepare legal documents"
   */
  public String prepareLegalDocuments() {
    return "Let us prepare legal documents";
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
    return "LegalSecre{"
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
