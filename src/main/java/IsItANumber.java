//Класс для проверки является ли введенный символ (символы) неотрицательным целым или вещественным числом.
public class IsItANumber {

    public boolean naturalNum(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public boolean doubleNum(String str) {
        int nubmerOfDots = 0;
        for (char c : str.toCharArray()) {
            if (c == '.') nubmerOfDots += 1;
            if (!(Character.isDigit(c) || c == '.') || nubmerOfDots > 1) return false;
        }
        return true;
    }
}
