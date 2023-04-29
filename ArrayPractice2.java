// Largest number in an array
import java.util.*;
class ArrayPractice2{
	public static void show(int num[]){
		int l=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++){
			if(l<num[i]){
				l=num[i];
			}
			//return l;
		}
		//return l;
		System.out.println("The highhest number is:: "+l);
	}
	public static void main(String[] args){
		int num[]={12,2,11,32,4,5,8};
		//System.out.println("The highhest number is:: "+show(num));
		show(num);
	}
}