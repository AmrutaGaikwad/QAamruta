package taxTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaxManTest {

   
  @Test(description="Tests the costestimator method")
  public void testcostEstimator() {
	TaxMan tax = new TaxMan();
	
	Assert.assertEquals(tax.costEstimator("Handbag", "luxury", 100), 109.0,0.0001);

	Assert.assertEquals(tax.costEstimator("Shoes", "basic", 25), 25.25,0.0001);

  }

 

  @Test(description="Tests the input")
  public void testisValidInput() {
   
	  TaxMan tax = new TaxMan();
	  Assert.assertEquals(tax.isValidInput(-20), false);
	  
	  Assert.assertEquals( tax.isValidInput(0), false);
	  
	  Assert.assertEquals( tax.isValidInput(90), true);
	  
	  Assert.assertEquals( tax.isValidInput((float) 0.0), false);
	  
	  Assert.assertEquals( tax.isValidInput((float) -3.4), false);
	  
	  
  }
  
 
}

