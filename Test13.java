import java.util.regex.Pattern;
import java.util.*;
  
class Test13
{
    public static boolean isValid(String num)
    {
        String regExp = "^(a{2})*b((a{2})*b)*[cd]*$";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (num == null)
            return false;
        return pattern.matcher(num).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> literal = new ArrayList<>();
            
          literal.add("aabbbd");
            
        for(String i : literal){
            if (isValid(i))
                System.out.println("This matches");
            else
                System.out.println("This does not match");
        }
    }
}
