package edu.neu.ccs.cs5004.problem2.upper;

import edu.neu.ccs.cs5004.problem2.AbstractEmployee;
import edu.neu.ccs.cs5004.problem2.Employee;
import edu.neu.ccs.cs5004.problem2.Name;
import edu.neu.ccs.cs5004.problem2.Vacation;

import java.util.Objects;

/**
 * represents a HR manager.
 */
public class HrManager extends AbstractEmployee implements IhrManager {

  private Integer recruited;
  private Integer addByRecruited;
  private Integer addVacation;
  public static final Salary BASIC_SALARY = new Salary(40000);
  public static final Integer INCREASE_FACTOR = 10000;
  public static final Integer MULTIPLY_FACTOR = 2;

  /**
   * Constructor for HR manager.
   *
   * @param name HR manager's name
   * @param workLoad HR manager's workload
   * @param vacationDays HR manager's vacation days
   * @param employeeId HR manager's employee ID
   * @param workYears HR manager's work years
   * @param recruited the number of employees HR manager recruited
   * @param addByRecruited salary added by recruited
   * @param addVacation the adder of vacation days
   * @param multiply the multiplier of vacation days
   */
  public HrManager(Name name, Integer workLoad, Vacation vacationDays,
                   String employeeId, Integer workYears, Integer recruited,
                   Integer addByRecruited, Integer addVacation, Integer multiply) {
    super(name, workLoad,
        vacationDays.addVacationDays(addVacation).addVacationDays(multiply * workYears),
        employeeId, workYears, multiply);
    this.recruited = recruited;
    this.addByRecruited = addByRecruited;
    this.addVacation = addVacation;
    this.salary = new Salary(recruited * addByRecruited).addSalary(BASIC_SALARY.getSalary());
  }

  /**
   * Returns a HR manager with new salary.
   *
   * @param newSalary employee's new salary
   * @return a new HR manager with new salary
   */
  @Override
  public AbstractEmployee employeeCopyFactory(Salary newSalary) {
    HrManager newHrManager = new HrManager(this.getName(),
        this.getWorkLoad(), this.getVacationDays(),
        this.getEmployeeId(), this.getWorkYears(), this.getRecruited(),
        this.getAddByRecruited(), this.getAddVacation(), this.getMultiply());
    newHrManager.salary = newSalary;
    return newHrManager;
  }


  /**
   * Add a bonus for an employee.
   *
   * @param bonus a bonus for an employee
   * @return the method that returns a specific employee that contains new salary added bonus
   */
  public static AbstractEmployee addBonus(AbstractEmployee employee, Integer bonus) {
    Salary newSalary = employee.getSalary().addSalary(bonus);
    return employee.employeeCopyFactory(newSalary);
  }

  /**
   * Call a HR manager's behavior "hunt talents".
   *
   * @return "Let us hunt talents"
   */
  public String huntTalents() {
    return "Let us hunt talents";
  }

  /**
   * Getter for property "the number of employee  by a HR manager".
   *
   * @return the number of employee  by a HR manager
   */
  public Integer getRecruited() {
    return recruited;
  }

  /**
   * Add the number of salary to a Salary by HR.
   *
   * @param salary the number of salary to add
   * @return the total salary after adding "salary"
   */
  public static Salary addSalaryByHr(Salary salary) {
    return new Salary(salary.getSalary() + INCREASE_FACTOR);
  }

  /**
   * Multiply a Salary by HR.
   *
   * @param salary employee's salary
   * @return the total salary after multiplying "multiply"
   */
  public static Salary multiplySalaryByHr(Salary salary) {
    return new Salary(MULTIPLY_FACTOR * salary.getSalary());
  }

  /**
   * Getter for addByRecruited.
   *
   * @return addByRecruited
   */
  public Integer getAddByRecruited() {
    return addByRecruited;
  }

  /**
   * Getter for getAddVacation.
   *
   * @return addVacation
   */
  public Integer getAddVacation() {
    return addVacation;
  }

  /**
   * Add employees' salary.
   *
   * @param employees several employees
   * @param bonus bonus
   * @return employees after adding bonus
   */
  public Employee[] addEmployeesSalary(AbstractEmployee[] employees, Integer bonus) {
    for (int i = 0; i < employees.length; i++) {
      employees[i] = HrManager.addBonus(employees[i], bonus);
    }
    return employees;
  }

  public static Boolean requestAddSalary(Salary salary) {
    return salary.getSalary() < 80000;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    if (!super.equals(object)) {
      return false;
    }
    HrManager hrManager = (HrManager) object;
    return Objects.equals(recruited, hrManager.recruited);
  }

  @Override
  public int hashCode() {

    return Objects.hash(super.hashCode(), recruited);
  }

  @Override
  public String toString() {
    return "HrManager{"
        + "recruited="
        + recruited
        + ", addByRecruited="
        + addByRecruited
        + ", addVacation="
        + addVacation
        + ", name="
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
