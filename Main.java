package net.ukr.geka3;

import java.util.ArrayDeque;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayDeque <Object> array = new ArrayDeque<>();
		
		for(int i = 1; i <=10 ; i++){
			array.push(new Integer(i));
		}
		System.out.println(Arrays.toString(array.toArray()));
		
		
		array.pollFirst();
		array.pollFirst();
		array.pollLast();
		
		System.out.println(array);
		
		
		
		
		
		
	}
	
	

}
