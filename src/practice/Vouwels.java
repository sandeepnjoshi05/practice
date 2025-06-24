package practice;

import java.util.HashMap;

public class Vouwels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "kaise permente";
		vouwelsCount(str);

	}
	
	public static void vouwelsCount(String str) {
		
		String vouwel = "aeiouAEIOU";
		//iterating through each character in string
		HashMap<Character, Integer> vouwelsMap = new HashMap<>();
		for(char ch : str.toCharArray()) {
			
			if(vouwel.indexOf(ch)!=-1){
				vouwelsMap.put(ch, vouwelsMap.getOrDefault(ch,0)+1);
			}
			
		}
		//print vowels
		System.out.println("occurence of ");
		for(char ch : vouwelsMap.keySet())
			System.out.println(ch+"->" +vouwelsMap.get(ch));
	}

}
