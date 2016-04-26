package shoppingcart;

import static java.util.Collections.frequency;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

public class CheckoutSystemWithOutOffer {


    private static final int APPLE_COST = 60;
    private static final int ORANGE_COST = 25;
    private static final String APPLE = "Apple";
    private static final String ORANGE = "Orange";



    public String printReceipt(List<String> shoppingCart) {

        BigDecimal total = new BigDecimal(scan(shoppingCart) * .01);

        return NumberFormat.getCurrencyInstance().format(total);
    }

    private int scan(List<String> shoppingCart) {

        int total = 0;

        int apples = frequency(shoppingCart, APPLE);
        total += apples*APPLE_COST;

        int oranges = frequency(shoppingCart, ORANGE);
        total += oranges*ORANGE_COST;

        return total;
    }


}
