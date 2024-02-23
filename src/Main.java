public class Main {
public static void checkingTheYear (int year){
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println("Год " + year + " является високосным");
    }
    else {
        System.out.println("Год " + year + " не является високосным");
    }
}
public static void installingOS (int OS, int yearOfPhone){
    if (OS == 1 && yearOfPhone > 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    if (OS == 0 && yearOfPhone > 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    if (OS == 1 && yearOfPhone <= 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    if (OS == 0 && yearOfPhone <= 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
}
public static void calculatingOfTheDeliveryTime (int deliveryDistance){
    if (deliveryDistance <= 20) {
        System.out.println("Доставка займет сутки");
    }
    if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Доставка займет два дня");
    }
    if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Доставка займет три дня");
    }
    if (deliveryDistance > 100) {
        System.out.println("Доставки нет");
    }

}
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 1800;
        checkingTheYear(year);
        System.out.println("Задача 2");
        int OS = 0;
        int yearOfPhone = 2016;
        installingOS(OS,yearOfPhone);
        System.out.println("Задача 3");
        int deliveryDistance = 3;
        calculatingOfTheDeliveryTime(deliveryDistance);
    }
}