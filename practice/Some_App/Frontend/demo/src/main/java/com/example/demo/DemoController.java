package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;

@RestController
public class DemoController {
	@PostMapping("/palindrome")
	public String index(@RequestBody Map<String,String> data) {
		String str = data.get("string");
		App ob = new App();
		String subStr = ob.findLongestSubStr(str);
		return subStr;
	}
}
