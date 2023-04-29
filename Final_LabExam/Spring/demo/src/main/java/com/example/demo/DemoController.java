/*
Regd.No: 204221
UCSH-605: ADVANCED JAVA - FINAL LAB EXAM
Question: Encodes characters with its ASCII value followed by a space. 
Only printable ASCII characters (those in the inclusive range 32 to 126) 
should be converted. This option takes no parameters. 
Hint : Use character arrays instead of Strings.
*/
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.lang.*;
import com.mycompany.app.*;

@RestController
public class DemoController {
	@PostMapping("/wordprocessor")
	public String index(@RequestBody Map<String,Object> json) {
		String data = (String)json.get("data");
		String respData = "";
		ArrayList<String> options = (ArrayList<String>)json.get("options");
		App ob = new App();
		if (options.contains("-a")){
			respData = ob.doASCII(data);
		}
		else {
			System.out.println(options);
			return "Wrong options... Please check the options entered.\nI have chosen the -a problem to encode characters in a string with their ASCII values.\nSo the App expects only -a in the options.";
		}
		return respData;
	}
}
