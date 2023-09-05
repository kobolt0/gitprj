package org.example;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        main1();
    }
    public static void main1() {
        String str1 = "abcabc123";
        String str2 = new String(str1.getBytes(StandardCharsets.UTF_8), 0, 6);

        System.out.println(str2);
//        ############


    }
}
