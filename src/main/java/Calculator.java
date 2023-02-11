public class Calculator {

    String listOfGoods = "";
    double totalPrice = 0;

    public void formAListOfGoodsAndTheirPrice() {
        while (true) {
            Item item = new Item();
            String nameOfItem = item.addAnItem();
            double priceOfItem = item.addAnItemPrice();
            listOfGoods += nameOfItem + " " + String.format("%.2f", item.priceOfItem) + "\n";
            totalPrice += priceOfItem;
            System.out.println("Товар успешно добавлен! Вы хотите добавить еще товар?");
            System.out.println("Введите команду \"Завершить\" для того, чтоб завершить процесс добавления товаров.");
            String addOneMore = Main.sc.nextLine();
            if (addOneMore.equalsIgnoreCase("завершить")) break;
        }
    }

}