
public class asalsayıyatamamla {
	public int enyakınasal(int sayi)
	{	
		for(;;)
		{
			sayi++;
			int j=0;
				for (int i = 2; i < sayi ; i++)
				{
					if(sayi%i==0)
					{
						j++;
					}
				}
				if(j==0)
					return sayi;
		}
	}
}
