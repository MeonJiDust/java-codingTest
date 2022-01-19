package level01;

import java.util.Arrays;

public class MissNumber02 {

    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        for(int i = 0; i < 10; i++) {
        	
        	if(numbers[i] != i) {
        		answer += i;
        	}
        }
        return answer;
        
    }
}
