package com.gl.process;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.gl.bean.Employee;
import com.gl.bean.Project;

public class Process2 {
	public HashMap<Project, ArrayList<Employee>> map;
	public Process2(HashMap<Project, ArrayList<Employee>> map){
		this.map=map;
	}
	  
	 public synchronized void serializeMap() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\helloworld"))) {
	            oos.writeObject(map);
	            System.out.println("Serialize called by Producer");
	            notify();
	            wait();
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	 
	  public synchronized void deserializeMap() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\omkar\\OneDrive\\Desktop\\helloworld"))) {
	            System.out.println("DeSerialize Called by Consumer");
	            HashMap<Project, ArrayList<Employee>> hash= (HashMap<Project, ArrayList<Employee>>)ois.readObject();
	            for(Project key: hash.keySet()) {
					ArrayList<Employee>value= hash.get(key);
					System.out.println("For project");
					System.out.println(key);
					System.out.println("has the following employee");
					for(Employee e:value)
						System.out.println(e);
				}
	            notify();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}



