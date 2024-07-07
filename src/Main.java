import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double mesafeUcreti = 10;
            double toplamFiyat = mesafe * mesafeUcreti;

            // Yaşa göre indirim hesaplama
            if (yas < 12) {
                toplamFiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9;
            } else if (yas > 65) {
                toplamFiyat *= 0.7;
            }

            // Yolculuk tipine göre indirim hesaplama
            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8;
                toplamFiyat *= 2; // Gidiş dönüş olduğu için toplam fiyat ikiye katlanır
            }

            System.out.println("Toplam bilet fiyatı: " + toplamFiyat + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        scanner.close();
    }
}
