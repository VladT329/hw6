public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            month = month + 1;
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print(i + " ");
        for (; i > 1; ) {
            i = i - 1;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int mortality = 8;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            birthRate = population / 1000 * 17;
            population = population + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();

        System.out.println("Задание 4");
        int summ = 15_000;
        month = 0;
        while (summ < 12_000_000) {
            month = month + 1;
            summ = summ + summ * 7 / 100;
            System.out.println("В " + month + " месяце сумма вклада составлет " + summ);
        }
        System.out.println();

        System.out.println("Задание 5");
        summ = 15_000;
        month = 0;
        while (summ < 12_000_000) {
            month = month + 1;
            summ = summ + summ * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяце сумма вклада составлет " + summ);
            }
        }
        System.out.println();
        System.out.println("Задание 6");
        summ = 15000;
        month = 0;
        while (month < 108) {
            month = month + 1;
            summ = summ + summ * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма " + summ);
            }
        }
        System.out.println();

        System.out.println("Задание 7");
        int firstFriday = 1;
        while (firstFriday < 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо сделать отчет");
            firstFriday = firstFriday + 7;
        }
        System.out.println();

        System.out.println("Задание 8");
        year = 0;
        int lastYear = (2024 - 200);
        int futureYears = (2024 + 100);
        while (year < futureYears) {
            year = year + 79;
            if ((year < 2024 && year > lastYear) || (year>2024 && year<futureYears)) {
                System.out.println(year);
            }
        }
    }
}