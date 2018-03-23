package edu.neu.ccs.cs5004.problem2.upper;

import java.util.Objects;

/**
 * represents employee's sala.
 */
public class Salary {

  private Integer sala;

  /**
   * Constructor for Salary.
   *
   * @param sala employee's sala
   */
  public Salary(Integer sala) {
    this.sala = sala;
  }

  /**
   * Add the number of sala to a Salary.
   *
   * @param add the adder of sala
   * @return the total sala after adding "add"
   */
  Salary addSalary(Integer add) {
    return new Salary(sala + add);
  }

  /**
   * Multiply a Salary.
   *
   * @param multiply the multiplier of sala
   * @return the total sala after multiplying "multiply"
   */
  Salary multiplySalary(Integer multiply) {
    return new Salary(multiply * sala);
  }

  /**
   * Getter for property "sala".
   *
   * @return employee's sala
   */
  Integer getSalary() {
    return sala;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Salary salary1 = (Salary) object;
    return Objects.equals(sala, salary1.sala);
  }

  @Override
  public int hashCode() {

    return Objects.hash(sala);
  }

  @Override
  public String toString() {
    return "Salary{"
        + "sala="
        + sala
        + '}';
  }
}
