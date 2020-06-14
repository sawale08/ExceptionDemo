
public class UnreachableBrowserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 
 Your browser instance is not closed properly. So checkout from your task manager whether it is killing 
 the driver when you are calling driver.close() method. I have observed it for mostly chrome and IE. 
 For Firefox it will automatically closes the instance.

FF and Webdriver version should be compatible to each other. Change your Webdriver jars and try it.

There may be unwanted jar present in your project. Xalan.jar is what gave me problem once. Remove it and see.

 */
	}

}
