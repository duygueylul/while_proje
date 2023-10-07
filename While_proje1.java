package Temel_Kavramlar;



import java.util.Scanner;
public class While_proje1 {
//While döngüsü ile klavyeden girilen sayıdan 0’a kadar olan sayıların toplamını hesaplayan program.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int toplam =0, i=0;
		    System.out.println("Sayı Giriniz: ");
		    int n = scan.nextInt();
		        
		    while(n>=i) {
		       toplam +=i;
		       i++;//
		        }
		       System.out.println("Sayıların Toplamı = " + toplam);


	}

}
