package com.exemple.HW1_Task2;

public class Algoritms {
    public static void main(String[] args) {
        wakeUp();
        turnOnTheKettle();
        warmFood();
        takeAShower();
        getDressed();
        getToWork();
        haveLunch();
        getHome();
        turnOnTheTv();
        takeAWalk();
    }
    public static void wakeUp() {
        System.out.println("1. Проснуться:\n" +
                "-открыть глаза\n" +
                "-подумать о хорошем\n" +
                "-накидать план на день\n" +
                "-встать с кровати");
    }
    public static void turnOnTheKettle() {
        System.out.println("2. Включить чайник:\n" +
                "-зайти на кухню\n" +
                "-налить в чайник воду\n" +
                "-установить на плиту\n" +
                "-включить газ");
    }
    public static void warmFood() {
        System.out.println("3. Подогреть еду:\n" +
                "-открыть холодильник\n" +
                "-взять кантейнер с едой\n" +
                "-закрыть холодильник\n" +
                "-поставить в микроволновку и вкл. ее");
    }
    public static void takeAShower() {
        System.out.println("4. Принять душ:\n" +
                "-зайти в ванную\n" +
                "-включить кран\n" +
                "-намылиться\n" +
                "-смыть с себя и вытереть тело полотенцем");
    }
    public static void getDressed() {
        System.out.println("5. Одеться:\n" +
                "-взять носки и одеть\n" +
                "-взять джинсы и одеть\n" +
                "-взять футболку и одеть\n" +
                "-взять кроссовки и одеть");
    }
    public static void getToWork() {
        System.out.println("6. Добраться до работы:\n" +
                "-выйти из квартиры\n" +
                "-выйти из подьезда\n" +
                "-завезти машину\n" +
                "-доехать до работы");
    }
    public static void haveLunch() {
        System.out.println("7. Пообедать:\n" +
                "-заехать домой\n" +
                "-зайти в квартиру\n" +
                "-открыть холодильник и взять контейнер с едой\n" +
                "-разогреть");
    }
    public static void getHome() {
        System.out.println("8. Добраться домой:\n" +
                "-закончить рабочий день\n" +
                "-закрыть станцию\n" +
                "-завезти машину\n" +
                "-доехать домой");
    }
    public static void turnOnTheTv() {
        System.out.println("9. Включить телевизор:\n" +
                "-зайти в гостинную\n" +
                "-сесть на диван\n" +
                "-взять пульт\n" +
                "-вкл. нужный канал");
    }
    public static void takeAWalk() {
        System.out.println("10. Прогуляться:\n" +
                "-выйти из квартиры\n" +
                "-выйти из подьезда\n" +
                "-наметить маршрут\n" +
                "-пройтись, подышать свежим водухом");
    }
}
