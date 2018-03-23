package edu.neu.ccs.cs5004.problem2;

import edu.neu.ccs.cs5004.problem2.upper.HrManager;
import edu.neu.ccs.cs5004.problem2.upper.Salary;

import java.util.Objects;

/**
 * represents the common properties of an employee.
 */
public abstract class AbstractEmployee implements Employee {

  protected Name name;
  protected Integer workLoad;
  protected Salary salary;
  protected Vacation vacationDays;
  protected String employeeId;
  protected Integer workYears;
  protected Integer multiply;

  /**
   * Constructor for an abstract employee.
   *
   * @param name abstract employee's name
   * @param workLoad abstract employee's work load
   * @param vacationDays abstract employee's vacation days
   * @param employeeId abstract employee's ID
   * @param workYears abstract employee's work years
   * @param multiply abstract employee's multiply
   */
  public AbstractEmployee(Name name, Integer workLoad, Vacation vacationDays,
                          String employeeId, Integer workYears, Integer multiply) {
    this.name = name;
    this.workLoad = workLoad;
    this.salary = HrManager.BASIC_SALARY;
    this.vacationDays = vacationDays;
    this.employeeId = employeeId;
    this.workYears = workYears;
    this.multiply = multiply;
  }

  /**
   * Copy Factory of an employee.
   *
   * @param newSalary a new salary of an employee
   * @return an employee
   */
  public abstract AbstractEmployee employeeCopyFactory(Salary newSalary);

  /**
   * Getter for name.
   *
   * @return full name
   */
  @Override
  public Name getName() {
    return name;
  }

  /**
   * Getter for work load.
   *
   * @return work load
   */
  @Override
  public Integer getWorkLoad() {
    return workLoad;
  }

  /**
   * Getter for salary.
   *
   * @return salary
   */
  @Override
  public Salary getSalary() {
    return salary;
  }

  /**
   * Getter for vacation days.
   *
   * @return vacation days
   */
  @Override
  public Vacation getVacationDays() {
    return vacationDays;
  }

  /**
   * Getter for employee ID.
   *
   * @return an employee ID
   */
  @Override
  public String getEmployeeId() {
    return employeeId;
  }

  /**
   * Getter for work years.
   *
   * @return work years
   */
  @Override
  public Integer getWorkYears() {
    return workYears;
  }

  /**
   * Getter for multiply.
   *
   * @return multiply
   */
  @Override
  public Integer getMultiply() {
    return multiply;
  }

  /**
   * Check if the request is approved.
   *
   * @return true if the request is approved, false otherwise
   */
  @Override
  public Boolean requestRaiseSalary() {
    if (HrManager.requestAddSalary(this.getSalary())) {
      this.salary = HrManager.addSalaryByHr(new Salary(HrManager.INCREASE_FACTOR));
    }
    return HrManager.requestAddSalary(this.getSalary());
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    AbstractEmployee that = (AbstractEmployee) object;
    return Objects.equals(name, that.name)
        && Objects.equals(workLoad, that.workLoad)
        && Objects.equals(salary, that.salary)
        && Objects.equals(vacationDays, that.vacationDays)
        && Objects.equals(employeeId, that.employeeId)
        && Objects.equals(workYears, that.workYears)
        && Objects.equals(multiply, that.multiply);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, workLoad, salary, vacationDays, employeeId, workYears, multiply);
  }

  @Override
  public String toString() {
    return "AbstractEmployee{"
        + "name='"
        + name
        + '\''
        + ", workLoad="
        + workLoad
        + ", salary="
        + salary
        + ", vacationDays="
        + vacationDays
        + ", employeeID='"
        + employeeId
        + '\''
        + ", workYears="
        + workYears
        + '}';
  }
}
