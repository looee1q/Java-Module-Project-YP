public class Item {

    String nameOfItem;
    double priceOfItem;

    public String addAnItem() {
        System.out.println("Введите название товара.");
        nameOfItem = Main.sc.nextLine();
        return nameOfItem;
    }

    public double addAnItemPrice() {
        IsItANumber checkedString = new IsItANumber();
        System.out.println("Введите стоимость товара в формате \"рубли.копейки\".");
        while(true) {
            String priceOfItem = Main.sc.nextLine();
            if (!(checkedString.doubleNum(priceOfItem))) {
                System.out.println("Ошибка: \"Введен недопустимый символ или отрицательное число!\" Повторите ввод стоимости товара в виде числа!");
            }
            else {
                this.priceOfItem = Double.parseDouble(priceOfItem);
                return this.priceOfItem;
            }
        }
    }

}
