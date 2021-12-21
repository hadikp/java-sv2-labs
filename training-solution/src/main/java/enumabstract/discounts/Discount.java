package enumabstract.discounts;

public enum Discount implements AmountToPay {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return price * 0.8 * pieces;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            double productPrice = 0;
            if (pieces == 1 || pieces == 2) {
                productPrice = price * 0.75 * pieces;
            }
            if (pieces >= 3) {
                productPrice = price * 0.5 + price * 0.75 * (pieces - 1);
            }
            return productPrice;
        }
    }
}
