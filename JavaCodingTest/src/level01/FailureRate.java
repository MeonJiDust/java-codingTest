package level01;

import java.util.HashMap;

public class FailureRate {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        
        HashMap<Integer, Double> map = new HashMap<>();
        
        int member = stages.length;
        int count = 0;
        int sum = 0;
        
        for(int i = 1; i <= N; i++) {
        	for(int j = 0; j < stages.length; j++) {
        		
        		if(i == stages[j]) {
        			 
        			sum++;
        			count++;
        		}else {
        			break;
        		}
        	}

    		if(sum == 0) { 
    			map.put(i, 0.0);
    		}else {
    			map.put(i, ((double)sum / member * 100.0));
    		}
    		
    		member -= count;
    		sum = 0; 
    		count = 0; 
        }
        
        int arr[] = new int[map.size()];
        
        
         
        
        
        return answer;
    }
}
