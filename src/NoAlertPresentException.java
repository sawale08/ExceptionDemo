
public class NoAlertPresentException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	NoAlertPresentException under NotFoundException is thrown when WebDriver tries to switch to an alert, which is not available.

org.openqa.selenium.NoAlertPresentException will be thrown If below automation code calls accept() operation on Alert() 
class when an alert is not yet on the screen.

driver.switchTo().alert().accept();
driver.switchTo().alert().accept();


Exception Handling:

try {
driver.switchTo().alert().accept();
} catch (NoSuchAlertException e)
In this case, the exception is thrown even if the alert is not loaded completely.

Avoiding-And-Handling: Always use explicit or fluent wait for a particular time in all cases where an alert is expected. 
If the alert is available and still there is an exception, then it is caught.

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.alertIsPresent());
try {
driver.switchTo().alert().accept();
} catch (NoAlertPresentException e) {
System.out.println(“An exceptional case”);
}
} catch (TimeOutException e)
System.out.println(“WebDriver couldn’t locate the Alert”);
}
		 */
	}

}
