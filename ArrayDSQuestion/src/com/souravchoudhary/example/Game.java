package com.souravchoudhary.example;


public class Game {
	
	public static int[] removeElement(int[] arr, int index){
		int[] newArray = new int[arr.length - 1];
		int j = 0;
		for(int i = 0 ; i < arr.length ; i ++){
			if(i == index)
				continue;
			newArray[j++] = arr[i];
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {13,5,2,4,3,7,10,12};
		int[] myArr = arr;
		int resultAmt1 = 0 ,resultAmt2  = 0;
		
		for(int i = 0 ; i < arr.length ; i ++){
			if(i % 2 == 0){
				if(myArr[0] > myArr[myArr.length-1]){
					//add result amount for first player
					resultAmt1 += myArr[0];
					
					//remove the element from the array
					myArr = removeElement(myArr,0);

					
				}
				else{
					//add result amount for first player
					resultAmt1 += myArr[myArr.length-1];
					
					//remove the element from the array
					myArr = removeElement(myArr,myArr.length-1);
					
				}
				
				
			}
			else{
								
				if(myArr[0] > myArr[myArr.length-1]){
					//add result amount for second player
					resultAmt2 += myArr[0];
					
					//remove the element from the array
					myArr = removeElement(myArr,0);

					
				}
				else{
					//add result amount for second player
					resultAmt2 += myArr[myArr.length-1];
					
					//remove the element from the array
					myArr = removeElement(myArr,myArr.length-1);
 
				}
			}
			
			
		}

		System.out.println(resultAmt1);
	}

}
