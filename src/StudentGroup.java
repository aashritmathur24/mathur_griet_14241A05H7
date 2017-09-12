import java.util.*;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int l;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		l=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return Arrays.copyOf(students,students.length);
		//return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try
		{
			if(students==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			this.students=students;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try
		{
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			return students[index];
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			students[index]=student;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i;
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob1=new ArrayList<Object>(Arrays.asList(students));
			ob1.add(0,student);
			l+=1;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob2=new ArrayList<Object>(Arrays.asList(students));
			ob2.add(student);
			l+=1;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob3=new ArrayList<Object>(Arrays.asList(students));
			ob3.add(index,student);
			l+=1;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		try
		{
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob4=new ArrayList<Object>(Arrays.asList(students));
			ob4.remove(index);
			l-=1;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob4=new ArrayList<Object>(Arrays.asList(students));
			ob4.remove(ob4.indexOf(student));
			l-=1;
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int i;
		try
		{
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob5=new ArrayList<Object>(Arrays.asList(students));
			for(i=index+1;i<ob5.size();i++)
			{
				ob5.remove(i);
				l-=1;
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int i;
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob5=new ArrayList<Object>(Arrays.asList(students));
			for(i=(ob5.indexOf(student)+1);i<ob5.size();i++)
			{
				ob5.remove(i);
				l-=1;
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i;
		try
		{
			if(index<0 || index>=l)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob5=new ArrayList<Object>(Arrays.asList(students));
			for(i=0;i<index;i++)
			{
				ob5.remove(i);
				l-=1;
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i;
		try
		{
			if(student==null)
				throw new IllegalArgumentException("Throw IllegalArgumentException...");
			ArrayList<Object> ob5=new ArrayList<Object>(Arrays.asList(students));
			for(i=0;i<(ob5.indexOf(student));i++)
			{
				ob5.remove(i);
				l-=1;
			}
		}
		catch(IllegalArgumentException iae)
		{
			System.out.println("IllegalArgumentException encountered!");
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		Student temp;
		for(i=0;i<l;i++)
		{
			for(j=0;j<i;j++)
			{
				if(students[j].id>students[j+1].id)
				{
					temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		Student[] stu=new Student();
		int i,j=0;
		double max=students[0].avgMark;
		for(i=1;i<l;i++)
		{
			if(students[i].avgMark>max)
				max=students[i].avgMark;
		}
		for(i=0;i<l;i++)
		{
			if(students[i].avgMark==max)
				stu[j++]=students[i];
		}
		return stu;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
