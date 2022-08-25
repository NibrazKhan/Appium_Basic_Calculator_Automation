package testRunner;

import Base.Setup;
import Screens.CalculationScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculationTestRunner extends Setup {
    CalculationScreen calculationScreen;
    @Test(priority = 1)
    public void doSum() throws InterruptedException {
        calculationScreen=new CalculationScreen(driver);
        String result=calculationScreen.doSum();
        Assert.assertEquals(result,"12");
    }
    @Test(priority = 2)
    public void doMinus() throws InterruptedException {
        calculationScreen=new CalculationScreen(driver);
        String result=calculationScreen.doMinus();
        Assert.assertEquals(result,"6");
    }
    @Test(priority = 3)
    public void doMultiplication() throws InterruptedException {
        calculationScreen=new CalculationScreen(driver);
        String result=calculationScreen.doMultiplication();
        Assert.assertEquals(result,"27");
    }
    @Test(priority = 4)
    public void doDivision() throws InterruptedException {
        calculationScreen=new CalculationScreen(driver);
        String result=calculationScreen.doDivision();
        Assert.assertEquals(result,"3");
    }
}
