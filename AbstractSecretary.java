package edu.neu.ccs.cs5004.problem2;


/**
 * represents the common properties of a employee.
 */
public abstract class AbstractSecretary extends AbstractEmployee implements Isecretary {

  /**
   * Constructor for an abstract secretary.
   *
   * @param name an abstract secretary's name
   * @param workLoad an abstract secretary's work load
   * @param vacationDays an abstract secretary's vacation days
   * @param employeeId an abstract secretary's employee ID
   * @param workYears an abstract secretary's work years
   * @param multiply an abstract secretary's multiply
   */
  AbstractSecretary(Name name, Integer workLoad,
                           Vacation vacationDays, String employeeId,
                           Integer workYears, Integer multiply) {
    super(name, workLoad, vacationDays, employeeId, workYears, multiply);
  }

  /**
   * Represents the behavior: schedule meetings of an abstract secretary.
   *
   * @return "Let us schedule meetings"
   */
  public abstract String scheduleMeetings();

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
    return "AbstractSecretary{}";
  }
}
