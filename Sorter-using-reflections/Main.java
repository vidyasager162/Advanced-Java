import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import algorithms.*;
import java.util.*;

import annotations.*;

public class Main {
	public String sorter() throws Throwable {
		Class<CustomController> controller = CustomController.class;
		Object obj = controller.newInstance();
		Field[] fields = controller.getDeclaredFields();
		for (Field field : fields) {
			Sort sort = field.getAnnotation(Sort.class);
				if (sort != null) {
					//CustomController obj = new CustomController();
					Object value = field.get(obj);
					String strategy = sort.strategy();
					if (strategy.equals("bubble")) {
						BubbleStrategy bub = new BubbleStrategy();
						// double[] temp = mer.sort(value);
						List<Integer> list = new ArrayList<Integer>((List<Integer>)value);
						List<Integer> finallist = new ArrayList<Integer>(bub.sort(list));
						System.out.println(finallist);
					} else if (strategy.equals("merge")) {
						MergeStrategy mer = new MergeStrategy();
						double[] temp = mer.sort((double[])value);
						for (int i =0; i < temp.length; i++)
							System.out.print(temp[i] + " ");
					}
				}
			}
			return null;
		}



	public static void main(String... args) {
		try {
			new Main().sorter();
		} catch (Throwable e) {

		}
	}
}