package shoppingcart;

public class ShoppingOfferTypeFactory {

    private static final String APPLE = "apple";
    private static final String ORANGE = "orange";

	public IShoppingOffers offerType(String item) {
        switch(item.toLowerCase()) {
            case APPLE:
                return new Buy1Get1ShoppingOffer();
            case (ORANGE):
                return new Buy3For2ShoppingOffer();
            default:
                throw new IllegalArgumentException(item + "Invalid item");
        }
    }

}
