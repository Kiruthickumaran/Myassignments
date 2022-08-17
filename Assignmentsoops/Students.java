package Assignmentsoops;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println(id+ "-"+name);
	}
	
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println(email+"-"+phoneNumber);
	}
	
        public static void main(String[] args) {
			Students details=new Students();
			details.getStudentInfo(420);
			details.getStudentInfo(420,"Kiruthic");
			details.getStudentInfo("kiruthic@gmail.com",9987898787l);
			details.getStudentInfo(421);
			details.getStudentInfo(421,"Kumaran");
			details.getStudentInfo("kumaran@gmail.com", 88735378336l);
		}
        

		
			
		}

