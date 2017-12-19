package com.ming.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author cgm
 * @date 2017/12/13.
 */
@RestController
@RequestMapping("/tools")
public class ToolsController {

    @RequestMapping("/test")
    public String test(ServletRequest request, ServletResponse response) throws Exception{
        ServletInputStream inputStream = request.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader((inputStream), "utf-8");
        BufferedReader br = new BufferedReader(inputStreamReader);

        InputStream in = System.in;
        long l = System.currentTimeMillis();
//        br.mark(Integer.MAX_VALUE/2);
        StringBuffer sb = new StringBuffer("");
        String temp = br.readLine();
//        while ((temp = br.readLine()) != null) {
            sb.append(temp);
//        }
        System.out.println(System.currentTimeMillis()-l);
        System.out.println("00000000000");
        System.out.println(sb.toString());
        System.out.println("00000000000");
//        br.reset();
        while ((temp = br.readLine()) != null) {
            sb.append(temp);
        }
        System.out.println("11111111111");
        System.out.println(sb.toString());
        System.out.println("1111111111111");
        return sb.toString();

    }
}
