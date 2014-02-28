import java.util.Scanner;


public class labprojeleri2 {
	public static void main(String[] args) {
	kacfarklırakam kacrakam=new kacfarklırakam();
	asalsayıyatamamla tamamla=new asalsayıyatamamla();
	enbuyuksayi en=new enbuyuksayi();
	buyukrakamnerde buyuk=new buyukrakamnerde();
	Scanner scan=new Scanner (System.in);
	Scanner scan1=new Scanner (System.in);
	Scanner scan2=new Scanner (System.in);
	System.out.print("4 basamaklı sayı giriniz => ");
	int sayi=scan.nextInt();
	System.out.println(sayi +" => "+kacrakam.kacfarklırakamvar(sayi)+" farklı rakamdan olusmustur");
	System.out.print("sayı giriniz => ");
	int sayi2=scan1.nextInt();
	System.out.println("girilen sayi => "+sayi2);
	System.out.println("en yakın asal sayi => "+ tamamla.enyakınasal(sayi2));
	System.out.print("3 basamaklı sayı giriniz => ");
	int sayi3=scan2.nextInt();
	System.out.println(sayi3+" rakamlarından olusmus en buyuk sayi => "+en.enbuyuk(sayi3));
	buyuk.buyukrakam(sayi3);
	}

}
