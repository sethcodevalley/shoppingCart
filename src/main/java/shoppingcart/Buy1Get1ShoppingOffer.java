package shoppingcart;

public class Buy1Get1ShoppingOffer implements IShoppingOffers {


    @Override
    public int newOfferDetail(Integer[] itemsPrice) {
        int numberOfItems = itemsPrice.length;
        
        if(numberOfItems==0){
            return 0;
        }

        return (numberOfItems /2)* itemsPrice[0] + (numberOfItems %2)* itemsPrice[0];
    }
}
