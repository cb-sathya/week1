



import java.util.Scanner;

class Student{
	int studentId;
	String studentName;
	boolean gender;
	Subject subjects;
	Scanner scanner=new Scanner(System.in);

	int getStudentId(){
		return studentId;
	}
	
	String getStudentName(){
		return studentName;
	}
	
	String getGender(){
		if(gender==true){
			return "Male";
		}
		else{
			return "Female";
		}
	}

	Subject getSubject(){
		return subjects;
	}

	void setStudentId(){
		studentId=scanner.nextInt();
	}

	void setStudentName(){
		studentName=scanner.next();
	}

	void setGender(){
		if(scanner.next().equalsIgnoreCase("M")){
			gender=true;
		}
		else{
			gender=false;
		}
	}

	void setSubject(Subject subjects){

		this.subjects=subjects;
	}
}

class Subject{
	Scanner scanner=new Scanner(System.in);
	String subject1;
	float marks1;
	String subject2;
	float marks2;
	String subject3;
	float marks3;

	String getSubject1(){
		return subject1;
	}
	
	String getSubject2(){
		return subject2;
	}
	
	String getSubject3(){
		return subject3;
	}

	float getMarks1(){
		return marks1;
	}

	float getMarks2(){
		return marks2;
	}

	float getMarks3(){
		return marks3;
	}

	void setSubject1(){
		subject1=scanner.next();
	}

	void setSubject2(){
		subject2=scanner.next();
	}

	void setSubject3(){
		subject3=scanner.next();
	}

	void setMarks1(){	
		marks1=scanner.nextFloat();
	}

	void setMarks2(){
		marks2=scanner.nextFloat();
	}
	
	void setMarks3(){
		marks3=scanner.nextFloat();
	}
}


class ResultGenerator{
	static void generateResult(Student student){
		System.out.println("--------REPORT CARD--------");
		System.out.println("STUDENT ID: \t"+student.getStudentId());
		System.out.println("STUDENT NAME: \t"+student.getStudentName()+"\nGENDER: \t"+student.getGender());
		System.out.println("SUBJECT 1: \t"+student.getSubject().getSubject1()+"\t\tMARK:  "+student.getSubject().getMarks1());
		System.out.println("SUBJECT 2: \t"+student.getSubject().getSubject2()+"\t\tMARK:  "+student.getSubject().getMarks2());
		System.out.println("SUBJECT 3: \t"+student.getSubject().getSubject3()+"\t\tMARK:  "+student.getSubject().getMarks3());
		System.out.println("AVERAGE \t"+(student.getSubject().getMarks1()+student.getSubject().getMarks2()+student.getSubject().getMarks3())/3);
		System.out.println("TOTAL \t"+(student.getSubject().getMarks1()+student.getSubject().getMarks2()+student.getSubject().getMarks3()));
	}
}

class StudentDemo{
	void storeStudentData(Student student){

		System.out.println("Enter the student ID");
		student.setStudentId();
		System.out.println("Enter the student name");
		student.setStudentName();
		System.out.println("Enter the gender of the student (M/F)");
		student.setGender();

		Subject subject=new Subject();
		System.out.println("Enter the names of the subjects");
		subject.setSubject1();
		subject.setSubject2();
		subject.setSubject3();

		System.out.println("Enter the marks of each subject in the order the names were entered");
		subject.setMarks1();
		subject.setMarks2();
		subject.setMarks3();

		student.setSubject(subject);
	}

	public static void main(String args[]){
		Student student=new Student();
		StudentDemo studentDemo=new StudentDemo();
		studentDemo.storeStudentData(student);
		ResultGenerator.generateResult(student);
	}
}
