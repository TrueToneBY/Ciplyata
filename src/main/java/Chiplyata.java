import java.util.Scanner;
//
//20.04.2020
//
import static java.lang.System.*;

public class Chiplyata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введите количество дней например : 10");
        int dni = sc.nextInt();
        int res;
        if (dni<=6){
            res = dni * 2;
        }else{
            res = 12;
            System.out.println("Жизнь против смерти ))");
        }
        System.out.println("Получим цеплят = " + res);
    }
}
