
public class ElementNotSelectableException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 This exception comes under InvalidElementStateException class.
  ElementNotSelectableException indicates that the web element is present in the web page but cannot be selected.

For example, the below code can throw a ElementNotSelectableException if the id “swift” is disabled.

Select dropdown = new Select(driver.findElement(By.id(“swift”)));

Exception Handling:

try {
Select dropdown = new Select(driver.findElement(By.id(“swift”)));
} catch (ElementNotSelectableException e)

In this case, exception is thrown even if the element becomes enabled after a while.

Avoiding-And-Handling: We can add a wait command to wait until the element becomes clickable. 
If there is still an exception, it is caught.

Avoiding-And-Handling: We can add a wait command to wait until the element becomes clickable. If there is still an exception, it is caught.

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions. elementToBeClickable(By.id(”swift”));
try {
Select dropdown = new Select(driver.findElement(By.id("swift")));
} catch (WebDriverException e) {
System.out.println(“Exceptional case”);
}
} catch (TimeOutException e)
System.out.println(“WebDriver found that this element was not selectable.”);
}

 */
	}

}
