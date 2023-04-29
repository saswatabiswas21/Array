//Sub array sum
import java.util.*;
class ArrayPractice7{
	public static void show(int arr[]){
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				for(int k=i;k<=j;k++){
					currsum=currsum+arr[k];
					if(currsum>maxsum){
						maxsum=currsum;
					}
					System.out.print(arr[k]+" "+currsum);
				}
				currsum=0;
				System.out.println();
			}
			currsum=0;
			System.out.println();
		}
		System.out.println("The highest sum is:: "+maxsum);
	}
	public static void main(String[] args){
		int num[]={2,4,6,8,10};
		show(num);
	}
}