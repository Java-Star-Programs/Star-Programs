import java.util.Scanner;
import java.security.*;


class Sample
{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFaname() {
		return faname;
	}
	public void setFaname(String faname) {
		this.faname = faname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String fname;
	public String lname;
	public String faname;
	public String mname;
	public String gender;
	public int age;
	public String place;
	public int id;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}

class Generate
{
	void school(Sample s)
	{
        System.out.println("   ");
        System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Student  First Name                                    "+s.getFname());
		System.out.println("");
		System.out.println("Student  Last Name                                     "+s.getLname());
		System.out.println("");
		System.out.println("Father Name                                            "+s.getFaname());
		System.out.println(" ");
		System.out.println("Mother Name                                            "+s.getMname());
		System.out.println(" ");
		System.out.println("Gender                                                 "+s.getGender());
		System.out.println(" ");
		System.out.println("Student  Age                                           "+s.getAge());
		System.out.println("");
		System.out.println("Place                                                  "+s.getPlace());
		System.out.println(" ");
		System.out.println("Enrollment No                                          "+s.getId());
	}
}

class Frame

{
	double sum=0;
	static
	{
	
		System.out.println("");
		System.out.println("");
		System.out.println("                       STUDENT MARKS SHEET INTERMEDIATE");
		
		System.out.println("________________________________________________________________________________________________");
		System.out.println("");
		System.out.println("");
	}
	
	public static <myroom> void marks()
	{
	
    try
    {
	Scanner sa=new Scanner(System.in);
	System.out.println(" ");
	System.out.println(" ");
	System.out.println(" ");
	System.out.print("Total Subjects:   ");
	int n=sa.nextInt();
	System.out.println(" ");
	System.out.println(" ");
	double marks[]=new double[n];
	
	String []sub= {"ENGLISH","SANSKRIT","MATHEMATICS","CHEMISTRY","PHYSICS","TELUGU","SOCIAL"};
	
	for(int i=0;i<n;i++)
	{
		marks[i]=sa.nextInt();
		
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("                               Subject Marks");
	System.out.println(" ");
	System.out.println(" ");
	for(int i=0;i<7;i++)
	{
		
		System.out.println(                            sub[i]+ "  Marks " +marks[i]);
		System.out.println(" ");
		
		
	}
	
	double average=0;
	for(int i=0;i<marks.length;i++)
	{
		average=average+marks[i]/n;
	}
	
	System.out.println(" ");
	System.out.println("Percentage "+average);
	System.out.println(" ");
	
	if(average>=85)
	{
		System.out.println("S Grade");
	}
	else if(average<85&& average>=75)
    {
		System.out.println("A Grade");
    }
	
	else if(average<75 && average>=65)

	{
		System.out.println("B Grade");
	}
	
	else if(average<65 && average>=55)
	{
		System.out.println("C Grade");
	}
	
	else if(average<55 && average>=40)
	{
		System.out.println("D Grade");
	}
	else
	{
		System.out.println("Fail");
	}
	System.out.println(" ");
	System.out.println("Successfully Completed");
	System.out.println("   ");
	System.out.println("All the best for future ");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("  ");
		
	}
		
	
	}
}





public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Frame f=new Frame();
		

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter First Name                                        ");
		String fname=sc.nextLine();
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter Last Name                                         ");
		String lname=sc.nextLine();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Enter Father Name                                       ");
		String faname=sc.nextLine();
		
		System.out.println(" ");
		System.out.println("");
		System.out.println(" ");
		System.out.print("Enter Mother Name                                       ");
		String mname=sc.nextLine();
		System.out.println(" ");
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter Gender                                             ");
		String gender=sc.next();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Enter the Age                                            ");
		int age=sc.nextInt();
		
        System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter the Place                                          ");
		String place=sc.next();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("Enter Enrollment No                                      ");
		int id=sc.nextInt();
		
		Sample s=new Sample();
		s.setFname(fname);
		s.setLname(lname);
		s.setFaname(faname);
		s.setMname(mname);
		s.setGender(gender);
		s.setAge(age);
		s.setPlace(place);
		s.setId(id);
		
		
		Generate g=new Generate();
		g.school(s);
		
		f.marks();
		
		
		
		
		
		
	}

}
