package week_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static week_1.Question_5_Parcel_Delivery.calculatePrice;
import static week_1.Question_5_Parcel_Delivery.canShip;

public class Question_6_ParcelDelivery_Test {
    
    @Test(timeout=3000)
    public void testCanShip() {
        
        // Some valid weights
        assertTrue(canShip(0.1));
        assertTrue(canShip(10));
        assertTrue(canShip(30));
        
        
        assertFalse("-1 should not be a valid weight for a parcel", canShip(-1));
        assertFalse("0 should not be a valid weight for a parcel", canShip(0));
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT.  Use the MAX_WEIGHT variable in your method.", canShip(Question_5_Parcel_Delivery.MAX_WEIGHT + 1));
        
        // Checking if the code uses the MAX_WEIGHT variable
        Question_5_Parcel_Delivery.MAX_WEIGHT = 10;
        assertFalse("The parcel's weight should not exceed MAX_WEIGHT. Use the MAX_WEIGHT variable in your method.", canShip(Question_5_Parcel_Delivery.MAX_WEIGHT + 5));
        
    }
    
    @Test(timeout=3000)
    public void testCalculatePrice() {
    
            /*	Up to 10 pounds: $2.15 per pound
                Up to 20 pounds: $1.55 per pound
                Up to 30 pounds: $1.15 per pound
            */
            
        double delta = 0.00001; // Numbers must be within this value of each other to be considered the same
        
        assertEquals("A 5 pound parcel should cost " + (5 * 2.15),  5 * 2.15, calculatePrice(5), delta);
        assertEquals("A 10 pound parcel should cost " + (10 * 2.15), 10 * 2.15, calculatePrice(10), delta);
        assertEquals("A 14 pound parcel should cost " + (14 * 1.55),  14 * 1.55, calculatePrice(14), delta);
        assertEquals("A 20 pound parcel should cost " + (20 * 1.55),  20 * 1.55, calculatePrice(20), delta);
        assertEquals("A 22 pound parcel should cost " + (22 * 1.15),  22 * 1.15, calculatePrice(22), delta);
        assertEquals("A 30 pound parcel should cost " + (30 * 1.15),  30 * 1.15, calculatePrice(30), delta);
        
        
    }
}