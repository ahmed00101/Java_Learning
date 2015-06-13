package eu.mcapp.java.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by waqar on 12/06/15.
 */
public class Crypt {

public static String salt = "f91b1f92a3f13b2d1eed01ba403f2fed4829b0g3";

    public static String sha1(String input)  {

        MessageDigest mDigest = null;
        try {
            mDigest = MessageDigest.getInstance("SHA1");
        }catch ( NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }



    public static String sha1_salted(String input)  {
input = salt+input;

        MessageDigest mDigest = null;
        try {
            mDigest = MessageDigest.getInstance("SHA1");
        }catch ( NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }

        return sb.toString();
    }
}
