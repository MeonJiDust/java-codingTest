package level01;

import java.util.Arrays;

public class MissNumber {

    public int solution(int[] numbers) {
        int answer = 1;
        
        Arrays.sort(numbers);
        
        for(int i = 0; i < 10; i++) {
        	
        	if(!Arrays.asList(numbers).contains(i)) {
        		answer += numbers[i];
        	}
//        	if(i != numbers[i]) {
//        		answer += numbers[i];
//        	}
        }
        
        return answer;
    }
}
