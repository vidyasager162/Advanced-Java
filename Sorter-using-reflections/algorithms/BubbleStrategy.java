package algorithms;
import java.util.*;
public class BubbleStrategy {
	public List<Integer> sort(List<Integer> list) {
		System.out.println("bubble call received");
		int temp;
		for(int i = 0; i < list.size(); i++){
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < list.get(i)){
					temp = list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		return list;	
	}
}