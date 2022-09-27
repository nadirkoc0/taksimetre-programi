import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //acilis ucreti 10 tl olacak sekilde yapildi
        //degiskenleri tanimladik
        double km, odenecek_tutar=10.0,km_basi=2.20;
        Scanner inp = new Scanner(System.in);
        //kullanicidan veriyi istedik
        System.out.print("Lutfen kac KM gittiginizi yaziniz: ");
        km = inp.nextDouble();

        odenecek_tutar+=km_basi*km;
        odenecek_tutar=(odenecek_tutar < 20) ? 20 : odenecek_tutar;
        System.out.println("Toplam odeyeceginiz tutar: "+new DecimalFormat("##.##").format(odenecek_tutar) +" TL");



    }
}

