package HW20;

public class Seller extends Person {
        private boolean honest;

        public Seller(String name, int age, boolean honest) {
            super(name, age);
            this.honest = honest;
        }

        public boolean honest() {
            return honest;
        }

        public void setHonest(boolean honest1) {
            honest = honest1;
        }

        @Override
        public void role() {
            System.out.println("Я продавец");
        }
    }

