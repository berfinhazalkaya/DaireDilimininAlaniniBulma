import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz
        int r;
        double pi = 3.14, a, alan;

        //Kullanıcıdan değerleri alıyoruz

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yarıçapı giriniz : ");
        r = input.nextInt();

        System.out.print("Lütfen merkez açısının ölçüsünü giriniz : ");
        a = input.nextDouble();

        // Daire diliminin alanını hesaplıyoruz
        alan =  (pi * (r*r) * a) / 360;

        System.out.print("Daire Diliminin Alanı : " + alan);

    }
}
