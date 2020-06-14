
public class SessionNotCreatedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Error:
			Starting ChromeDriver 2.23.409699 (49b0fa931cda1caad0ae15b7d1b68004acd05129) on port 42985
			Only local connections are allowed.
			Exception in thread "main" org.openqa.selenium.SessionNotCreatedException: session not created exception
			from unknown error: Runtime.executionContextCreated has invalid 'context': {"auxData":{"frameId":"7576.1","isDefault":true},"id":1,"name":"","origin":"://"}
			  (Session info: chrome=54.0.2840.59)
			(Driver info: chromedriver=2.23.409699 (49b0fa931cda1caad0ae15b7d1b68004acd05129),platform=Windows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)
			  Command duration or timeout: 2.48 seconds
			Build info: version: 'unknown', revision: '2aa21c1', time: '2016-08-02 14:59:43 -0700'
			System info: host: 'SUJITH', ip: '192.168.43.228', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '1.8.0_101'
			Driver info: org.openqa.selenium.chrome.ChromeDriver
				at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
				at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
				at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
 				at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
 				
 		
 		Try to look for your Selenium version and then checkout which version of Chrome driver is supported by Selenium Webdriver? 
 		Or simply check whether there's any mismatch in versions between Selenium Webdriver and Chrome Driver.
 		
 		 Selenium installed and driver.exe installed are not in sync
*/
	}

}
