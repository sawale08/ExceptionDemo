
public class InvalidSelectorException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 his subclass of NoSuchElementException class occurs when a selector is incorrect or syntactically invalid. 
 This exception occurs commonly when XPATH locator is used.

Consider the below example:

clickXPathButtonAndWait(“//button[@type='button'][100]”);

This would throw an InvalidSelectorExeption because the XPATH syntax is incorrect.

Avoiding and Handling: To avoid this, we should check the locator used because the locator is likely incorrect or the syntax is wrong.
 Using Firebug to find xpath can reduce this exception.
 */
	}

}
