package heibernatepro;
import javax.persistence.*;
//14/11/2022,14:36 right now this is my time
@Entity

public class Student {
//	@Id
//	@GeneratedValue
//	int id;
//	String namee;
//	int age;
//	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
