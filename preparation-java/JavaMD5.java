import java.math.BigInteger;
import java.security.*;

//Dada uma string alfanumérica,s, denotando uma senha
//calcule e imprima seu valor de criptografia MD5.
public class JavaMD5 {

   public static void main(String[] args) throws NoSuchAlgorithmException {
      String s = "HelloWorld"; // string que será criptografada
      String hashtext = encode(s); // recebe string s criptografada
      System.out.println(hashtext);
   }

   private static String encode(String s) throws NoSuchAlgorithmException {
      MessageDigest m = MessageDigest.getInstance("MD5");

      m.reset();
      m.update(s.getBytes());
      byte[] digest = m.digest();
      BigInteger bigInt = new BigInteger(1, digest);

      return bigInt.toString(16);
   }
   
}
