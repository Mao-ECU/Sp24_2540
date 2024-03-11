package compression;
import java.util.ArrayList;

public class VB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encoding(500);
	}
	
	public static void encoding(int gap)
	{
		ArrayList<Byte> vbcodes = new ArrayList<Byte>();
		
		int num = 0;
		while(gap > 0)
		{
			//take 7 bits out
			byte aByte = (byte)(gap % 128);
			gap /= 128;
			
			if(num == 0) //last byte
			{
				aByte = (byte)(aByte | 128);
			}
			num++;
			vbcodes.add(aByte);
		}
		
		for(int i = vbcodes.size() - 1; i >= 0; i--)
		{
			System.out.print(vbcodes.get(i) + " ");
		}
		
		decoding(vbcodes);
	}
	
	public static void decoding(ArrayList<Byte> a)
	{
		int gap = 0;
		for(int i = a.size() - 1; i >= 0; i--)
		{
			byte aByte = a.get(i);
			if(aByte < 0)
			{
				aByte = (byte)(aByte & 127);
			}
			gap = gap * 128 + aByte;
		}
		System.out.println("Decoding, " + gap);
	}

}
