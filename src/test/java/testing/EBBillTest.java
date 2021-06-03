package testing;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import static org.junit.Assert.*;


public class EBBillTest
{
    
    //Write JUNIT Test Code
    
    
    @Test
    public void testCalculateBillAmount1(){
        EBBill eb = new EBBill(50);
        assertTrue(130==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount2(){
        EBBill eb = new EBBill(100);
         assertTrue(292.5==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount3(){
        EBBill eb = new EBBill(200);
         assertTrue(818.5==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount4(){
        EBBill eb = new EBBill(1000);
         assertTrue(7018.5==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount5(){
        EBBill eb = new EBBill(5000);
         assertTrue(47018.5==eb.calculateBillAmount());
    }
    
    @Test
    public void testCalculateBillAmount6(){
        EBBill eb = new EBBill(0);
         assertTrue(0==eb.calculateBillAmount());
    }
    
}