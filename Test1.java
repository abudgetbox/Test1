
import java.util.regex.Pattern;
import java.util.*;
  
class Test1
{
    public static boolean isValid(String email)
    {
        String regExp = "^[0-9]*.[0-9]*"+
                            "(e[0-9]+){0,1}|(E[0-9]+){0,1}" +
                            "[f|F|l|L]";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> email = new ArrayList<>();
            
          email.add("14.79L");
            
        for(String i : email){
            if (isValid(i))
                System.out.println("This is a floating point literal");
            else
                System.out.println("This is not a floating point literal");
        }
    }
}