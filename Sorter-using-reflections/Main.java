import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import algorithms.*;

import annotations.*;

public class Main {
	public String sorter() throws Throwable {
		Class<CustomController> controller = CustomController.class;
		Field[] fields = controller.getDeclaredFields();
		for (Field field : fields) {
			sort sort = field.getAnnotation(sort.class);
				if (sort != null) {
					CustomController obj = new CustomController();
					Object value = field.get(obj);
					String strategy = sort.strategy();
					System.out.println(value);
					System.out.println(strategy);
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