package shoppingcart;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

public class CheckOutWithOutOfferTest {

    private CheckoutSystemWithOutOffer checkoutSystemWithOutOffer;

    @Before
    public void setUp() throws Exception {
        checkoutSystemWithOutOffer = new CheckoutSystemWithOutOffer();
    }
    
    @Test
    public void printReceiptForApplesAndOrangeWithoutOffer() throws Exception {
        //given

        //when

        //then    	
        assertThat("1 Apple", checkoutSystemWithOutOffer.printReceipt(asList("Apple")), is("£0.60"));
        assertThat("2 Apple", checkoutSystemWithOutOffer.printReceipt(asList("Apple","Apple")), is("£1.20"));
        assertThat("3 Orange", checkoutSystemWithOutOffer.printReceipt(asList("Apple", "Apple", "Orange")), is("£1.45"));
        assertThat("3 Apple", checkoutSystemWithOutOffer.printReceipt(asList("Apple", "Apple", "Orange", "Apple")), is("£2.05"));
    }
    
}