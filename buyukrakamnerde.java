
public class buyukrakamnerde {
	public void buyukrakam(int sayi) {
		int [] dizi=new int[3];
		int [] dizi2=new int[3];
		int yedek1,yedek2;
		dizi[0]=sayi/100;
		yedek1=sayi%100;
		dizi[1]=yedek1/10;
		dizi[2]=yedek1%10;
		for (int i = 0; i < 3; i++) {
			dizi2[i]=dizi[i];
		}
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
		for (int j =2; j >=0; j--) {
			if(dizi[0]==dizi2[j])
			{
				System.out.println(sayi+" rakamlarından en buyugu sagdan "+(3-j)+".dir");
			}
		}
	}
}
