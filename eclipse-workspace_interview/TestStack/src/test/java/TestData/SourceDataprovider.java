package TestData;

import org.testng.annotations.DataProvider;

public class SourceDataprovider {
	@DataProvider
	public static Object[][] signup()
	{
		Object[][] data = new Object[1][3];
		data[0][0]="user1";
		data[0][1]="user1@test.com";
		data[0][2]="user1@password";
		return data;
	}

}
