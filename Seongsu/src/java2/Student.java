package java2;

public class Student {
	
	int studentd1;
	String studentname;
	
	Student(int studentd1, String studentname){
		this.studentd1=studentd1;
		this.studentname=studentname;
		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			// obj는 최상위, Student는 순위낮음 
			Student std = (Student)obj; // 맞춰주려면 obj가 다운해줘야됨
			
		}
	}
	
	
}
