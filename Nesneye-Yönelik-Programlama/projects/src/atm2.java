import java.util.Scanner;
public class abc {
	public static void main(String[] args) {

		Scanner hsn= new Scanner(System.in);

		int bakiye, islemler, cmiktar,ymiktar,isim,sifre,ysifre,islemler2,a,b,c,d;
		System.out.println("G�venilir Bankac�l�k HasanBANK'A Ho�geldiniz..");
		System.out.println("L�tfen kart �ifrenizi giriniz.");
		sifre =hsn.nextInt();
		
		
		if (sifre==sifre){
			System.out.println("Giri� ba�ar�l�, i�lem ekran�na y�nlendiriliyorsunuz.."); 
		}
		else { 
			System.out.println("Hatal� tu�lama yapt�n�z.L�tfen tekrar deneyiniz..");
		System.exit(0);
		}
		System.out.println("L�tfen i�lem yapmak istedi�iniz t�r� se�er misiniz ?");
		bakiye=100;
		System.out.println("-Bakiye Sorgulamak ��in 1'e Bas�n");
		System.out.println("-Hesaptan Para �ekmek ��in 2'ye Bas�n.");
		System.out.println("-Hesaba Para Yat�rmak ��in 3'e Bas�n.");
		System.out.println("-Sitemden G�venli ��k��  ��in 4'e Bas�n.");
		islemler=hsn.nextInt();
		switch(islemler)
		{

		case 1:
			System.out.println("G�ncel Bakiyeniz:"+bakiye+"TL'dir.");

		break;
		
		case 2:
			System.out.println("�ekmek istedi�iniz Tutar� Giriniz:");
		cmiktar=hsn.nextInt();
		

		
		System.out.println("��leminiz tamamlanm��t�r.��lem sonras� bakiyeniz:"+(bakiye-cmiktar)+"TL'dir");  
		 
	
		break;
	     case 3: 
		System.out.println("Yatirmak istedi�iniz tutar� giriniz");
	ymiktar=hsn.nextInt();
	System.out.println("��leminiz tamamlanm��t�r.��lem sonras� bakiyeniz:"+(bakiye+ymiktar+"TL'dir"));
	 break; 
	     case 4: 
	    	 System.out.println("Sistemden ��k�l�yor.. HASAN BANK �Y� G�NLER D�LER..");
	    	 break; 
	    	 
}
		return;
	
}
}
