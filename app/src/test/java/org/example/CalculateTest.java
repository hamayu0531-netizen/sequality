package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testIndividualFee_Age8_Returns1000() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getIndividualFee(8));
  }

  @Test
  public void testIndividualFee_Age18_Returns2000() {
    Calculate calc = new Calculate();
    assertEquals(2000, calc.getIndividualFee(18));
  }

  @Test
  public void testTotalFee_Size3_NoDiscount() {
    Calculate calc = new Calculate();
    assertEquals(6000, calc.getTotalFee(18, 3));
  }

  @Test
  public void testTotalFee_Size12_Age8_WithDiscount() {
    Calculate calc = new Calculate();
    assertEquals(10800, calc.getTotalFee(8, 12));
  }

  @Test
  public void testTotalFee_Size10_Age30_WithDiscount() {
    Calculate calc = new Calculate();
    assertEquals(18000, calc.getTotalFee(30, 10));
  }
}
