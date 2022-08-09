package cospro_01;

public class First_03 {

	public int solution(int n) {
        
		int count = 0;
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			if(i % 2 != 0) {
				for(int j = n - 1; j >= 0; j--) {
					arr[i][j] = ++count;
				}
			}else {
				for(int j = 0; j < n; j++) {
					arr[i][j] = ++count;
				}
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		int answer = 0;
		return answer;
	}
}
