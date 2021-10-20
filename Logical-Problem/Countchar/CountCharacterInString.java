package Countchar;

	import java.util.LinkedHashMap;
	import java.util.Map;

	public class CountCharacterInString 
	{
		public static void main(String[] args)
		{
			String str="INFOSYS";
			Map <Character, String> map=new LinkedHashMap<Character, String>();
			
			for(int i=0;i<str.length();i++)
			{
			String temp=map.get(str.charAt(i));
				if(temp==null)
				{
					map.put(str.charAt(i), "1");
				}
				else
				{
					map.put(str.charAt(i), (Integer.parseInt(""+map.get(str.charAt(i)))+1)+"");
				}
			}
			System.err.println(map);
		}

	}
