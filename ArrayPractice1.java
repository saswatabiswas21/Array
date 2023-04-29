//Linner Scarch
class ArrayPractice1{
	public static int scarch(int num[],int key){
		for(int i=0;i<num.length;i++){
			if(num[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args){
		int num[]={12,2,21,1,3,44,11};
		int key=1;
		int res=scarch(num,key);
		if(res==-1)
			System.out.print("The key is not found.");
		else
			System.out.print("The key is found at "+(res+1));
	}
}