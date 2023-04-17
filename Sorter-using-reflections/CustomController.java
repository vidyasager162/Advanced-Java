import annotations.*;
import java.util.*;

public class CustomController {

	@Sort(strategy="bubble")
	List<Integer> list = new ArrayList<Integer>(
		Arrays.asList(100,1,5,2,3,9,0));

	@Sort(strategy="merge")
	double[] arr = {100,1,5,2,3,9,0};
}
