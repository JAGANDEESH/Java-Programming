import java.util.*;
public class SelectionSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
				
			}
			int t=arr[min];
			arr[min]=arr[i];
			arr[i]=t;
		}
		System.out.println(Arrays.toString(arr));
	}
}