package shoppingcart;

public class Buy3For2ShoppingOffer implements IShoppingOffers {


    @Override
    public int newOfferDetail(Integer[] itemsPrice) {

        int numberOfItems = itemsPrice.length;

        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /3) * 2 * itemsPrice[0] +(numberOfItems %3) * itemsPrice[0];
    }
}
