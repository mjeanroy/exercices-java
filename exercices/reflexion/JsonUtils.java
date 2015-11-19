package exercices.reflexion;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JsonUtils {
	public static String toJson(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		StringBuilder json = new StringBuilder("{");
		Set<String> set = new HashSet<>();
		String prefSuf;
		for (Method m : c.getMethods()) {
			if (m.getName().startsWith("get") && m.getName() != "getClass") {
				Object v = m.invoke(o);
				String name = m.getName().substring(3, 4).toLowerCase() + m.getName().substring(4);
				append(name, v, json);
				set.add(name);
			}
		}

		for (Field f : c.getDeclaredFields()) {
			f.setAccessible(true);
			Object v = f.get(o);
			String name = f.getName();
			if (set.add(name) != false) {
				append(name, v, json);
			}
		}

		return json.toString().substring(0, json.length() - 1) + "}";
	}

	public static void append(String name, Object o, StringBuilder sb) {
		String prefSuf = "";
		if (o instanceof String)
			prefSuf = "\"";
		
		sb.append(name + ": " + prefSuf + o + prefSuf + ",");
	}
}
