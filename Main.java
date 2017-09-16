import java.util.*;
public class Main {

	public static void main(String[] args) {

		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
		StudentGroup sg = new StudentGroup(2);
		date db =new Date(1996,10,11);
		Student st = new Student(148,"sandy",db,68);
		sg.addFirst(st);
		sg.addLast(st);
		System.out.println(sg.getStudent(0).getId());
	}
