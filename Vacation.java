package edu.neu.ccs.cs5004.problem2;

import java.util.Objects;

/**
 * represents employee's vaca.
 */
public class Vacation {
  private Integer vaca;

  public Vacation(Integer vaca) {
    this.vaca = vaca;
  }

  /**
   * Add vacations days to a Vacation.
   *
   * @param add an adder for vaca
   * @return the total vaca after increasing "add"
   */
  public Vacation addVacationDays(Integer add) {
    return new Vacation(vaca + add);
  }

  /**
   * Multiply a Vacation.
   *
   * @param multiply a multiplier for vaca
   * @return the total vaca after multiplying "multiply"
   */
  public Vacation multiplyVacationDays(Integer multiply) {
    return new Vacation(vaca * multiply);
  }

  /**
   * Getter for property "vaca".
   *
   * @return vaca
   */
  public Integer getVacation() {
    return vaca;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Vacation vacation1 = (Vacation) object;
    return Objects.equals(vaca, vacation1.vaca);
  }

  @Override
  public int hashCode() {

    return Objects.hash(vaca);
  }

  @Override
  public String toString() {
    return "Vacation{"
        + "vaca="
        + vaca
        + '}';
  }
}
