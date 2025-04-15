package com.gk.study.utils;

import org.springframework.util.DigestUtils;

public class GenPasswd {
    public static String salt = "abcd1234";

    public static void main(String []args){
        String inputPwd = "ddd";

        String passwd = DigestUtils.md5DigestAsHex((inputPwd + salt).getBytes());
        System.out.println("加密后的密码是：" + passwd);

    }
}
