package edu.neu.ccs.cs5004.problem2.upper;

import edu.neu.ccs.cs5004.problem2.AbstractEmployee;
import edu.neu.ccs.cs5004.problem2.Employee;

public interface IhrManager extends Employee {

  /**
   * Add employees' salary.
   *
   * @param employees several employees
   * @param bonus bonus
   * @return employees after adding bonus
   */
  Employee[] addEmployeesSalary(AbstractEmployee[] employees, Integer bonus);

  /**
   * Getter for addByRecruited.
   *
   * @return addByRecruited
   */
  Integer getAddByRecruited();

  /**
   * Getter for getAddVacation.
   *
   * @return addVacation
   */
  Integer getAddVacation();

  /**
   * Call a HR manager's behavior "hunt talents".
   *
   * @return "Let us hunt talents"
   */
  String huntTalents();

  /**
   * Getter for property "the number of employee  by a HR manager".
   *
   * @return the number of employee  by a HR manager
   */
  Integer getRecruited();

}
