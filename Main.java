package com.even.base64;
import java.util.Base64;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

System.out.println(" BASE64 JAVA ");



String input = scanner.nextLine();


String encodedString = Base64.getEncoder().encodeToString(input.getBytes());

        System.out.println( encodedString);
   
   
  }
}
