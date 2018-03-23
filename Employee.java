package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.upper.Salary;

public interface Employee {

  /**
   * Getter for property 'name'.
   *
   * @return employee's name
   */
  Name getName();

  /**
   * Getter for property 'workload'.
   *
   * @return employee's workload
   */
  Integer getWorkLoad();


  /**
   * Getter for property 'salary'.
   *
   * @return employee's salary
   */
  Salary getSalary();

  /**
   * Getter for property 'vacation days'.
   *
   * @return employee's vacation days
   */
  Vacation getVacationDays();

  /**
   * Getter for property 'employee ID'.
   *
   * @return employee's employee ID
   */
  String getEmployeeId();

  /**
   * Getter for property 'work years'.
   *
   * @return employee's work years
   */
  Integer getWorkYears();

  /**
   * Getter for property 'multiplier of employee's vacation'.
   *
   * @return multiplier of employee's vacation
   */
  Integer getMultiply();

  /**
   * Request raising salary.
   *
   * @return true if request is approved by HR Manager, false otherwise.
   */
  Boolean requestRaiseSalary();
}
