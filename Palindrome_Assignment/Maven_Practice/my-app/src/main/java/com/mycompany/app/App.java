package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
	public String getSubStr(String str, int start, int end)
    {	
    	String subStr = "";
    	subStr = subStr + str.charAt(start);
        for(int i = start + 1; i <= end; i++){
            subStr = subStr + str.charAt(i);
        }
        return subStr;
    }
 
    public String findLongestSubStr(String str)
    {
        int len = str.length();
        int maxLen = 1;
        int start = 0;
    
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                int flag = 1;
                for(int k = 0; k < (j - i + 1) / 2; k++){
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;
 			    }
                if(flag!=0 && (j - i + 1) > maxLen){
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }   
        String subStr = getSubStr(str, start, start + maxLen - 1);
        return subStr;
    }
}
