import java.util.regex.Pattern;
import java.util.*;
  
class Test15
{
    public static boolean isValid(String num)
    {
        String regExp = "/\\*.*\\*/";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (num == null)
            return false;
        return pattern.matcher(num).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> literal = new ArrayList<>();
            
          literal.add("fdsf");
            
        for(String i : literal){
            if (isValid(i))
                System.out.println("This is a multilined comment");
            else
                System.out.println("This is not a multilined comment);
        }
    }
}
