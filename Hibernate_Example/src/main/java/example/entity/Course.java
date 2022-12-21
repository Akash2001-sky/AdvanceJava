package example.entity;

public class Course {
	
	private String courseID;
	private String name;
	private int duration;
	private int fees;
	
	
	public Course(String courseID, String name, int duration, int fees) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}


	/**
	 * @return the courseID
	 */
	public String getCourseID() {
		return courseID;
	}


	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}


	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}


	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", name=" + name + ", duration=" + duration + ", fees=" + fees + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
