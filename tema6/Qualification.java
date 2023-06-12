package tema6;

public class Qualification extends Teacher {
	
	public Qualification(String Course, int ExperienceYears, String Schedule) {
		setCourse(Course);
		setExperienceYears(ExperienceYears);
		setSchedule(Schedule);
	}
	
	public void verify() {
	    if (getCourse().equals("Java") && getExperienceYears() > 3 && getSchedule().equals("Afternoon")) {
            System.out.println("You qualify to teach at this school!");
        }
        else
            System.out.println("You do not qualify!");
    }

}
