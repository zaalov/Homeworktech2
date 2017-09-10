import java.util.Scanner;

public class Homeworktech2 {
    public static void main (String[] agrs){
        Scanner in = new Scanner( System.in );
        System.out.println(" Давайте знакомиться\n Напишите нам Ваше имя:");
        String line = in.nextLine() ;
        System.out.println(("Спасибо " + line)  +";) Укажите город проживания?" );
        String line1 = in.nextLine();
        System.out.println(("Спасибо " + line)  +";) Укажите пожалуйста Ваш возраст?");
        String adress = in.nextLine();
        System.out.println(("Спасибо " + line)  +";) Укажите пожалуйста Ваш адрес?");
        String line2 = in.nextLine();
        System.out.println(("Отлично " + line)  +";) давайте проверим информацию:\n"  );
        System.out.printf(" Имя:     %s \n Город:   %s \n Возраст: %s лет \n Адрес:   %s \n ", line , line1 , adress , line2 );
        System.out.println("-------------------------------------------------");

    }
}