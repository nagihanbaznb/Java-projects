import java.util.Scanner;
public class abc {
	public static void main(String[] args) {

		Scanner hsn= new Scanner(System.in);

		int bakiye, islemler, cmiktar,ymiktar,isim,sifre,ysifre,islemler2,a,b,c,d;
		System.out.println("Güvenilir Bankacýlýk HasanBANK'A Hoþgeldiniz..");
		System.out.println("Lütfen kart þifrenizi giriniz.");
		sifre =hsn.nextInt();
		
		
		if (sifre==sifre){
			System.out.println("Giriþ baþarýlý, iþlem ekranýna yönlendiriliyorsunuz.."); 
		}
		else { 
			System.out.println("Hatalý tuþlama yaptýnýz.Lütfen tekrar deneyiniz..");
		System.exit(0);
		}
		System.out.println("Lütfen iþlem yapmak istediðiniz türü seçer misiniz ?");
		bakiye=100;
		System.out.println("-Bakiye Sorgulamak Ýçin 1'e Basýn");
		System.out.println("-Hesaptan Para Çekmek Ýçin 2'ye Basýn.");
		System.out.println("-Hesaba Para Yatýrmak Ýçin 3'e Basýn.");
		System.out.println("-Sitemden Güvenli Çýkýþ  Ýçin 4'e Basýn.");
		islemler=hsn.nextInt();
		switch(islemler)
		{

		case 1:
			System.out.println("Güncel Bakiyeniz:"+bakiye+"TL'dir.");

		break;
		
		case 2:
			System.out.println("Çekmek istediðiniz Tutarý Giriniz:");
		cmiktar=hsn.nextInt();
		

		
		System.out.println("Ýþleminiz tamamlanmýþtýr.Ýþlem sonrasý bakiyeniz:"+(bakiye-cmiktar)+"TL'dir");  
		 
	
		break;
	     case 3: 
		System.out.println("Yatirmak istediðiniz tutarý giriniz");
	ymiktar=hsn.nextInt();
	System.out.println("Ýþleminiz tamamlanmýþtýr.Ýþlem sonrasý bakiyeniz:"+(bakiye+ymiktar+"TL'dir"));
	 break; 
	     case 4: 
	    	 System.out.println("Sistemden Çýkýlýyor.. HASAN BANK ÝYÝ GÜNLER DÝLER..");
	    	 break; 
	    	 
}
		return;
	
}
}
