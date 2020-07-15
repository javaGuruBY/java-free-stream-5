package src.main.java.by.jrr.kuprelyow;

public class algorithm {
    algorithm(){
        Book();
        Dran();
        Shower();
        Bike();
        Breath();
    }

    public void Book(){
        System.out.println("Познавание нового");
        System.out.println("1)Берёшь книгу>");
        System.out.println("2)Читаешь");
        System.out.println("3)Вдумываешься");
        System.out.println("4)Понимаешь прочитанное");
        System.out.println("4.1)При не выполнение пункта 4,вернись в пункт2");
    }
    public void Dran(){
        System.out.println("Приготовление драников");
        System.out.println("1)Смешиваешь ингридиенты");
        System.out.println("2)Жаришь");
        System.out.println("3)Ешь");
    }
    public void Bike(){
        System.out.println("Поездка на велосипеде");
        System.out.println("1)Берёшь велосипед");
        System.out.println("2)Проверяешь спущены ли колёса");
        System.out.println("2.1)При спуске колёс,накачать");
        System.out.println("3)Ехать");
    }
    public void Shower(){
        System.out.println("Принятие душа");
        System.out.println("1)Раздеваешься");
        System.out.println("2)Заходишь в душ");
        System.out.println("3)Намокаешь");
        System.out.println("4)Мылишься");
        System.out.println("5)Смываешь");
    }
    public void Breath (){
        System.out.println("Как дышать");
        System.out.println("1)Присто берёшь");
        System.out.println("2)И дышишь");
        System.out.println("Пункт 1 и 2 повторяющиеся");
        System.out.println("Поздравляю вы восхитительны");
    }
}
