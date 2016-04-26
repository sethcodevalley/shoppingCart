package shoppingcart;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import shoppingcart.Buy3For2ShoppingOffer;

public class Buy3For2OfferTest {

    @Test
    public void shouldApply_3For2_Offer() throws Exception {
        //given
        Buy3For2ShoppingOffer buy3For2Offer = new Buy3For2ShoppingOffer();

        //when

        //then
        assertThat("1 item",buy3For2Offer.newOfferDetail(new Integer[]{60}), is(60));
        assertThat("2 item",buy3For2Offer.newOfferDetail(new Integer[]{60,60}), is(120));
        assertThat("3 item",buy3For2Offer.newOfferDetail(new Integer[]{60,60,60}), is(120));
        assertThat("4 item",buy3For2Offer.newOfferDetail(new Integer[]{60,60,60,60}), is(180));
    }
}