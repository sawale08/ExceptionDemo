import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NoSuchElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	Throwable: Throwable is a parent class for error and exception. Generally, it is difficult to handle errors in java. 
	If a programmer is not sure about the type of error and exception, then it is advised to use the Throwable class which
	 can catch both error and exception.

Example:

try {
   br = new BufferedReader(new FileReader("Data"));
     } catch (Throwable t)
     {
       t.printStackTrace();
     }
     
     #######################################################################################################################
	
	This commonly seen exception class is a subclass of NotFoundException class. 
	The exception occurs when WebDriver is unable to find and locate elements.
	
	Usually, this happens when tester writes incorrect element locator in the findElement(By, by) method.
	
	Avoiding-And-Handling: Try giving a wait command.

Example: The wait command below waits 10 seconds for the presence of web element with id ‘submit’. Then it tries to click it. 
If the element is available but still the click fails, an exception is caught.

Using delayed time is a common practice in test automation to create a pause in between the steps. By adding a Try/Catch we ensure 
that the program continues even if the wait couldn’t help.

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
try {
driver.findElement(By.id("submit")).click();
} catch (WebDriverException e) {
System.out.println(“An exceptional case.”);
}
} catch (TimeOutException e) {
System.out.println(“WebDriver couldn’t locate the element”);
}


##########################################################
Lets put incorrecrt css .....
WebElement ele = driver.findElement(By.cssSelector("input.gLFyf gsfi"));

Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"input.gLFyf gsfi"}
  (Session info: chrome=83.0.4103.97)
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:25:48'

	 */
	}

}
