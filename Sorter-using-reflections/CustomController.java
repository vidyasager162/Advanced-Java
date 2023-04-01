import annotations.*;
import java.util.*;

public class CustomController {
	@sort(strategy="merge")
	List<Integer> list = new ArrayList<Integer>(
		Arrays.asList(1,5,2,3,9,0));

}
