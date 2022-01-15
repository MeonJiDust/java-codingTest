package level01;

public class PrimeNumberCreat {

	public int solution(int[] nums) {
        int sum = 0;
        boolean flag = false;
        
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int k = j + 1; k < nums.length; k++) {
        			sum = (nums[i] + nums[j] + nums[k]);
        			
        			if(sum >= 2) {
        				flag = primeCheck(sum);
        			}
        			if(!flag) {
        				sum++;
        			}
        		}
        	}
        }

        return sum;
    }
	
	public boolean primeCheck(int n) {
		
		for(int i = 1; i < n; i++) {
			
			if(n % 1 == 0) {
				return true;
			}
		}
		
		return false;
	}
	
}
