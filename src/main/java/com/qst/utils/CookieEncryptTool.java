package com.qst.utils;//package com.qst.utils;
//
//import com.sun.org.apache.xml.internal.security.utils.Base64;
//
//import java.io.UnsupportedEncodingException;
//
//public class CookieEncryptTool {
//    public static String encodeBase64(String cleartext){
//        try {
//            cleartext=new String(Base64.encode(cleartext.getBytes("UTF-8")));
//        }catch (UnsupportedEncodingException e){
//            e.printStackTrace();
//        }
//        return cleartext;
//    }
//    public static  String decodeBase(String ciphertext){
//        try{
//            ciphertext=new String(Base64.decodeBase64(ciphertext.getBytes()),"UTF-8");
//
//        }catch (UnsupportedEncodingException e){
//            e.printStackTrace();
//        }
//        return ciphertext;
//    }
//}
