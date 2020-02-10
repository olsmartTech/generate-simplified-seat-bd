/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.conexion;

/**
 *
 * @author samsung
 */

import com.generate.simplified.core.utilitarios.Constants;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncryptorAlpes {
    public static String encrypt(String key, String initVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            System.out.println("encrypted string: "
                    + Base64.encodeBase64String(encrypted));

            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));

            return new String(original);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
 
    public static void main(String[] args) { 
        
        String key = "adminstrador1234"; // 128 bit key
        String initVector = "RandomInitVector"; // 16 bytes IV
        //String decrip=(EncryptorAlpes.decrypt(Constants.KEY_ENCRIPT_ACCESS, Constants.KEY_DECRIPT_ACCESS, "ADMIN"));
        String decrip=decrypt(Constants.KEY_ENCRIPT_ACCESS, Constants.KEY_DECRIPT_ACCESS,encrypt(Constants.KEY_ENCRIPT_ACCESS, Constants.KEY_DECRIPT_ACCESS, "ADMIN"));
        //System.out.println("-------------------");
        System.out.println("DECRIPT>> " +decrip );
        //System.out.println("ENCRIPT>> " + decrypt(key, initVector,encrypt(key, initVector, "ALF")));
        //System.out.println("DECRIPT>> " +encrypt(key, initVector, "ALF")); "guyVAw6my/CO8u89+OR4KQ=="
    }
    
    
}