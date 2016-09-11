package cn.lin;

import cn.itcast.vcode.utils.VerifyCode;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by strawberrylin on 16-9-11.
 */
public class verifyCodeGenerate {
    public static void main(String[] args){
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage ai = verifyCode.getImage();//Get a random photo
        System.out.println(verifyCode.getText());//print the content of the photo
        try {
            VerifyCode.output(ai,new FileOutputStream("/home/strawberrylin/JavaProject/VerifyCodeGenerator/c.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
