/**
 * Created by dan on 15/08/2015.
 */
public class JPadding {


    public static String pad(String str){
        if(str==null || "".equals(str)) return "000000000000";

        int i = str.length();
        String digits = "0123456789";
        String digitTail = "";
        while(i > 0){
            String currentLetter = str.substring(i-1,i);
            if(digits.contains(currentLetter)){
                digitTail = currentLetter + digitTail;
                --i;
            }else{
                break;
            }
        }
        if(digitTail.length() >= 12) return str;
        else{
            String start = str.substring(0,i);
            int paddingLength = 12 - digitTail.length();
            String padding = createPadding("0",paddingLength);
            return start + padding + digitTail;
        }
    }

    public static String createPadding(String str, int repeatCount){
        if(repeatCount <= 0) return str;

        String result = "";
        while(repeatCount > 0){
            result = result + str;
            --repeatCount;
        }
        return result;
    }


}
