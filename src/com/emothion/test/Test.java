package com.emothion.test;

public class Test {

	//METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int canArrangeWords(String arr[])
	{
		int flag = -1;
		for(int i = 0; i<(arr.length-1); i++) {
			String arr1 = arr[i].substring(arr[i].length()-1,arr[i].length());
			String arr2 = arr[i+1].substring(0,1);
			
			if(arr1.equals(arr2)) {
				flag = 1;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		int flag = Test.canArrangeWords(new String[]{"abc","cde","efg","klm"});
		System.out.println(flag);
	}
}
