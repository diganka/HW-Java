package HW20;

public class Main {
        public static void main(String[] args) {
            Shop shop = new Shop("Теремок");
            Seller seller = new Seller("Артем", 28, true);
            Buyer buyer = new Buyer("Денис", 18, true);
            shop.returnCost("alcohol wiskey \"Jack Danial's\"", 679, seller, buyer);
        }
}
