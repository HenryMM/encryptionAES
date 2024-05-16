package org.henry;
public class Main {

    public static void main(String[] args) {

        try{
            AES aes = new AES();
            aes.init();
            String encryptedMessage = aes.encrypt("Hola a todos");
            String decryptedMessage = aes.decrypt(encryptedMessage);

            System.err.println("encrypted Message: "+encryptedMessage);
            System.err.println("decrypted Message: "+decryptedMessage);
        }catch (Exception e){

        }
    }
}