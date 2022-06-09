package problemSolvin;

public class DuplicateValue {

	public static void main(String[] args) {
		int a[]= {1,2,5,7,5,2,99};
		boolean flag=false;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
			
				if(a[i]==a[j]) {
					
					System.out.println("This is duplicate Number "+a[j]);
					flag=true;
				}	
			}	
		}
		if (flag==false) {
			System.out.println("I do not found duplicate value " );
		}
	}
}
