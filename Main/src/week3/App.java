package week3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import com.sun.net.httpserver.Authenticator.Failure;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathematicsTest.class);
		System.out.println("Error Count is " + result.getFailureCount());
		for(org.junit.runner.notification.Failure f:result.getFailures())
		{
			System.out.println(f.getMessage());
		}


	}

}
