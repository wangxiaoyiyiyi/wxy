package refect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRefect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class personClass = Class.forName("refect.Person");
		Person person = (Person)personClass.newInstance();
		System.out.println(personClass.getName());
		Method sayHello = personClass.getDeclaredMethod("sayHello", String.class);
		sayHello.setAccessible(true);
		System.out.println("==========");
		Object result = sayHello.invoke(person, "wxy");//执行方法
		System.out.println("==========");
		System.out.println("result " + result);
		
		
//		字段的获取
		
		Field name = personClass.getDeclaredField("name");
		name.setAccessible(true);
		name.set(person, "wxy");
	}
	
	
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void say(String say) {
		System.out.println("say" + say);
	}

	@SuppressWarnings("unused")
	private void sayHello(String hello) {
		System.out.println("sayHello" + hello);
	}
}