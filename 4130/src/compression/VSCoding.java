package compression;

import java.util.ArrayList;

public class VSCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> postingList = new ArrayList<Integer>();
		postingList.add(100);
		postingList.add(130);
		postingList.add(145);
		postingList.add(340);*/
		Encoding(500);
		

	}
	
	public static void Encoding(int a)
	{
		int num = 0;
		ArrayList<Byte> vbcodes = new ArrayList<Byte>();
		while(a > 0)
		{
			
			byte aByte = (byte)(a % 128);
			if(num == 0)
			{
				aByte = (byte)(aByte | (byte)128);
			}
			num++;
			vbcodes.add(aByte);
			a /= 128;
		}
		
		for(int i = vbcodes.size() - 1; i >= 0; i--)
		{
			System.out.print(vbcodes.get(i) + " ");
		}
		Decoding(vbcodes);
	}
	
	public static void Decoding(ArrayList<Byte> a)
	{
		int value  = 0;
		for(int i = a.size()-1; i >= 0; i--)
		{
			byte single = a.get(i);
			System.out.println("Dec " + single);
			if((int)single >= 0)
			{
				value = value * 128 + (int)single;
			}
			else
			{
				single = (byte)(single & (byte)127);
				value = value * 128 + (int)single;
			}
		}
		System.out.println("Decoding " + value);
	}

}
