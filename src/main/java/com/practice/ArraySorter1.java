package com.practice;

public class ArraySorter1 {

	public static void main(String[] args) {
		int[] array = {0,1,1,0,1,0,1,0,1};
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				count++;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<count-1;j++) {
				array[i]=0;
			}
			for(int j=count;j<array.length;j++) {
				array[j]=1;
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		}

	}


