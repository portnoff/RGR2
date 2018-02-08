package Test; 
import org.junit.Test; 
import junit.framework.Assert; 
import star.star; 
public class Testone { 
@Test 
public void testone(){ 
star k = new star(); 
float A=k.Calculation(2, 1920, 1080, 32, 120, 60); 
if(A!=113906.25)Assert.fail(); 
}}