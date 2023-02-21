
import java.util.regex.Pattern;
import java.util.*;
  
class Test1
{
	public static boolean isValid(String email)
    {
        String regExp = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pattern = Pattern.compile(regExp);
        if (email == null)
            return false;
        return pattern.matcher(email).matches();
    }
    public static void main(String[] args)
    {
        ArrayList<String> email = new ArrayList<>();
            
          email.add("Thisisatest@gmail.com");
            
        for(String i : email){
            if (isValid(i))
                System.out.println("This is an email address");
            else
                System.out.println("This is not an email address");
        }
    }
}