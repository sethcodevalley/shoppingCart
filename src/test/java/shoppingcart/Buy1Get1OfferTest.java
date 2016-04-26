package shoppingcart;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

import shoppingcart.Buy1Get1ShoppingOffer;

public class Buy1Get1OfferTest {

    @Test
    public void shouldApply_Buy1Get1_Offer() throws Exception {
        //given
        Buy1Get1ShoppingOffer buy1Get1Offer = new Buy1Get1ShoppingOffer();

        //when

        //then
        assertThat("1 Item", buy1Get1Offer.newOfferDetail(new Integer[]{60}), is(60));
        assertThat("2 Item", buy1Get1Offer.newOfferDetail(new Integer[]{60,60}), is(60));
        assertThat("3 Item", buy1Get1Offer.newOfferDetail(new Integer[]{60,60,60}), is(120));
    }
}