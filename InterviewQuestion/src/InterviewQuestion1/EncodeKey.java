
package InterviewQuestion1;

import java.security.MessageDigest;
/*
* Algorithm is designed to get SHA-256 hash of input string if algorithm
*is unavailable, return empty string
**/
public class EncodeKey {
public String oneWayEncode(String plaintextPassword) {
MessageDigest digest = null;
String salt = createSalt(context);
try{
digest = MessageDigest.getInstance(plaintextPassword).getInstance("SHA-256");
//digest update
digest.update(salt.getBytes("UTF-8"));
digest.reset();
byte[] data = digest.digest(plaintextPassword.getBytes("UTF-8"));
BASE64Encoder endecoder = new BASE64Encode();
for (int i; i < data.length; i++){
    
}
} catch(NoSuchAlgorithmException | InvalidKeySpecException e) {
   return input;
}

