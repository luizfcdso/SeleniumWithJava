package mywork;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners

public class Listeners implements ITestListener {
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        // Implementa��o para quando o teste inicia
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Implementa��o para quando o teste � bem sucedido
	    	System.out.println("esse teste foi bem sucedido = " +result.getName());
	    	Assert.assertTrue(false);
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Implementa��o para quando o teste falha
	    	System.out.println("Esse teste falhou = " + result.getName());
	    	Assert.assertTrue(false);
	    	
	    }
	    
	    @Override
	    public void onTestSkipped(ITestResult result) {
	    }
	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        
	    }
	    @Override
	    public void onFinish(ITestContext context) {
	        // Implementa��o para executar a��es ap�s a conclus�o da execu��o dos testes
	    }
}
