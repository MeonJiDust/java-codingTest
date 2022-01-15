package level01;

public class PrimeNumberCreat {

	public int solution(int[] nums) {
		int answer = 0;
		
        boolean flag = true;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int k = j + 1; k < nums.length; k++) {
        			int sum = (nums[i] + nums[j] + nums[k]);
        			
        			if(sum >= 2) {
        				flag = primeCheck(sum);
        			}
        			if(flag == false) {
        				answer++;
        			}
        		}
        	}
        }

        return answer;
    }
	
	public boolean primeCheck(int n) {
		
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				return true;
			}
		}
		return false;
	}
	
}
