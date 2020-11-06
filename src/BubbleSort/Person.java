package BubbleSort;

public class Person {
	public static enum ROLE {unknown, teacher, admin, student, counselor};
  public static enum GRADE {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};

	private static int MasterID = 1000;

	//person values
	private int ID;				  //ID - unique ID
  String fname;		//first name
  String lname;		//last name
  protected ROLE role;
 
	/*
	 * Default Person constructor from Static values
	 */
	public Person() {	
    this.role = ROLE.unknown;	
		this.init();
	}

	//Person constructed according to Control Panel settings
	public Person(String fname, String lname, ROLE role) {
		this.init();
    this.roleSetter(fname, lname, role);
	}
		
	protected void init() {
		this.ID = ++MasterID;
	}
	
	// infected setter and update to infected counter
	protected void roleSetter(String fname, String lname, ROLE role) {
    this.fname = fname;
    this.lname = lname;
    this.role = role;
	}

	
	/*
	 * Key properties of person
   */
	public String toString() {
		return ( "\tName : " + this.fname + "   " + this.lname + "\tRole: " + this.role); 
	}
  
	
	/*
	 * Main Tester method
	 */
	public static void main (String[] args) {		
    //Test with empty constructor and setter
		Person p1 = new Person();
    p1.roleSetter("John", "Mortensen",ROLE.teacher);
    System.out.println(p1);

    //Test with parameters in constructor
    Person p2 = new Person("Bryan", "Schultz", ROLE.admin);
    System.out.println(p2);

	}


}