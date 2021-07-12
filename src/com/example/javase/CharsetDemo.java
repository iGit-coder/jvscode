package com.example.javase;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

import com.example.interfaces.TestInterface;

public class CharsetDemo implements TestInterface{
    

    public  void test(){
        
        System.out.println("Hello world!");
        // String words = "Hello 我来了！";
        // String charsetName="utf-16";
        // String charsetName="utf-8";
        // String charsetName="ascii";
        // String charsetName="iso-8859-1";
        // String charsetName="gbk";
        // Charset cs1 = Charset.forName(charsetName);
        Charset cs1 = Charset.defaultCharset();
        // ByteBuffer bbw = cs1.encode(words);
        // CharBuffer cbw = cs1.decode(bbw);
        // System.out.println(cbw.toString());
        System.out.println("使用的字符集为："+cs1.displayName());
        //#############################################################//

        

    }
}
