package level01;

public class NewId {

    public String solution(String new_id) {
        String answer = "";
        
        System.out.println("들어옴!!");
        int tmpI;
        char tmpS;
        
        answer = new_id.toLowerCase();
        System.out.println(answer);
        answer = answer.replaceAll("[^a-zA-Z0-9\\-\\_\\.]", "");
        System.out.println(answer);
        
        while(true){
        	
        	if(answer.contains("..")) {
        		answer = answer.replace("..", ".");
        	}else {
        		break;
        	}
        }
        System.out.println(answer);
        
        answer = answer.replaceFirst(".", "");
        System.out.println(answer);
        
        if(answer.charAt(answer.length() - 1) == '.') {
        	
        	System.out.println("들어오");
        	//answer = answer.substring(0, answer.length() - 1);
        	answer = answer.replaceFirst(".$", "");
        }
        System.out.println(answer);
        
        if(answer == "") {
        	answer = "a";
        }
        
        
        for(int i = 0; i < new_id.length(); i++) {
        	
        	tmpS = new_id.charAt(i);
//        	if(!(tmpI >= 97 && tmpI <= 122) || !(tmpI >= 48 && tmpI <= 57) || (tmpI != 45) || (tmpI != 95) || (tmpI != 46)) {
//        		new_id.charAt(i)
//        	}
        	//if(tmpS.)
        	
        }
        return answer;
    }
}
