public class MergeStrategy implements Strategy{
	public double[] sort(double arr[]){
		double finArr[] = mergeSort(arr, 0, arr.length -1); 
		return finArr;
	}

	public double[] merge(double arr1[], double arr2[]){
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int totLen = arr1Len + arr2Len;
		double temp[] = new double[totLen];
		int j = 0, k = 0;

		for(int i = 0; i < totLen; i++){
			if(j == arr1Len){
				temp[i] = arr2[k];
				k++;
				continue;
			}
			if(k == arr2Len){
				temp[i] = arr1[j];
				j++;
				continue;
			}
			if(arr1[j] < arr2[k]){
				temp[i] = arr1[j];
				j++;
			}
			else if(arr1[j] > arr2[k]){
				temp[i] = arr2[k];
				k++;
			}
		}
		return temp;
	}

	public double[] mergeSort(double arr[], int start, int end){
		int mid;
		double temp[] = {};
		if(start == end){
			double arr1[] = {arr[start]};
			return arr1;
		}
		if(start != end){
			double arr1[];
			double arr2[];
			mid = (start + end)/2;
			arr1 = mergeSort(arr, start, mid);
			arr2 = mergeSort(arr, mid + 1, end);
			temp = merge(arr1, arr2);
		}
		return temp;
	}
}
