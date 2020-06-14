
public class NoSuchFrameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 When WebDriver is trying to switch to an invalid frame, NoSuchFrameException under NotFoundException class is thrown.

The below code can throw org.openqa.selenium.NoSuchFrameException if a frame “frame_11” doesn’t exist or is not available.

driver.switchTo().frame(“frame_11”);

Exception Handling:

try {
driver.switchTo().frame("frame_11");
} catch (NoSuchFrameException e)
In this case, the exception is thrown even if the frame is not loaded.

Avoiding-And-Handling: Try to give a wait command.

In the example below, WebDriver waits for 10 seconds for the frame to be available. If the frame is available and still there is an exception, then it is caught.

try {
WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(10));
wait.Until(ExpectedConditions.frameToBeAvaliableAndSwitchToIt(frame_11));
try {
driver.switchTo().frame("frame_11");
} catch (WebDriverException e) {
System.out.println(“An exceptional case”);
}
} catch (TimeOutException e) {
System.out.println(“WebDriver couldn’t locate the frame”);
}
 */
	}

}
