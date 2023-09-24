import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

//modyfikatory dostepu (public / private / protected)
public class UltimateQAtests extends PageSetup {


@Test
    public void testone(){
    WebElement button = driver.findElementById("idExample");
    button.click();
    WebElement text = driver. findElementByClassName("entry-title");
    Assertions.assertEquals("Button success", text.getText());
}

@Test
    public void  testTwo() throws InterruptedException {
    WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
    nameInput.sendKeys("Tester");

    WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
    emailInput.sendKeys("tester@tester.pl");

    Thread.sleep(2000);
    WebElement buttonEmailMe = driver.findElementByName("et_builder_submit_button_0");
    buttonEmailMe.click();


}
}
