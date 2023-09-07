 package Data_Type;

public class data_type {

	public static void main(String[] args) {
		int n=300;
		byte b1=(byte)300;
		System.out.println(b1);
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%2;
			sum=sum+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(sum);
	}

}
