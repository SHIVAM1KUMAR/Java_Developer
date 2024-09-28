    public class ArrayO {
        public static void main(String[] args) {

            Student s1=new Student();
            s1.rollno=1;
            s1.name="Shivam";
            s1.marks=75;
            Student s2=new Student();
            s2.rollno=1;
            s2.name="Shivam";
            s2.marks=75;
            Student s3=new Student();
            s3.rollno=1;
            s3.name="Shivam";
            s3.marks=75;
            
            Student students[]=new Student[3];
            students[0]=s1;
            students[1]=s2;
            students[2]=s3;
            for(int i=0;i<students.length;i++){
                System.out.println(students[i].name + ":"+students[i].marks +"-"+students[i].rollno);
            }

        }
    }
    class Student{
        int marks;
        String name;
        int rollno;
    }
