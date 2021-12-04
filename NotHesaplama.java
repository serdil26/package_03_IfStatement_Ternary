package package_03_IfStatement_Ternary;

import java.util.Scanner;

public class NotHesaplama {

	public static void main(String[] args) {
		/*
 1.Kullan�c�ya    "Vize s�nav sonucunuzu giriniz :"
 2.vize notu double de�erinde girilecek.
 3. Kullan�c�ya  "Vize s�nav� y�zdesini giriniz". ->> double olmal� ->> 0,40 etkiliyor   !!Y�zde ka� etkiledi�ini Sisteme siz giriyorsunuz.!!
 4.Kullan�c�ya    "Final s�nav sonucunuzu giriniz.
 5. final notu double de�erinde olmal�. (�rn: 65,5)
 6.Kullan�c�ya    "Final s�nav� y�zdesini giriniz"-->> double olmal� ->> 0,60 etkiliyor.
 7. Vize final ortalamas�n� bulmak i�in, vize nin y�zde40 �, finalin y�zde60 � al�nmal� ve ��kan sonu�lar toplanmal�d�r.
 8. ��kan sonucu (dersin not ortalamas�n�)   double toplam  ' a e�itleyebilirsiniz.
          todo    Ko�ul k�sm� e�er ortalamas�          90(90 dahil) 'dan b�y�k ise, harf notu olarak AA,
                                                       80(80dahil)   ile 90 aras�nda ise  BA,
                                                       70(70 dahil)   ile 80 aras�nda ise BB,
                                                       60(60dahil) ile 70 aras�nda ise CB,
                                                       50(50 dahil) ile 60 aras�nda ise CC,
                                                       40(40 dahil) ile 50 aras�nda ise DC,
                                                       30(30 dahil) ile 40 aras�nda ise DD,
                                                       30 'dan d���k ise FF            gelmeli.
         */
		 Scanner sc = new Scanner(System.in);

	        System.out.println("********NOT HESAPLAMA S�STEM�********\n");

	        System.out.print("Vize s�nav sonucunuzu giriniz : ");
	        double vize = sc.nextDouble();

	        System.out.print("Vize s�nav� y�zdesini giriniz: ");
	        double vize_yuzde = sc.nextDouble();

	        System.out.print("Final s�nav sonucunuzu giriniz : ");
	        double fin = sc.nextDouble();

	        System.out.print("Final s�nav� y�zdesini giriniz: ");
	        double fin_yuzde = sc.nextDouble();

	        System.out.println("*************************************");

	        double ort = vize * (vize_yuzde / 100) + fin * (fin_yuzde / 100);

	        System.out.println("Ortalaman�z Say� ile : " + ort);
	        System.out.print("Ortalaman�z Harf ile : ");

	        if (ort >= 90) {
	            System.out.println("AA ald�n�z...");
	        } else if (ort >= 80) {
	            System.out.println("BA ald�n�z...");
	        } else if (ort >= 70) {
	            System.out.println("BB ald�n�z...");
	        } else if (ort >= 60) {
	            System.out.println("CB ald�n�z...");
	        } else if (ort >= 50) {
	            System.out.println("CC ald�n�z...");

	        } else if (ort >= 40) {
	            System.out.println("DC ald�n�z...");
	        } else if (ort >= 30) {
	            System.out.println("DD ald�n�z...");

	        } else {
	            System.out.println("FD ald�n�z ve Kald�n�z...");
	        }
		
	}

}
