package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@RequestMapping("/bubble-sorter")
	public double[] bubbleService(){
		Sorter obj = new Sorter();
		double arr[] = obj.bubbleSorting();
		return arr;
	}

	@RequestMapping("/merge-sorter")
	public double[] mergeService(){
		Sorter obj = new Sorter();
		double arr[] = obj.mergeSorting();
		return arr;
	}
}
