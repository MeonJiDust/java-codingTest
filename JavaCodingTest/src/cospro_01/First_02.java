package cospro_01;

public class First_02 {

	public long solution(long num) {
        long plus_one = num + 1;
        
        System.out.println(plus_one);
				
		String plus_str = Long.toString(plus_one);
		
		System.out.println(plus_str);
		String textString = plus_str.replaceAll("0", "1");
		System.out.println(textString);
        long answer = Long.parseLong(plus_str);
        return answer;
    }

}
