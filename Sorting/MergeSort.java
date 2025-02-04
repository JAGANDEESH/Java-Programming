import java.util.*;
public class MergeSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,n-1);
		System.out.print("After Sorting : ");
		System.out.println(Arrays.toString(arr));
		
	}
	public static void merge(int arr[],int beg,int mid,int end){
		int n1=mid-beg+1;
		int n2=-mid+end;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++){
			left[i]=arr[beg+i];
		}
		for(int j=0;j<n2;j++){
			right[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=beg;
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				arr[k]=left[i++];
			}
			else{
				arr[k]=right[j++];
			}
			k++;
		}
		while(i<n1){
			arr[k++]=left[i++];
		}
		while(j<n2){
			arr[k++]=right[j++];
		}
	}
	public static void mergeSort(int arr[],int beg,int end){
		if(beg<end){
			int mid=(beg+end)/2;
			mergeSort(arr,beg,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
	}
}