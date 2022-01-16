package level01;

public class NewId {

    public String solution(String new_id) {
        String answer = "";
        
        System.out.println("들어옴!!");
        int tmpI;
        char tmpS;
        
        answer = new_id.toLowerCase();
        System.out.println("1" +  answer);
        
        answer = answer.replaceAll("[^a-zA-Z0-9\\-\\_\\.]", "");
        System.out.println("2" + answer);
        
        while(true){
        	
        	if(answer.contains("..")) {
        		answer = answer.replace("..", ".");
        	}else {
        		break;
        	}
        }
        System.out.println("3" + answer);
        
        if(answer.charAt(0) == '.') {
        	answer = answer.replaceFirst(".", "");
        }
        System.out.println("4" + answer);
        
        if(answer.length() == 0) {
        	answer = "a";
        }
        System.out.println("4" + answer);
        
    	if(answer.charAt(answer.length() - 1) == '.') {
        	
        	System.out.println("들어오");
        	//answer = answer.substring(0, answer.length() - 1);
        	answer = answer.replaceFirst(".$", "");
        }
        System.out.println("5" + answer);
        
        if(answer.length() >= 16) {
        	
        	for(int i = 15; i < answer.length(); i++) {
        		
        		answer = answer.substring(0, i);
        	}
            if(answer.charAt(answer.length() - 1) == '.') {
            	
            	answer = answer.replaceFirst(".$", "");
            }
        }
        System.out.println("6" + answer);
        
        if(answer.length() <= 2) {
        	
        	char lastChar = answer.charAt(answer.length() - 1);
        	
        	while(true) {
        		
        		if(answer.length() < 3) {
        			
        			answer += lastChar;
        		}else {
        			break;
        		}
        	}
        }
        System.out.println("7" + answer);
        

        return answer;
    }
}
