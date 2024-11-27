package EnumTest;

public class Tools {
    public static boolean hasUser(String[] arr, String enteredUsername){
        for(String u:arr){
            if(u.equals(enteredUsername)){
                return true;
            }
        }
        return false;
    }
    public static void checkPassword(String enteredPassword, String password){
        if(password.equals(enteredPassword)){
            System.out.println("wellcome to website...");
        }else{
            System.out.println("password not found");
        }
    }
    public static void checkUserDetails(String[]arr,String enteredUsername, String enteredPassword, String password){
        if(hasUser(arr,enteredUsername)){
            checkPassword(enteredPassword,password);
        }else{
            System.out.println("user not found");
        }
    }
}
