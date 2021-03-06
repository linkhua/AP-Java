public class Utilities
{
	public static int getRandomInteger(int min, int max){
		int result = (int)(min + Math.random() * (max - min + 1));
		return result;
	}
	public static int sum(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
	public static double average(int[] arr){
		double avg = sum(arr) / arr.length;
		return avg;
	}
	public static void printArr(int[] arr){
		for (int num : arr)
			System.out.print(num + " ");
	}
	public static void printArr(String[] arr){
		for (String str : arr)
			System.out.print(str + " ");
	}
	public static int largestValue(int[] arr){
		int largest = Integer.MIN_VALUE; 
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > largest)
				largest = arr[i];
		}
		return largest;
	}	
	public static int positionOfLargest(int[] arr){
		int pos = 0;
		for(int i = 1; i < arr.length; i++)
			if(arr[i] > arr[pos])
				pos = i;
		return pos;
	}	
	public static int[] insertElement(int value, int[] arr, int idx){//precondition: index >= 0 && index <= arr.length
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i < idx; i++)
			arr2[i] = arr[i];
		arr2[idx] = value;
		for(int i = idx + 1; i < arr2.length; i++)
			arr2[i] = arr[i-1];
		return arr2;		
	}
	public static int[] deleteElement(int[] arr, int idx){
		int[] arr2 = new int[arr.length - 1];
		for(int i = 0; i < idx; i++)
			arr2[i] = arr[i];
		for(int i = idx + 1; i < arr.length; i++)
			arr2[i - 1] = arr[i];
		return arr2;
	}
	public static int[] createIntArray(int arrLength){
		return new int[arrLength];
	}
}
