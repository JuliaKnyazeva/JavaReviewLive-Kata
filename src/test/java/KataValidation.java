import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class KataValidation {

    @Test
    public void tests() {
        assertEquals("(123) 456-7890", PhoneNumberFromArray.createPhoneNumber(new int[] {1, 2, 3, 4, 5,
                6, 7, 8, 9, 0}));
    }

    @Test
    public void testsRegEx() {
        assertEquals("(123) 456-7890", PhoneNumberFromArray.createPhoneNumber(new int[] {1, 2, 3, 4, 5,
                6, 7, 8, 9, 0}));
    }



}
