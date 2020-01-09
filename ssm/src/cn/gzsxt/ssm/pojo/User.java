package cn.gzsxt.ssm.pojo;

public class User {
     private String name ;
     private String password ;
     private Integer id ;
     private Integer age;
	public User() {
		super();
	}
	public User(String name, String password, Integer id, Integer age) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", id=" + id + ", age=" + age + "]";
	}
     
}
