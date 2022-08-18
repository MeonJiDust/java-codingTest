package cospro_01;

public class Main {

	public static void main(String[] args) {
//        First_02 first_02 = new First_02();
//        long num = 9949999;
//        long ret = first_02.solution(num);
//
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
		First_03 first_03 = new First_03();
		int n1 = 3;
        int ret1 = first_03.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = first_03.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
        
        First_06 first_06 = new First_06();
        String pos = "A7";
        int ret = first_06.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
