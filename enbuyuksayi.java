
public class enbuyuksayi {
	public int enbuyuk(int sayi) {
		int [] dizi=new int[3];
		int yedek1,yedek2;
		dizi[0]=sayi/100;
		yedek1=sayi%100;
		dizi[1]=yedek1/10;
		dizi[2]=yedek1%10;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 3; j++) {
				if(dizi[i]<dizi[j])
				{
					yedek2=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=yedek2;
				}	
			}
		}
		return dizi[0]*100+dizi[1]*10+dizi[2];
	}
}
