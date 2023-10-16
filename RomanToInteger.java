import java.util.HashMap;
import java.util.Scanner;
   public class RomanToInteger{
        public static void main(String[]args)
	   {
			HashMap<Character,Integer>romanMap=new HashMap<>();
			romanMap.put('I',1);
			romanMap.put('V',5);
			romanMap.put('X',10);
			romanMap.put('L',50);
			romanMap.put('C',100);
			romanMap.put('D',500);
            romanMap.put('M',1000);
			Scanner scanner=new Scanner(System.in);
			System.out.print("Enter a RomanNumeral:");
			String romanNumeral=scanner.nextLine().toUpperCase();
			int intValue=0;
			int prevValue=0;
			for (int i=romanNumeral.length()-1;i>=0;i--)
			{
				int curValue=romanMap.get(romanNumeral.charAt(i));
				if(curValue<prevValue){
					intValue-=curValue;
				}
				else{
					intValue+=curValue;
				}
				prevValue=curValue;
			}
		System.out.println("Integer value:"+intValue);
	   }

   }
