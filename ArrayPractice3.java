//Binary scarch
import java.util.Arrays;
class ArrayPractice3{
	public static int show(int num[],int key){
		Arrays.sort(num);
		System.out.println("Sorted array is:: ");
		for (int i=0;i<num.length;i++) {
            System.out.println(num[i] + " ");
        }
		int start=0;
		int end=num.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(num[mid]==key)
				return mid+1;
			if(num[mid]<key)
				start=mid+1;
			else
				end=mid-1;
				
		}
		return -1;
	}
	public static void main(String[] args){
		int num[]={12,2,21,1,3,44,11};
		int key=12;
		int res=show(num,key);
		if(res==-1)
			System.out.println("The key is not found.");
		else
			System.out.println("The key is found at "+res);
	}
}