//Reverse an array
class ArrayPractice4{
	public static void revers(int num[]){
		int first=0;
		int last=num.length-1;
		while(first<last){
			int temp=num[last];
			num[last]=num[first];
			num[first]=temp;
			first++;
			last--;
		}
		System.out.println("The reversed array is:: ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String[] args){
		int arr[]={12,22,1,3,4,7};
		revers(arr);
	}
}