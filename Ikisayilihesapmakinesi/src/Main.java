import java.awt.print.Printable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\tHesap Makinesi");		
		String islemler = "1 . i�lem  ----> Toplama ��lemi\n"+
						  "2 . i�lem  ----> ��karma ��lemi\n"+
						  "3 . i�lem  ----> �arpma ��lemi\n"+
						  "4 . i�lem  ----> B�lme ��lemi\n"+
						  "��kmak i�in q'ya bas�n�z";
		System.out.println(islemler);
		Scanner scanner = new Scanner (System.in);
		while (true){
		System.out.println("Yapmak istedi�iniz i�lemi se�iniz :");
		String secim = scanner.nextLine();
		if(secim.equals("1")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("�kinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("��lemin sonucu : " + (sayi1+sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("2")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("�kinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("��lemin sonucu : " + (sayi1-sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("3")) {
			System.out.print("Birinci sayiyi giriniz : ");
			int sayi1 = scanner.nextInt();
			System.out.print("�kinci sayiyi giriniz : ");
			int sayi2 = scanner.nextInt();
			System.out.println("��lemin sonucu : " + (sayi1*sayi2));
			scanner.nextLine();
		}
		else if(secim.equals("4")) {
			System.out.print("Birinci sayiyi giriniz : ");
			double sayi1 = scanner.nextInt();
			System.out.print("�kinci sayiyi giriniz : ");
			double sayi2 = scanner.nextInt();
				if (sayi2 != 0){
			System.out.println("��lemin sonucu : " + (sayi1/sayi2));
			scanner.nextLine();
				}
				else {
			System.out.println("Bir sayi 0 a b�l�nemez");
		}
		}
		else if(secim.equals("q")) {
			Thread.sleep(1000);
			System.out.println("��k�� yap�l�yor ...");
			break;
		}

				else {
			System.out.println("Ge�ersiz ��lem...");

		}
		}
	}

}

