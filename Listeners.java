package mywork;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements Testng listeners

public class Listeners implements ITestListener {
	
	 @Override
	    public void onTestStart(ITestResult result) {
	        // Implementação para quando o teste inicia
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        // Implementação para quando o teste é bem sucedido
	    	System.out.println("esse teste foi bem sucedido = " +result.getName());
	    	Assert.assertTrue(false);
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        // Implementação para quando o teste falha
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
	        // Implementação para executar ações após a conclusão da execução dos testes
	    }
}
