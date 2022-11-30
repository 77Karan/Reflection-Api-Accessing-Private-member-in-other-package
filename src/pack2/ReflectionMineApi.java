package pack2;

import java.lang.reflect.Field;

public class ReflectionMineApi 
{
	public static void main(String[] args) 
	{
		try
		{
			//Loading the class
			Class clzz = Class.forName("pack1.User");
			//Creating the object of loaded class
			Object object = clzz.newInstance();
			//Getting the private field from loaded class
			Field ageField = clzz.getDeclaredField("age");
			//setting the ageField for Accessible
			ageField.setAccessible(true);
			//setting the value to Field
			ageField.set(object,20);
			//getting the value of Field
			System.out.println(ageField.get(object));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
