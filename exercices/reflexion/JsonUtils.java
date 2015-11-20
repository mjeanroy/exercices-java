package exercices.reflexion;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import exercices.annotations.JsonIgnore;
import exercices.annotations.JsonProperty;
import exercices.annotations.JsonStrategy;
import exercices.annotations.JsonVisibility;

public class JsonUtils {
	public static String toJson(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		StringBuilder json = new StringBuilder("{");
		Set<String> set = new HashSet<>();
		
		JsonVisibility visibility = JsonVisibility.GETTER_FIELDS;
		if(c.isAnnotationPresent(JsonStrategy.class)) {
			JsonStrategy anno = (JsonStrategy) c.getAnnotation(JsonStrategy.class);
			visibility = anno.value();
		}
		
		if(visibility.equals(JsonVisibility.GETTER_FIELDS) || visibility.equals(JsonVisibility.GETTER)){
			for (Method m : c.getMethods()) {
				if(!m.isAnnotationPresent(JsonIgnore.class)){
					if (m.getName().startsWith("get") && m.getName() != "getClass") {
						String[] tabNameVal = createName(o, m);
						append(tabNameVal, json);
						set.add(tabNameVal[0]);
					}
				}
			}
		}
		
		if(visibility.equals(JsonVisibility.GETTER_FIELDS) || visibility.equals(JsonVisibility.FIELDS)){
			for (Field f : c.getDeclaredFields()) {
				if (!f.isAnnotationPresent(JsonIgnore.class)) {
					f.setAccessible(true);
					String[] tabNameVal = createName(o, f);
					if (set.add(tabNameVal[0]) != false) {
						append(tabNameVal, json);
					}
				}
			}
		}

		return json.toString().substring(0, json.length() - 1) + "}";
	}

	public static void append(String[] tabNameVal, StringBuilder sb) {
		String prefSuf = "";
		
		if (tabNameVal[2].equals("String"))
			prefSuf = "\"";
		
		sb.append(tabNameVal[0] + ": " + prefSuf + tabNameVal[1] + prefSuf + ",");
	}
	
	public static String[] createName(Object o, AnnotatedElement fieldMethod) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String nameTemp = "";
		String[] tab = new String[3];
		Object v = new Object();
		if(fieldMethod instanceof Method){
			Method m = (Method) fieldMethod;
			v = m.invoke(o);
			nameTemp = m.getName().substring(3, 4).toLowerCase() + m.getName().substring(4);
		}else if(fieldMethod instanceof Field){
			Field f = (Field) fieldMethod;
			v = f.get(o);
			nameTemp = f.getName();
		}
		
		if(v instanceof String){
			tab[2] = "String";
		}else{
			tab[2] = "";
		}
		
		if(fieldMethod.isAnnotationPresent(JsonProperty.class)){
			JsonProperty jsonProperty = (JsonProperty) fieldMethod.getAnnotation(JsonProperty.class);
			tab[0] = jsonProperty.value();
			tab[1] = v.toString();
			return  tab;
		}else{
			tab[0] = nameTemp;
			tab[1] = v.toString();
			return tab;
		}
	}
}
