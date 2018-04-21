package Com.Test;

import org.testng.annotations.Test;

public class ExceptionTimePutTest {
  @Test(invocationTimeOut=2)
  public void infiniteLoop() {
	  int i=1;
	  while(i==1) {
		  System.out.println(i);
	  }
  }
}
