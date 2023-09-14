package com.gl.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.gl.bean.Employee;
import com.gl.bean.Project;
import com.gl.process.Process1;
import com.gl.process.Process2;
import com.gl.ques3.Question3;
class Producer extends Thread {
    private Process2 obj;

    public Producer(Process2 obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.serializeMap();
    }
}

 class Consumer extends Thread {
    private Process2 obj;

    public Consumer(Process2 obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.deserializeMap();
    }
}

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Process1 p = new Process1();
		
		Question3 q= new Question3 ();
		ArrayList<Employee> list1 = new ArrayList<>();
		ArrayList<Employee> list2 = new ArrayList<>();
		ArrayList<Employee> list3 = new ArrayList<>();
		HashMap<Project, ArrayList<Employee>> map1 = new HashMap();
		Process2 p2= new Process2(map1);
		Producer p1 = new Producer(p2);
        Consumer c1 = new Consumer(p2);
		// HashMap<Project, ArrayList<Employee>> map2 =new HashMap();
		// HashMap<Project, ArrayList<Employee>> map3 =new HashMap();
		Main m = new Main();
		int choice = 0;

		do {
			System.out.println("1: serialize the map");
			System.out.println("2: deserialize the map");
			System.out.println("3: question 3");
			System.out.println("4: question 2");
			System.out.println("enter your choice");
			choice = Integer.parseInt(s.nextLine());
			switch (choice) {
			case 1:
				Project project1 = new Project("P1", "Music Synthesizer", 23);
				Project project2 = new Project("P2", "Vehicle Movement Tracker", 13);
				Project project3 = new Project("P3", "Liquid Viscosity Finder", 15);

				Employee e1 = new Employee("E001", "Harsha", "9383993933", "RTNagar", 1000);
				Employee e2 = new Employee("E002", "Harish", "9354693933", "Jayanagar", 2000);
				Employee e3 = new Employee("E003", "Meenal", "9383976833", "Malleswaram", 1500);
				list1.add(e1);
				list1.add(e2);
				list1.add(e3);

				Employee e4 = new Employee("E004", "Sundar", "9334593933", "Vijayanagar", 3000);
				Employee e5 = new Employee("E005", "Suman", "9383678933", "Indiranagar", 2000);
				Employee e6 = new Employee("E006", "Suma", "9385493933", "KRPuram", 1750);
				list2.add(e4);
				list2.add(e5);
				list2.add(e6);

				Employee e7 = new Employee("E007", "Chitra", "9383978933", "Koramangala", 4000);
				Employee e8 = new Employee("E008", "Suraj", "9383992133", "Malleswaram", 3000);
				Employee e9 = new Employee("E009", "Manu", "9345193933", "RTNagar", 2000);
				list3.add(e7);
				list3.add(e8);
				list3.add(e9);
				map1.put(project1, list1);
				map1.put(project2, list2);
				map1.put(project3, list3);
				try {
					p.serialize(map1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:
				try {
					p.deSerialize();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3: q.findSum();
				break;
			case 4: p1.start();
					c1.start();
					break;
			case 0:
				break;
			}
		} while (choice != 0);

	}

}
