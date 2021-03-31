package Exercise04;

	/**
	 * Class of studentInfo with fName, lName, sNumber, gpa
	 *Assessment: CST8116 Exercise 4
	 *Student Name: Ming Wang
	 *Lab Professor Name: Stanley Pieda
	 *Lab Section Number: 311
	 *Due Date: Friday, Jan. 22
	 */

	public class StudentInfo {

		private String fName;	//Frist name
		private String lName;	//Last name
		private String sNumber;	//Student number
		private double gpa;		//GPA

		public StudentInfo() { //default constructor with no parameter
			
		}

		/*
		 * overloaded StudentInfo constructor with ,fName, lName, sNumber, gpa arguments
		 */
		public StudentInfo(String fName, String lName, String sNumber, double gpa) {
		
			this.fName = fName;		
			this.lName = lName;		
			this.sNumber = sNumber;	
			this.gpa = gpa;			
		}

		public String getfName() {	//accessor for fName,
			return fName;
		}

		public void setfName(String fName) { //mutator for fName
			this.fName = fName;
		}

		public String getlName() {		//accessor for lName
			return lName;
		}

		public void setlName(String lName) {	//mutator for lName
			this.lName = lName;
		}

		public String getsNumber() {		//accessor for sNumber
			return sNumber;
		}

		public void setsNumber(String sNumber) {	//mutator for sNumber
			this.sNumber = sNumber;
		}

		public double getGpa() {		//accessor for gpa
			return gpa;
		}

		public void setGpa(double gpa) {	//mutator for gpa
			this.gpa = gpa;
		}

		
	}


