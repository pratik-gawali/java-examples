package polymorphismTest.methodOverloadingTest;

import org.junit.jupiter.api.Test;
import polymorphism.methodOverloading.SalaryCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SalaryCalculatorTest {

    // Base Salary Test
    @Test
    public void baseShouldReturn(){
        SalaryCalculator sc = new SalaryCalculator();

        assertEquals(50000,sc.calculateSalary(50000));
    }

    @Test
    public void base_ShouldThrowWhenZero0rNegative(){
        SalaryCalculator sc = new SalaryCalculator();

        assertThrows(IllegalArgumentException.class,()->sc.calculateSalary(0));
        assertThrows(IllegalArgumentException.class,()->sc.calculateSalary(-10000));
    }
    // Gross Salary Test
    @Test
    public void grossShouldReturn(){
        SalaryCalculator sc = new SalaryCalculator();

        assertEquals(65000,sc.calculateSalary(50000,15000));
    }

    @ParameterizedTest
    @CsvSource({
            "0,5000",
            "-10000,5000",
            "10000,-5000"
    })
    public void gross_ShouldThrowWhenBonusOrBaseZero0rNegative(double base,double bonus){
        SalaryCalculator sc = new SalaryCalculator();

        assertThrows(IllegalArgumentException.class,()->sc.calculateSalary(base,bonus));

    }

    // Tax Deducted Salary Test
    @Test
    public void tax_deductedSalaryShouldReturn(){
        SalaryCalculator sc = new SalaryCalculator();

        assertEquals(58500,sc.calculateSalary(50000,15000,10));
    }

    @ParameterizedTest
    @CsvSource({
            "0,5000,10",
            "-10000,5000,10",
            "10000,-5000,10",
            "10000,5000,110",
            "-10000,-5000,-10"
    })
    public void tax_ShouldThrowWhenTaxPercentageNegative(double base,double bonus,double tax){
        SalaryCalculator sc = new SalaryCalculator();

        assertThrows(IllegalArgumentException.class,()->sc.calculateSalary(base,bonus,tax));

    }
}
