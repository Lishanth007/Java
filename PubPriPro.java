class StudentData{
	
	
	private String Name;
	private int id;
	private String course;
	private String location;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	
	
	
}

public class AccessSamples {

	public static void main(String[] args) {

     StudentData sd=new StudentData();
    
    sd.setId(111);
    sd.setName("Pooja");
    sd.setCourse("JFS");
    sd.setLocation("chennai");
    
    System.out.println(sd.getId());
    System.out.println(sd.getName());
    System.out.println(sd.getCourse());
    System.out.println(sd.getLocation());
    
     

	}

}
