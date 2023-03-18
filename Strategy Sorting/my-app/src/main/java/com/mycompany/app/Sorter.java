package com.mycompany.app;


public class Sorter{
	Strategy strategy;

	public Sorter(){
		strategy = null;
	}

	double[] sort(double arr[], Strategy strategy){
		return strategy.sort(arr);
	}

	double[] sort(double arr[]){
		return strategy.sort(arr);
	}

	void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	public double[] bubbleSorting(){
		double arr[] = {10,14,12,1,2,3,4,7,11,13};
		double output[];
		Sorter sorter = new Sorter();
		System.out.println("Bubble strategy being passed in the sort function.");
		output = sorter.sort(arr, new BubbleStrategy());
		return output;
	}

	public double[] mergeSorting(){
		double arr[] = {10,14,12,1,2,3,4,7,11,13};
		double output[];
		Sorter sorter = new Sorter();
		System.out.println("Merge strategy being passed in the sort function.");
		output = sorter.sort(arr, new MergeStrategy());
		return output;
	}
}
