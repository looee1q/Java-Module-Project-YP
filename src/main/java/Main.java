import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Первая часть задачи (ввод количества человек):
        System.out.println("На скольких человек необходимо разделить счёт?");
        int personsNumber = correctedPersonsNumber();

        //Вторая часть задачи (формирование списка продуктов и подсчет их общей суммы):
        Calculator calculator = new Calculator();
        calculator.formAListOfGoodsAndTheirPrice();

        //Третья часть задачи (вывод списка товаров и суммы, которую должен заплатить каждый человек):
        System.out.println("Добавленные товары:\n" + calculator.listOfGoods);
        System.out.printf("С каждого %.2f %s!%n", calculator.totalPrice / personsNumber, rubInCorrectCase(calculator.totalPrice / personsNumber));
    }

    public static int correctedPersonsNumber() {
        IsItANumber checkedInput = new IsItANumber();
        while (true) {
            String personsNumber = sc.nextLine();
            if (!checkedInput.naturalNum(personsNumber)) {
                System.out.println("Ошибка: \"Введен недопустимый символ или отрицательное число!\" Повторите ввод!");
            } else if (Integer.parseInt(personsNumber) <= 1) {
                System.out.println("Ошибка: \"Введенное количество человек меньше двух\"! Повторите ввод!");
            } else return Integer.parseInt(personsNumber);
        }
    }

    public static String rubInCorrectCase(double sumOfEachPerson) {
        int a = (int) sumOfEachPerson;
        String rub;
        if (a%10 == 1 && a%100 != 11) rub = "рубль";
        else if ((a%10 >= 2 && a%10 <= 4) && (a%100 != 12 && a%100 != 13 && a%100 != 14)) rub = "рубля";
        else rub = "рублей";
        return rub;
    }

}