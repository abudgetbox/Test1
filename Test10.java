
import java.util.regex.Pattern;
import java.util.*;
  
class Test10
{
    public static boolean isValid(String num)
    {
        String regExp = "([0-9] | [1-9][0-9]* |[0-7]+| 0[xX][0-9a-fA-F]+)(i64|I64|u|U|l|L)?";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (num == null)
            return false;
        return pattern.matcher(num).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> literal = new ArrayList<>();
            
          literal.add("4324321u");
            
        for(String i : literal){
            if (isValid(i))
                System.out.println("This is a integer literal");
            else
                System.out.println("This is not a integer literal");
        }
    }
}
