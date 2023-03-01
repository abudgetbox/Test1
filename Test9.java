
import java.util.regex.Pattern;
import java.util.*;
  
class Test9
{
    public static boolean isValid(String num)
    {
        String regExp = "[+-]?([0-9]*\\.[0-9] | [0-9]+\\.)([eE][+-]?[0-9]+)?[LlFf]?";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (num == null)
            return false;
        return pattern.matcher(num).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> floaty = new ArrayList<>();
            
          floaty.add("14.79L");
            
        for(String i : floaty){
            if (isValid(i))
                System.out.println("This is a floating point literal");
            else
                System.out.println("This is not a floating point literal");
        }
    }
}
