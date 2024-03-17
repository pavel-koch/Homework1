public class Main {
    public static void main(String[] args) {
        // Первая задача
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Первая задача");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Вторая задача
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Вторая задача");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Третья задача
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Третья задача");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        //Четвертая задача
        System.out.println("Четвертая задача");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Пятая задача
        System.out.println("Пятая задача");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        //Шестая задача
        System.out.println("Шестая задача");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + totalWeight + " кг");
        var differenceWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в вес двух бойцов = " + differenceWeight + " кг");

        //Седьмая задача
        System.out.println("Седьмая задача видимо выше уже готова");

        //Восьмая задача
        System.out.println("Восьмая задача");
        var hoursWork = 640;
        var timeWork = 8;
        var amountWorkers = hoursWork / timeWork;
        System.out.println("Всего работников в компании — " + amountWorkers + " человек");
        amountWorkers = amountWorkers + 94;
        timeWork = hoursWork / amountWorkers;
        System.out.println("Если в компании работает " + amountWorkers + " человек, то всего "
                + timeWork + " часов работы может быть поделено между сотрудниками");

    }
}