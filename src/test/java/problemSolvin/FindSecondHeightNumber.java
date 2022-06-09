package problemSolvin;

public class FindSecondHeightNumber {
	public static void main(String[] args) {

		int arr[] = { 5, 15, 55, 79,78, 9 };
		int max = 0;
		int secondheight=0;

		if (arr[0] > arr[1]) {

			max = arr[0];
		}

		if (arr[0] < arr[1]) {
			
			max = arr[1];
			secondheight = max;
		}
		for (int i = 2; i < arr.length; i++) {

			if (arr[i] <= max && arr[i] >= secondheight) {
				
				secondheight = arr[i];
			}
				if(arr[i]>=max) {
					secondheight=max;
					max=arr[i];
				}
			}
		System.out.println("This is Second Heighest Number "+ secondheight);
	}
}
