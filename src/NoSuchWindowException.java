
public class NoSuchWindowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	NoSuchWindowException comes under NotFoundException class. This is thrown when WebDriver tries to switch to an invalid window.

The below code can throw org.openqa.selenium.NoSuchWindowException if the window handle doesn’t exist or is not available to switch.

driver.switchTo().window(handle_1);

Avoiding-And-Handling: We would use window handles to get the set of active windows and then perform actions on the same.

In the example below, for each window handle, driver switch to is executed. Therefore chances of passing a wrong window parameter reduced.

for (String handle : driver.getWindowHandles()) {
try {
driver.switchTo().window(handle);
} catch (NoSuchWindowException e) {
System.out.println(“An exceptional case”);
}
}



	 */
	}

}
