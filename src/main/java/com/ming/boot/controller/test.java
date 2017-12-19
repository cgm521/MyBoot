package com.ming.boot.controller;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author cgm
 * @date 2017/12/13.
 */
public class test {
    public static void main(String[] args) throws IOException {
//        StringBuffer sb = new StringBuffer();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String in ;
//        in = br.readLine();
//        System.out.println(in);
//        sb.append(in);
//        System.out.println(sb.toString());

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int s1=s;
        int r = 0;

        for (; ; ) {
            if (s  > 0) {
                int i = s % 10;
                r=r*10+i;
                s=s/10;
            }else {
                break;
            }
        }
        System.out.println(r+s1);

    }

    public static int _one() {
        return 2*1+1;
    }

    public static int _two() {
        return 2*2+2;
    }
}
