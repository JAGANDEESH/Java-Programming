import java.util.*;
public class QuickSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Before Swapping : ");
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,n-1);
		System.out.print("After Swapping : ");
		System.out.println(Arrays.toString(arr));
	}
	public static int partition(int arr[],int low,int high){
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void quickSort(int arr[],int i,int j){
		if(i<j){
			int pi=partition(arr,i,j);
			quickSort(arr,i,pi-1);
			quickSort(arr,pi+1,j);
		}
	}
}