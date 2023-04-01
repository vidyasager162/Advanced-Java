package algorithms;

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

	public static void main(String[] args){
		double arr[] = {10,14,12,1,2,3,4,7,11,13};
		double output[];
		Sorter sorter = new Sorter();
		System.out.println("Bubble strategy being passed in the sort function.");
		output = sorter.sort(arr, new BubbleStrategy());
		for(int i = 0; i < output.length; i++)
			System.out.println(output[i]);
		System.out.println("Bubble strategy being set using setStrategy.");
		sorter.setStrategy(new BubbleStrategy());
		output = sorter.sort(arr);
		for(int j = 0; j < output.length; j++)
			System.out.println(output[j]);
		System.out.println("Merge Strategy being passed in the sort function.");
		output = sorter.sort(arr, new MergeStrategy());
		for(int k = 0; k < output.length; k++)
			System.out.println(output[k]);
		System.out.println("Merge Strategy being set using setStrategy.");
		sorter.setStrategy(new MergeStrategy());
		output = sorter.sort(arr);
		for(int h = 0; h < output.length; h++)
			System.out.println(output[h]);


	}
}