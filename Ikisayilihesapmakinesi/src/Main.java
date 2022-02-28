import java.awt.print.Printable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\tHesap Makinesi");		
		String islemler = "1 . iþlem  ----> Toplama Ýþlemi\n"+
						  "2 . iþlem  ----> Çýkarma Ýþlemi\n"+
						  "3 . iþlem  ----> Çarpma Ýþlemi\n"+
						  "4 . iþlem  ----> Bölme Ýþlemi\n"+
						  "Çýkmak için q'ya basýnýz";
		System.out.println(islemler);
		Scanner scanner = new Scanner (System.in);
		while (true){
		System.out.println("Yapmak istediðiniz iþlemi seçiniz :");
		String secim = scanner.nextLine();
		if(secim.equals("1")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("Ýkinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("Ýþlemin sonucu : " + (sayi1+sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("2")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("Ýkinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("Ýþlemin sonucu : " + (sayi1-sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("3")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("Ýkinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("Ýþlemin sonucu : " + (sayi1*sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("4")) {
			System.out.print("Birinci sayiyi giriniz : ");
			double sayi1 = scanner.nextInt();
			System.out.print("Ýkinci sayiyi giriniz : ");
			double sayi2 = scanner.nextInt();
				if (sayi2 != 0){
			System.out.println("Ýþlemin sonucu : " + (sayi1/sayi2));
			scanner.nextLine();
				}
				else {
			System.out.println("Bir sayi 0 a bölünemez");
		}
		}
		else if(secim.equals("q")) {
			Thread.sleep(1000);
			System.out.println("Çýkýþ yapýlýyor ...");
			break;
		}

				else {
			System.out.println("Geçersiz Ýþlem...");

		}
		}
	}

}

