package org.tnsif.springdi.Springcore_Annotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class MusicTeacher {

	public void setName(String string) {
		// TODO Auto-generated method stub
		  // Injecting values using @Value annotation
	    @Value("Rahul")
	    private String name;

	    @Value("10")
	    private int yearsOfExperience;

	    @Value("M. Phil. Vocal and Instrumental") String qualification;

	    @vaalue("Punjab University") String university;

	    // Default constructor
	    public MusicTeacher() {
	    }

	    private String university;
		private int yearsOfExperience;

		// Getter and Setter methods for dependency injection via setter method
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getYearsOfExperience() {
	        return yearsOfExperience;
	    }

	    public void setYearsOfExperience(int yearsOfExperience) {
	        this.yearsOfExperience = yearsOfExperience;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public void setQualification(String qualification) {
	        this.university = qualification;
	    }

	    public String getUniversity() {
	        return university;
	    }

	    public void setUniversity(String university) {
	        this.university = university;
	    }

	    // Implementing the method from the Teacher interface
	    public String getTeacherInfo() {
	        return "Music Teacher (Name: " + name + ", Experience in years: " + yearsOfExperience 
	                + ", Qualification: " + qualification + ", University: " + university + ")";
	    }
	}

}
