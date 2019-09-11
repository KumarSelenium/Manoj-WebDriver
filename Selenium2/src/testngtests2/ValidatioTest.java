package testngtests2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidatioTest 
{
@Test
public void validation()
{
	String data1="Manoj";
	String data2="Manoj";
	
	Assert.assertEquals(data1, data2);
}
}

