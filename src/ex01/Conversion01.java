package ex01;

public class Conversion01 {

	public static void main(String[] args) {

		double d;
		int sum = 100;
		d = sum;
		
		System.out.println(d);
		System.out.println(sum);
		//자동 형 변환
		
		short s1 = 32000;
		int i1;
		i1 = s1;
				
		System.out.println(s1);
		System.out.println(i1);
		//자동 형 변환
		
		int i2 = 32000;
		short s2;
		s2 = (short)i2;
		
		System.out.println(i2);
		System.out.println(s2);
		//명시적 형 변환(short)
		
		int i3 = 50000;
		short s3 = (short)i3;
		
		System.out.println(i3);
		System.out.println(s3);
		
		
		System.out.println(4.0/2.0);
		System.out.println((int)4.0/(int)2.0);
		System.out.println((int)(4.0/2.0));
	}

}
