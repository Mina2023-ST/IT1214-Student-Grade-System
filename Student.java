class Student {
  private String  StudentId;
  private String StudentName;
  private double  Marks;
  
  Student(int StudentId, String StudentName , double  Marks){
	  this.StudentId=StudentId;
	  this.StudentName=StudentName;
	  this.Marks=Marks;
  }
  public String getStudentId(){
	  return StudentId;
  } 
  public String getStudentName(){
	  return StudentName;
  }
  public double getMarks(){
	  return Marks;
  }
  public void displayStudent() {
        System.out.println("Student ID is : " + studentId);
        System.out.println("Student Name is : " + studentName);
        System.out.println("Student Marks  : " + Marks);
    }
}

