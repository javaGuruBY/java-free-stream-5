package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.Stock;

public class App {
    public static void main(String[] args) {
        StockService yandexService = new StockService();
        Stock yandex = new Stock("Amazon", 16);
        String result;
        result = yandexService.printInformation(yandex);
        System.out.println(result);

        yandexService.updatePrice(yandex, 18);
        System.out.println(yandexService.printInformation(yandex));

        yandexService.updatePrice(yandex, 15);
        System.out.println(yandexService.printInformation(yandex));

    }
}
