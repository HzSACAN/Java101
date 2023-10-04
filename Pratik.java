package Giris;
import java.util.Scanner;
public class Pratik {
    public static void main(String[] args) {
        double fiyat, kdv_orani, kdv_tutari, kdvli_fiyat;

        Scanner input= new Scanner(System.in);
        System.out.println("KDV'li fiyatını ve KDV tutarını öğrenmek istediğiniz fiyatı giriniz: ");
        System.out.println("Girilen tutar 1000 TL'den küçük ise KDV oranı %18 1000 TL'den büyük ise KDV oranı %8 dir");
        fiyat= input.nextDouble();
        if (fiyat<1000) {
            kdv_orani =0.18;
            kdv_tutari = (fiyat* kdv_orani);
            kdvli_fiyat = (fiyat + kdv_tutari);
            System.out.println("KDV'siz fiyat" + fiyat);
            System.out.println("KDV'li fiyatı:" + kdvli_fiyat);
            System.out.println("KDV tutarı:" + kdv_tutari);
        }
        else if (fiyat>100){
            kdv_orani =0.08;
            kdv_tutari = (fiyat* kdv_orani);
            kdvli_fiyat = (fiyat + kdv_tutari);
            System.out.println("KDV'siz fiyat" + fiyat);
            System.out.println("KDV'li fiyatı:" + kdvli_fiyat);
            System.out.println("KDV tutarı:" + kdv_tutari);

        }

    }
}
