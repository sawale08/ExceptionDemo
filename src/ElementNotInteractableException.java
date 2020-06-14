
public class ElementNotInteractableException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		WebDriver gmail= new ChromeDriver();
gmail.get("https://www.gmail.co.in"); 
gmail.findElement(By.id("Email")).sendKeys("abcd");
gmail.findElement(By.id("next")).click();
WebDriverWait wait = new WebDriverWait(gmail, 10);
WebElement element = wait.until(
ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
gmail.findElement(By.id("Passwd")).sendKeys("xyz");

Explanation: The reason selenium can't find the element is because the id of the password input field is initially Passwd-hidden. 
After you click on the "Next" button, Google first verifies the email address entered and then shows the password input field 
(by changing the id from Passwd-hidden to Passwd). So, when the password field is still hidden (i.e. Google is still verifying the email id), 
your webdriver starts searching for the password input field with id Passwd which is still hidden. And hence, an exception is thrown.









		 */
	}

}
