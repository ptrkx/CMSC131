
public class CourseRoster 
{

	//Do NOT add or remove any of these data members
	private String courseName;
	private String instructorName;
	private Student[] roster;

	public CourseRoster()
	{
		//Constructs a CourseRoster
		// DO NOT modify this method
		courseName = "CMSC 131";
		instructorName = "Tom R";
		roster = null;
	}
	public void addStudent(Student newMember)
	{
		//adds a new item always to the end of the list
		// This one is already implemented for you
		//Do NOT modify this method
		if (roster == null){
			roster = new Student[1];
			roster[0] = new Student(newMember);
		}else
		{
			Student[] tempStudentArr = 
					new Student[roster.length+1];
			for (int index = 0; index < roster.length; index++)
			{
				tempStudentArr[index] = roster[index];
			}
			tempStudentArr[roster.length] = new Student(newMember);
			roster = tempStudentArr;
		}
	}

	public String getNames()
	{
		// returns the list of student names concatenated together
		// it will be used in the junit tests to determine if students
		// were added in the correct order
		// This one is already implemented for you
		// Do NOT modify this method
		if (roster == null)
		{
			return null;
		}else
		{
			String list="";
			for (int index = 0; index < roster.length;index++)
			{
				list+=roster[index].getName();
			}
			return list;
		}
	}

	public int getSize()
	{
		//returns the current size of the roster array
		//This one is already implemented for you
		// Do NOT modify this method
		if (roster == null)
		{
			return 0;
		}else{
			return roster.length;
		}
	}
	public int findIndex(String name)
	{
		for(int i = 0; i < roster.length; i++)
		{
			if(roster[i].equals(name))
	         {
	        	 return i ;
	         }
	    }
	
		
		// returns the index for the first occurrence of a Student
		// in the roster whose name matches that value of the parameter
		// or returns -1 if that name is not in the list
		return -1;
	}
	public int getValues()
	{

		int totalVal = 0;
		if(roster.length > 0)
		{
			for(int i = 0; i < roster.length; i++)
			{
				int value = roster[i].getValue();
				totalVal += value;
			}
			return totalVal;
		}else if(roster.length == 0)
			{
				return 0;
			}
			
		//returns the sum of all values of the individual
		// items in the current array based on the 
		// object's getValue method
		// if the list is empty, the value 0 is returned
		
		 return -1;
	}

	public int giveMoreAid()
	{
		int totalVal = 0;
		
		for(int i = 0; i < roster.length; i++)
		{
			roster[i].giveMoreAid();
		}
		
		if(roster.length > 0)
		{
			for(int i = 0; i < roster.length; i++)
			{
				int value = roster[i].getValue();
				totalVal += value;
			}
			return totalVal;
		}else if(roster.length == 0)
			{
			return 0;
			}
		
		
		
		// gives a raise in financial aid to each member of the list
		// each according to its giveMoreAid method
		// returns the sum of the return values
		// of all of the calls to the giveMoreAid methods
		// if the list is empty, the value 0 is returned
		return -1;
	}
	
	
	public boolean removeStudent(String name)
	{
		int index = 999;
		
		for(int i = 0; i < roster.length; i++)
		{
			if(roster[i].equals(name))
	         {
	        	index =  i ;
	         }
	    }
		
		if(index >= 0 && index < roster.length)	
			{
				Student[] copyArray = new Student[roster.length - 1];
				
				for(int i = 0; i < roster.length; i++)
				{
					if(i != index)
					{
						copyArray[i] = roster[i];
					}
				}
				
				return true;
			}
		
		
		
		// Removes the first student whose name matches
		// the value of the parameter and returns true- if a student 
		// with that name appears in the roster.
		// Returns false - if that name does not appear
		// in the current roster and does not remove anything.
		// If a student is removed from the roster,  the roster array
		// must remain the exact size needed to hold the number 
		// of Students currently in the class (the size of the array itself
		// must be one smaller if there is one fewer elements in the list.
		// If the one being removed is the only student in the list, the
		// roster should become null (as it was set in the constructor).
		return false;
	}
}
