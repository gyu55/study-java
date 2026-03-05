package streamTask;

import java.util.Objects;

public class Member {
	private Long id;
	private String name;
	private String hobbies;
	private String introduce;
	
	public Member() {;}
	public Member(Long id, String name, String hobbies, String introduce) {
		super();
		this.id = id;
		this.name = name;
		this.hobbies = hobbies;
		this.introduce = introduce;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobbies=" + hobbies + ", introduce=" + introduce + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
