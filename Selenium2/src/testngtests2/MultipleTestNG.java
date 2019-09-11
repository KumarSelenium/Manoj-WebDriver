package testngtests2;

import org.testng.annotations.Test;

public class MultipleTestNG 
{
@Test(priority=1)
public void appLaunch()
{
	System.out.println("appLaunch");
}
@Test(priority=3)
public void appLogin()
{
	System.out.println("appLogin");
}
@Test(priority=2)
public void appClose()
{
	System.out.println("appClose");
}

}
