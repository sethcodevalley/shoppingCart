package shoppingcart;

import static java.util.Collections.frequency;
import static java.util.Collections.nCopies;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

public class CheckoutSystemWithOffer {


    private static final int APPLE_COST = 60;
    private static final int ORANGE_COST = 25;
    private static final String APPLE = "Apple";
    private static final String ORANGE = "Orange";

    private ShoppingOfferTypeFactory offerServiceFactory;

    public CheckoutSystemWithOffer(ShoppingOfferTypeFactory offerServiceFactory) {
        this.offerServiceFactory = offerServiceFactory;
    }

    public String printReceipt(List<String> shoppingCart) {

        BigDecimal total = new BigDecimal(scan(shoppingCart) * .01);

        return NumberFormat.getCurrencyInstance().format(total);
    }

    private int scan(List<String> shoppingCart) {

        int total = 0;

        int apples = frequency(shoppingCart, APPLE);
        total += offerServiceFactory.offerType(APPLE).newOfferDetail(nCopies(apples, APPLE_COST).toArray(new Integer[apples]));

        int oranges = frequency(shoppingCart, ORANGE);
        total += offerServiceFactory.offerType(ORANGE).newOfferDetail(nCopies(oranges, ORANGE_COST).toArray(new Integer[oranges]));

        return total;
    }


}
