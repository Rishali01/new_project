package collections;

public class NeedOfCollections {
	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int c = 30; 
		
		int[] numArray = new int[10000];
		
		//limitation of an array
		// - arrays are fixed in size 
		// - arrays can hold only homogeneous
		
		Student[] students = new Student[10];
		students[0] = new Student();
		students[1] = new Student();
		students[2] = new Student();
		//students[3] = new Book();
		
		Object[] objects = new Object[10];
		
		objects[0] = new Student();
		objects[1] = new Student();
		objects[2] = new Book();
		
		// - ready made api support is not available
	}

}

class Book{}

class Student{}
