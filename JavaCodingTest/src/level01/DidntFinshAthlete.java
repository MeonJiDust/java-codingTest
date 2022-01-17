package level01;

public class DidntFinshAthlete {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
		
        for(int i = 0; i < completion.length; i++) {
        	for(int j = 0; j < participant.length + 1; j++) {
        		
        		if(completion[i].equals(participant[j])) {
        			participant[j] = "";
        			break;
        			
        		}
        	}
        }
        
        for(int i = 0; i < participant.length; i++) {
        	
        	if(participant[i] != "")
        		answer = participant[i];
        }
        
        
        return answer;
    }

}
