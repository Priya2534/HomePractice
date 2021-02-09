package com.practice;

public class ArraySorter {

	public static void main(String[] args) {
		int[] array = {0,1,1,0,1,0,1,0,1};
		
		int j=0,count1 = 0;
		for(int i=0;i<array.length;i++)
		{

			if(array[i]==0) {
				array[j]=0;
				System.out.println("printing 0");
				j++;
				
			}else {
				array[array.length-count1-1]=1;
				count1++;
				System.out.println("printing 1");
			}
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}

	}

}
