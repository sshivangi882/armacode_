/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.util;

import java.util.Random;

/**
 *
 * @author Swadesh Sharma
 */
public class OTPGenerator {
    
    public static String getOTP(){
        String nums="0123456789";
        
        String otp="";
        
        Random r=new Random();
        
        for(int i=0;i<4;i++){
            otp=otp+ nums.charAt(r.nextInt(nums.length()));
        }
        
        return otp;
    }
    
//    public static void main(String[] args) {
//        
//        String otp=getOTP();
//        System.out.println(otp);
//    }
}
