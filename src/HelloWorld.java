// Using Annotative SPL

public class HelloWorld {

	public static void main(String[] args) {
		// #if Hello
		System.out.print("Hello");
		// #endif
		
		// #if Crazy | Amazing
		System.out.print(" very");
		// #endif
		
		// #if Crazy
		System.out.print(" crazy");
		// #endif
		
		// #if Amazing
//@		System.out.print(" amazing");
		// #endif
		
		// #if World
		System.out.print(" world");
		// #endif

	}

}
