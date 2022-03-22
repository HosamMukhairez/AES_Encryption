/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aes_encryption;

/**
 *
 * @author Hp
 */
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 * Created by Hosam.
 */
public class EncryptionUtils1 {

    private static final String ALGORITHM = "AES";
    private static final byte[] ENCRYPTION_KEY1 = new byte[]{'T', 'h', 'i', 's', 'L', 'i', 't', 't', 'l', 'e', 'B', 'a', 'b', 'b', 'y', '!'};
    private static final byte[] ENCRYPTION_KEY2 = new byte[]{89, 101, 77, 33, 51, 99, 75, 99, 73, 94, 35, 48, 33, 37, 42, 43};	
    private static byte[] ENCRYPTION_KEY = null;

    public static void setKey(int key) {
        if (key == 1) {
            ENCRYPTION_KEY = ENCRYPTION_KEY1;
        } else if (key == 2) {
            ENCRYPTION_KEY = ENCRYPTION_KEY2;
        }
    }

    public static String encrypt(String data) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(data.getBytes());
            //String encryptedValue = new BASE64Encoder().encode(encVal);
            String encryptedValue = new Base64().encodeAsString(encVal);
            return encryptedValue;
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }//*/

    public static String decrypt(String encryptedData) {
        try {
            Key key = generateKey();
            Cipher c = Cipher.getInstance(ALGORITHM);
            c.init(Cipher.DECRYPT_MODE, key);
            //byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
            byte[] decordedValue = new Base64().decode(encryptedData);
            byte[] decValue = c.doFinal(decordedValue);
            String decryptedValue = new String(decValue, "UTF-8");
            return decryptedValue;
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }//*/

    private static Key generateKey() {
        try {
            Key key = new SecretKeySpec(ENCRYPTION_KEY, ALGORITHM);
            return key;
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }    
}
