package exercices.reflexion;

import java.lang.reflect.InvocationTargetException;

public class MainReflexion {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Product p = new Product(0, "pizza", 12.50F, 2);
		
		System.out.println(JsonUtils.toJson(p));
	}

}
