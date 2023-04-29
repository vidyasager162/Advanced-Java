/*
Regd.No: 204221
UCSH-605: ADVANCED JAVA - FINAL LAB EXAM
Question: Encodes characters with its ASCII value followed by a space. 
Only printable ASCII characters (those in the inclusive range 32 to 126) 
should be converted. This option takes no parameters. 
Hint : Use character arrays instead of Strings.
*/
package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public String doASCII(String data) {
        char[] str = new char[data.length()];
        //int[] str2 = new int[data.length()];
        String respData = "";
        for (int i = 0; i < data.length(); i++) {
            str[i] = data.charAt(i);
            if ((int)str[i] >= 32 && (int)str[i] <= 126) {
                if (i == data.length() - 1) {
                    respData += (int)str[i];
                } else {
                    respData += (int)str[i];
                    respData += " ";
                }
            } else {
                if (i == data.length() - 1) {
                    respData += str[i];
                } else {
                    respData += str[i];
                    respData += " ";
                }
            }
        }
        // for (int i = 0; i < str.length; i++) {
        //     str2[i] = str[i];
        //     // System.out.println(str2[i]);
        // }
        // for (int i = 0; i < str.length; i++) {
        //     respData += str2[i];
        //     respData += " ";
        // }
        return respData;
    }
    // public static void main(String... args) {
    //     App ob = new App();
    //     ob.doASCII("Sairam");
    // }
}
