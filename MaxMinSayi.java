package java101;
import java.util.Scanner;

public class MaxMinSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = inp.nextInt();

        if(n<=0){
            System.out.println("Geçerli bir sayı girilmedi.");
            return;
        }

        System.out.print( "1. sayıyı giriniz.");
        int sayi = inp.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;


        for(int i=2 ; i<=n ; i++){
            System.out.print( i +". sayıyı giriniz.");
            int giris = inp.nextInt();

            if (giris > enBuyuk) {
                enBuyuk = giris;
            }

            if (giris < enKucuk) {
                enKucuk = giris;
            }
        }
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
