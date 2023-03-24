
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        // replace this line with your code
        // Jasmine was rather terribly insulting! -> ther terribly
        //"If the forest is blue, then what?" -> ""
        String answer = "";
        boolean inT = false;
        String Upper = s.toUpperCase();
        for (int index = 0; index < s.length(); index++){
            if (Upper.charAt(index) == 'T') {
                inT = true;
            }

            if(inT == true){
                answer += s.charAt(index);
            }

            if (Upper.charAt(index) == 'Y'){
                inT = false;
            }

        }
        if (inT == true) {
            return "";
        } else {
            return answer;
        }
    }}

