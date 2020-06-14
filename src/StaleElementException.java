
public class StaleElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Stale --> Not fresh/Not New/it has become stale
		
		/*
	This exception says that a web element is no longer present in the web page.
This error is not the same as ElementNotVisibleException.
StaleElementReferenceException is thrown when an object for a particular web element was created in the program without any problem and 
however; this element is no longer present in the window. This can happen if there was a

Navigation to another page
DOM has refreshed
A frame or window switch

WebElement firstName = driver.findElement(By.id(“firstname”));
driver.switchTo().window(Child_Window);
element.sendKeys(“Aaron”);
In the code above, object firstName was created and then the window was switched. Then, WebDriver tries to type ‘Aaron’ in the form field. 
In this case StaleElementReferenceException is thrown.


Confirm that we are trying to do the action in the correct window. To avoid issues due to DOM refresh, we can use Dynamic Xpath.



Let’s discuss another example.

Say ‘id’ of a username field is ‘username_1’ and the XPath will be //*[@id=’firstname_1?]. 
When you open the page again the ‘id’ might change say to ‘’firstname _11’. 
In this case, the test will fail because the WebDriver could not find the element. 
In this case, StaleElementReferenceException will be thrown.

In this case, we can use a dynamic xpath like,

try {
driver.findElement(By.xpath(“//*[contains(@id,firstname’)]”)).sendKeys(“Aaron”);
} catch (StaleElementReferenceException e)
In the example above dynamic XPATH is used and if the exception is still found, it is caught.


Solution:
1. Use WebDriverWait
2. Use for loop until element is found and the put break.
for(int i=0i<=2;i++)
 
{
  try{
    Driver.findElement(By.id()).click();
    break;
 }
 catch(Exception e)
{
 Sysout(e.getMessage());
 }
 
		 */
	}

}
