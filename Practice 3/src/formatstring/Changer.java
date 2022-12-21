package formatstring;

import java.util.Objects;
import java.util.Scanner;

public class Changer {

    private static double yaun = 8.55;
    private static double dollar = 61.20;
    private static double euro = 60.68;
    private static double belrub = 24.24;

    public static double convert(double r, String v){
        if(Objects.equals(v, "1")){
            return r/yaun;
        }
        if(Objects.equals(v, "2")){
            return r/belrub;
        }
        if(Objects.equals(v, "3")){
            return r/euro;
        }
        if(Objects.equals(v, "4")){
            return r/dollar;
        }
        else{
            System.out.println("error");
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Введите сумму в рублях, которую хотите перевести: ");

        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();

        System.out.println("Выберите валюту в которую хотите перевести: \n1 - Юань \n2 - Белорусские рубли \n3 - Евро  \n4 - Доллар");
        String val = scan.next();

        System.out.println(Changer.convert(sum, val));
    }
}
