
public class kacfarklırakam {

	public int kacfarklırakamvar(int sayi)
	{
		int [] dizi=new int[4];
		int yedek1,yedek2; 
		dizi[0]=sayi/1000;
		yedek1=sayi%1000;
		dizi[1]=yedek1/100;
		yedek2=yedek1%100;
		dizi[2]=yedek2/10;
		dizi[3]=yedek2%10;
		if (dizi[0]==dizi[1] && dizi[1]==dizi[2] && dizi[2]==dizi[3] )
			return 1;
		else if (dizi[0]!=dizi[1] && dizi[1]!=dizi[2] && dizi[2]!=dizi[3] && dizi[0]!=dizi[2] && dizi[0]!=dizi[3] && dizi[1]!=dizi[3])
			return 4;
		else if ((dizi[0]==dizi[1] && dizi[2]==dizi[3]) || (dizi[0]==dizi[3] && dizi[1]==dizi[2]) || (dizi[0]==dizi[2] && dizi[1]==dizi[3]))
			return 2;
		else 
			return 3;
		
		
	}
}
