package package_03_IfStatement_Ternary;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen boyunuzu cm olarak giriniz:");
		double boy=scan.nextDouble();
		
		Scanner scan1 =new Scanner(System.in);
		System.out.println("lutfen kilonuzu 'kg' olarak giriniz:");
		double kilo=scan1.nextDouble();
		
		double BMI= kilo / (boy/100 * boy/100);
		
		if (BMI <=20) {
			System.out.println("vucut kitle endeksiniz: "+BMI+" "+ "oldukca zayifsiniz");
			
		} else if (BMI>20 && 25<BMI) {
			System.out.println("vucut kitle endeksiniz: "+BMI+" " +"normal sinirlardasiniz");
		}else if (BMI>25 && 30<BMI) {
			System.out.println("vucut kitle endeksiniz: "+BMI+" " +"birazcik sismansiniz");
		}else if (BMI>30) {
			System.out.println("vucut kitle endeksiniz: "+BMI+" " +"obez grubundasiniz");
		} 
		scan.close();
		scan1.close();
	}

}
