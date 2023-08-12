//reverse a string
public class Main{
	public static void main(String[] args){
		String s = "konala";
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i)+" ");
		}
	}
}

//array
public class Hello{
	public static void main(String[] args){
		int arr[] = {1, 2, 3};
		int arr1[] = {2, 3, 4};
		int arr2[] = new int[2];
		int k = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i] == arr1[j]){
					arr2[k] = arr[i];
					k++;
				}
			}
		}
		for(int s : arr2){
			System.out.print(s+" ");
		}
	}
}
