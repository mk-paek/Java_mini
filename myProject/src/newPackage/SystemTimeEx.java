package newPackage;

public class SystemTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long time1 = System.nanoTime();
		long time1 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("1~1000000 까지의 합: " + sum);
		System.out.println("소요된 시간은 " + (time2-time1) + " 밀리 초 입니다.");
	}

}
