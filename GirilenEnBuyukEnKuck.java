package Giris;
import java.util.Scanner;
public class GirilenEnBuyukEnKuck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,n1,sifirustu=0,sifiralti=0;

        System.out.print("Kac Tane Sayi Gireceksiniz : ");
        n = input.nextInt();

        for (int i=1; i<=n; i++){

            System.out.println(i + " Sayiyi Giriniz : ");
            n1 = input.nextInt();

            if(n1>sifirustu) {
               sifirustu=n1;
            }
            if(n1<sifiralti){
                sifiralti=n1;
            }

        }

        System.out.println("En büyük sayı : "+sifirustu);
        System.out.println("En küçük sayı : "+sifiralti);



    }
}
