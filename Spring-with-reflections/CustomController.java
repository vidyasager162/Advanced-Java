import annotations.*;

@RestController(number = 10)
public class CustomController {

	@RequestMapping(call = true)
	public String method() {
		System.out.println("Sairam");
		return "aaaaa";
	}

	@RequestMapping(invoke = true)
	public String method1() {
		System.out.println("This");
		return "aaaaa";
	}

	@RequestMapping(call = true)
	public String method2() {
		System.out.println("Works");
		return "aaaaa";
	}

}
