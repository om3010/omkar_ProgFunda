package com.gl.process;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import com.gl.bean.Employee;
import com.gl.bean.Project;

public class Process1{
	
	public void serialize(HashMap<Project, ArrayList<Employee>> map) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\helloworld") ;
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		try(fos;oos){
			oos.writeObject(map);
			System.out.println("serialized map of project successfull");
		}
	}
	public void deSerialize() throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\helloworld");
		ObjectInputStream ois= new ObjectInputStream(fis);
		try(fis;ois){
			HashMap<Project, ArrayList<Employee>> hash= (HashMap<Project, ArrayList<Employee>>)ois.readObject();
			for(Project key: hash.keySet()) {
				ArrayList<Employee>value= hash.get(key);
				System.out.println("For project");
				System.out.println(key);
				System.out.println("has the following employee");
				for(Employee e:value)
					System.out.println(e);
			}
		}
	}
	
	
}
