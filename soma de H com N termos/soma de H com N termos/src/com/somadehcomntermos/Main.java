package com.somadehcomntermos;

import java.util.Scanner;

public class Main {

   public static void main(String[] Args) {

      double h = 0;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for (int i = 1; i <= n; i++) {

         h += 1.0 / i;
      }

      System.out.println(Math.round(h));

      sc.close();
   }
}
