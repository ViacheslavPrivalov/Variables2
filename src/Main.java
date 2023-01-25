public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 1;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 2;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 3;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 4L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5.0f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6.0;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float x = 27.12f;
        System.out.println(x);
        long x1 = 987678965549L;
        System.out.println(x1);
        double x2 = 2.786;
        System.out.println(x2);
        short x3 = 569;
        System.out.println(x3);
        short x4 = -159;
        System.out.println(x4);
        int x5 = 27897;
        System.out.println(x5);
        byte x6 = 67;
        System.out.println(x6);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        short firstTeacher = 23;
        short secondTeacher = 27;
        short thirdTeacher = 30;
        short totalSheets = 480;
        int sheetPerPerson = totalSheets / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика рассчитано " + sheetPerPerson + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int initBottles = 16;
        int workTime = 2; //минуты
        int machineIntensity = initBottles / workTime;
        int machinePerforming1 = machineIntensity * 20;
        System.out.println("За 20 минут машина произвела " + machinePerforming1 + " штук бутылок");
        int machinePerforming2 = machineIntensity * 24 * 60;
        System.out.println("За сутки машина произвела " + machinePerforming2 + " штук бутылок");
        int machinePerforming3 = machineIntensity * 3 * 24 * 60;
        System.out.println("За 3 дня машина произвела " + machinePerforming3 + " штук бутылок");
        int machinePerforming4 = machineIntensity * 30 * 24 * 60;
        System.out.println("За месяц машина произвела " + machinePerforming4 + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int totalCans = 120;
        int totalClasses = totalCans / 6;
        int brownCans = totalClasses * 2;
        int whiteCans = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int bananaWeight = 80;
        short bananaQuantity = 5;
        int milkWeight = 105;
        short milkQuantity = 2;
        int icecreamWeight = 100;
        short icecreamQuantity = 2;
        int eggWeight = 70;
        short eggQuantity = 4;
        int breakfastWeight = bananaWeight * bananaQuantity + milkWeight * milkQuantity + icecreamWeight * icecreamQuantity + eggWeight * eggQuantity;
        System.out.println("Завтрак в граммах: " + breakfastWeight);
        System.out.println("Завтрак в килограммах: " + (float) breakfastWeight / 1000);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int totalWeight = 7;
        float lightWeightLoss = 0.250f;
        float hardWeightLoss = 0.500f;
        float totalLightDays = totalWeight / lightWeightLoss;
        System.out.println("Легкий вариант похудения: " + totalLightDays);
        float totalHardDays = totalWeight / hardWeightLoss;
        System.out.println("Жесткий вариант похудения: " + totalHardDays);
        float totalMediumDays = totalWeight / ((lightWeightLoss + hardWeightLoss) / 2);
        System.out.println("Средний вариант похудения: " + totalMediumDays);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int baseSalaryMasha = 67760;
        int baseSalaryDenis = 83690;
        int baseSalaryKristina = 76230;
        int newSalaryMasha = (int) (baseSalaryMasha * 1.1);
        int newSalaryDenis = (int) (baseSalaryDenis * 1.1);
        int newSalaryKristina = (int) (baseSalaryKristina * 1.1);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newSalaryMasha * 12 - baseSalaryMasha * 12) + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (newSalaryDenis * 12 - baseSalaryDenis * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (newSalaryKristina * 12 - baseSalaryKristina * 12) + " рублей.");
    }
}