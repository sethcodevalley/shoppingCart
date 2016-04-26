package shoppingcart;

import org.junit.Before;
import org.junit.Test;

import shoppingcart.CheckoutSystemWithOffer;
import shoppingcart.ShoppingOfferTypeFactory;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckOutWithOfferTest {

    private CheckoutSystemWithOffer checkoutSystemWithOffer;

    @Before
    public void setUp() throws Exception {
        checkoutSystemWithOffer = new CheckoutSystemWithOffer(new ShoppingOfferTypeFactory());
    }
    
    
    @Test
    public void printReceiptForApplesAfterBuyOneGetOneOffer() throws Exception {
        //given

        //when

        //then
        assertThat("1 Apple", checkoutSystemWithOffer.printReceipt(asList("Apple")), is("£0.60"));
        assertThat("2 Apple", checkoutSystemWithOffer.printReceipt(asList("Apple","Apple")), is("£0.60"));
        assertThat("3 Apple", checkoutSystemWithOffer.printReceipt(asList("Apple", "Apple", "Apple")), is("£1.20"));
    }

    @Test
    public void printReceiptForOrangesAfter3For2Offer() throws Exception {
        //given

        //when

        //then
        assertThat("1 Orange", checkoutSystemWithOffer.printReceipt(asList("Orange")), is("£0.25"));
        assertThat("2 Orange", checkoutSystemWithOffer.printReceipt(asList("Orange", "Orange")), is("£0.50"));
        assertThat("3 Orange", checkoutSystemWithOffer.printReceipt(asList("Orange", "Orange","Orange")), is("£0.50"));
        assertThat("4 Orange", checkoutSystemWithOffer.printReceipt(asList("Orange", "Orange","Orange","Orange")), is("£0.75"));
    }

    @Test
    public void printReceiptForApplesAndOrangesCombinationAfterOffers() throws Exception {
        //given

        //when

        //then
        assertThat("2 Apple, 1 Orange", checkoutSystemWithOffer.printReceipt(asList("Apple", "Apple", "Orange")), is("£0.85"));
        assertThat("2 Apple, 3 Oranges", checkoutSystemWithOffer.printReceipt(asList("Apple", "Apple", "Orange", "Orange", "Orange")), is("£1.10"));
    }


}