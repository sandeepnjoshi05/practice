package practice;

import java.util.HashMap;

public class VouwelPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ur name is a sandeep joshi";
		vouwelCount(str);

	}
	
	public static void vouwelCount(String str) {
		
		String vouwels = "aeiouAEIOU";
		HashMap<Character, Integer> vouwelMap = new HashMap<>();
		for(char ch : str.toCharArray() ) {
			if(vouwels.indexOf(ch)!=-1) {
				vouwelMap.put(ch, vouwelMap.getOrDefault(ch, 0)+1);
			}
		}
		System.out.println("occurence of vouwel");
		for(char ch : vouwelMap.keySet()) {
			System.out.println(ch +"->" + vouwelMap.get(ch));
		}
	}

}
