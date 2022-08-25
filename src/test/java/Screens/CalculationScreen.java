package Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Base.Setup.PACKAGE_ID;

public class CalculationScreen {
    @FindBy(id="com.google.android.calculator:id/digit_3")
    AndroidElement digit_3;
    @FindBy(id=PACKAGE_ID+":id/digit_9")
    AndroidElement digit_9;
    @FindBy(id=PACKAGE_ID+":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = PACKAGE_ID+":id/eq")
    AndroidElement btnEqual;
    @FindBy(id = PACKAGE_ID+":id/clr")
    AndroidElement btnClear;
    @FindBy(id = PACKAGE_ID+":id/op_sub")
    AndroidElement btnMinus;
    @FindBy(id = PACKAGE_ID+":id/op_mul")
    AndroidElement btnMultiplication;
    @FindBy(id = PACKAGE_ID+":id/op_div")
    AndroidElement btnDivide;
    @FindBy(id=PACKAGE_ID+":id/result_final")
    AndroidElement lblResult;
    public CalculationScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String doSum() throws InterruptedException {
        Thread.sleep(1000);
        digit_3.click();
        Thread.sleep(1000);
        btnPlus.click();
        Thread.sleep(1000);
        digit_9.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return lblResult.getText();
    }
    public String doMinus() throws InterruptedException {
        Thread.sleep(1000);
        btnClear.click();
        Thread.sleep(1000);
        digit_9.click();
        Thread.sleep(1000);
        btnMinus.click();
        Thread.sleep(1000);
        digit_3.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return lblResult.getText();
    }
    public String doMultiplication() throws InterruptedException {
        Thread.sleep(1000);
        btnClear.click();
        Thread.sleep(1000);
        digit_9.click();
        Thread.sleep(1000);
        btnMultiplication.click();
        Thread.sleep(1000);
        digit_3.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return lblResult.getText();
    }
    public String doDivision() throws InterruptedException {
        Thread.sleep(1000);
        btnClear.click();
        Thread.sleep(1000);
        digit_9.click();
        Thread.sleep(1000);
        btnDivide.click();
        Thread.sleep(1000);
        digit_3.click();
        Thread.sleep(1000);
        btnEqual.click();
        Thread.sleep(1000);
        return lblResult.getText();
    }

}
