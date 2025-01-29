import java.util.Random;
public class PswCheck {
    public static String generatepassword(int length) {
        String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz !@#$%^&* 1234567890";
        Random psw=new Random();
        StringBuilder password=new StringBuilder();
        for(int i=0;i<length;i++){
            int index=psw.nextInt(Characters.length());
            password.append(Characters.charAt(index));
        }
        return password.toString();
    }
    public static void main(String[] args) {
        int passwordLength=8;
        String password=generatepassword(passwordLength);
        System.out.println("generated password: "+password);
    }
}
