package com.diazcode;

public class SomeLogicBusiness {

	int sum(int a, int b){
		return a + b;
	}
	
	int sums(int a[]){
		int rs = 0;
		for (int i : a) {
			rs+=i;
		}
		return rs;
	}
	
}
