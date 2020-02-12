package br.com.start.io;

import java.nio.charset.Charset;

public class TestUnicodeEncond
{
    public static void main(String[] args) {

        String s = "c";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();


        System.out.println(charset);

    }
}
