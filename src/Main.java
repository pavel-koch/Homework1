public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 33000;
        byte b = 22;
        short c = 128;
        long d = 3000000000L;
        float e = 7.62f;
        double f = 5.45;
        System.out.println("Значение переменной 'а' c типом int равно " + a);
        System.out.println("Значение переменной 'b' c типом byte равно " + b);
        System.out.println("Значение переменной 'c' c типом short равно " + c);
        System.out.println("Значение переменной 'd' c типом long равно " + d);
        System.out.println("Значение переменной 'e' c типом float равно " + e);
        System.out.println("Значение переменной 'f' c типом double равно " + f);

        // Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        double i = 2.786; // По задаче 2,786 - скорее всего опечатка (можно и float использовать)
        short j = 569;
        short k = -159;
        int l = 27897; // short тоже хватит, но так все типы отразил)
        byte m = 67;

        // Задача 3
        System.out.println("Задача 3");
        byte classLydmili = 23;
        byte classAnna = 27;
        byte classEkaterini = 30;
        short list = 480;
        int summStudents = classLydmili + classAnna + classEkaterini;
        System.out.println("Всего учеников " + summStudents);
        int paperStudent = list / summStudents;
        System.out.println("Каждому ученику достанется по " + paperStudent + " листов");

        // Задача 4
        System.out.println("Задача 4");
        byte capacity = 8; // 8 бутылок в минуту
        int sizeTwentyMin = capacity * 20;
        int sizeDay = capacity * 60 * 24;
        int sizeThreeDay = sizeDay * 3;
        int sizeMonth = sizeDay * 31;
        System.out.println("За 20 минут машина произвела " + sizeTwentyMin + " штук бутылок");
        System.out.println("За день машина произвела " + sizeDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + sizeThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + sizeMonth + " штук бутылок");

        // Задача 5
        System.out.println("Задача 5");
        byte sumColor = 120;
        byte colorWhite = 2;
        byte colorBrown = 4;
        int sumClassov = sumColor / (colorWhite + colorBrown);
        int sumWhiteColor = sumClassov * colorWhite;
        int sumBrownColor = sumClassov * colorBrown;
        System.out.println("В школе, где " + sumClassov + " классов, нужно "
                + sumWhiteColor + " банок белой краски и " + sumBrownColor
                + " банок коричневой краски ");

        // Задача 6
        System.out.println("Задача 6");
        int weightBananas = 5 * 80;
        int weightMilk = 2 * 105;
        int weightIceCream = 2 * 100;
        int weightEggs = 4 * 70;
        int weightMixGr = weightBananas + weightMilk + weightIceCream + weightEggs;
        float weightMixKg = weightMixGr / 1000f;
        System.out.println("Вес в граммах = " + weightMixGr + " гр");
        System.out.println("Вес в килограммах = " + weightMixKg + " Кг");








    }
}