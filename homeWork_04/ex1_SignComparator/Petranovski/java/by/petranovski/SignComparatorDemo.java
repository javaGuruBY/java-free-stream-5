package by.petranovski;

import by.petranovski.service.SignComparatorService;

public class SignComparatorDemo {
    public static void main(String[] args) {
        SignComparatorService signComparatorService = new SignComparatorService();
        System.out.println(signComparatorService.compare(5));
        System.out.println(signComparatorService.compare(-10));
        System.out.println(signComparatorService.compare(0));
    }
}
