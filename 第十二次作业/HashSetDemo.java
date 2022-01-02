package 第十二次作业;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Set<Student> students = new HashSet<Student>();
		String name, id;
		int age;

		while (true) {
			name = input.next();
			if (name.equalsIgnoreCase("exit")) {
				break;
			}
			id = input.next();
			age = input.nextInt();
			students.add(new Student(name, id, age));
		}
		File file = new File("Student.txt");
		try {
			OutputStreamWriter output = new OutputStreamWriter(new FileOutputStream(file), "utf-8");
			Iterator<Student> it = students.iterator();
			while (it.hasNext()) {
				Student temp = (Student) it.next();
				output.append(temp.getId() + " " + temp.getName() + " " + temp.getAge() + "\n");
			}
			output.flush();
			// op.close();
		} catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
