package HW20;

public class Shop {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public void returnCost(String productName, double productCost, Seller seller, Buyer buyer) {

        if (productName.contains("alcohol") && buyer.getAge() < 18) {
            if (seller.honest()) {
                System.out.println("Продажа алкоголя ЗАПРЕЩЕНА несовершеннолетним.");
                return;
            } else {
                System.out.println(" Продавец допускает продажу алкоголя несовершеннолетним.");
            }
        }
            double сost = productCost;
            if (buyer.hasDiscountCard()) {
                сost *= 0.9;
                System.out.println(" Уважаемый " + buyer.getName() + ", продавец " + seller.getName() + " нашего магазина " + "\"" + name + "\", продаст вам этот товар " + productName +
                        ",\n у нас есть алкогольная продукция, а Ваш возраст " + buyer.getAge() + ". \n Стоимость вашей покупки равна " + сost + " грн.\n"
                        + " У Вас скидка в размере 10 %.");
            } else {
                System.out.println(" Уважаемый " + buyer.getName() + ", продавец " + seller.getName() + " нашего магазина " + "\"" + name + "\", продаст вам этот товар " + productName +
                        ",\n у них есть алкогольная продукция, а Ваш возраст " + buyer.getAge() + ". \n Стоимость вашей покупки равна " + сost + " грн.\n"
                        + " У Вас нет скидки.");
            }


        }

    }

