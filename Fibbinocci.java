package week2.day2;

public class Fibbinocci {
	public static void main(String[] args) {
		int FirstNum=0,SecondNum=1,sum=0;
		System.out.println("first number is "+FirstNum+"\n"+"second number is"+SecondNum+"\n");
		System.out.println("fibbinocci series are :");
		for(int i=1;i<=11;i++) {
			sum=FirstNum+SecondNum;
			System.out.println(sum);
			FirstNum=SecondNum;
			SecondNum=sum;
			
		}
	}

}
