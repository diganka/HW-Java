package HW20;

public class Buyer extends Person  {
        private boolean hasDiscountCard;

        public Buyer(String name, int age, boolean hasDiscountCard) {
            super(name, age);
            this.hasDiscountCard = hasDiscountCard;
        }

        public boolean hasDiscountCard() {
            return hasDiscountCard;
        }

        public void role() {
            System.out.println("Я покупатель");
        }
    }

