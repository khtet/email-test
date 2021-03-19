package com.email.app;

import java.util.Scanner;

public class SendMailTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SendMail sm = new SendMail();
        System.out.print("Email");
        String email = sc.nextLine();
        sm.sendEmail("khtet18@gmail.com", "Send Mail Tester", "This is a testing email to try out new program");
    }
}
