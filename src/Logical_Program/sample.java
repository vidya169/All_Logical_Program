package Logical_Program;

import java.util.HashMap;
import java.util.Set;

public class sample {
	public static void main(String[] args) {
		String org="abcdabcc";
	
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for(int i=0;i<=org.length()-1;i++)
{
	char s1=org.charAt(i);
	if(mp.containsKey(s1))
	{
		mp.put(s1, mp.get(s1)+1);
	}
	else
	{
		mp.put(s1, 1);
	}
}
		Set<Character> keys = mp.keySet();
	}
		
}