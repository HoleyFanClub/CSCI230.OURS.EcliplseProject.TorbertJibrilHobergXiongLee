/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author ttorbert001
 *
 */
public class SimplePrint {

	private String pname;
	private int pAge;
	
	public SimplePrint(String pname, int pAge) {
		super();
		this.pname = pname;
		this.pAge = pAge;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public itn getpAge() {
		return pAge;
	}

	public void setpAge(itn pAge) {
		this.pAge = pAge;
	}

	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<args.length; i++)
		{
			System.out.println("args[" + i + "] = " + args[i]);
		}
       System.out.println("Tommy Torbert, Abdi Jibril, Noah Hoberg, Ben Xiong, Moua Lee");
	}
}
