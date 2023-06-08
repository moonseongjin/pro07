package sec01.ex01;

import java.sql.Date;

public class MemberVO {

	// 필드(field)
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;
	
	// 생성자 - 객체 생성시 초기화 역할 담당. 
	// 생성자 만드는 법 - 클래스명(){};, 일종의 메서드이다.

	// 기본 생성자
	public MemberVO() {
		System.out.println("Member 생성자 호출됨");
	}
	
	//메소드
	
	// Getter(다른 클래스에서 id값을 가져가게 하는 역할)
	// 가져가게끔 열어두는 것.
	public String getId() {
		return id;
	}
	
	//Setter(다른 클래스에서 id값을 설정하는 역할)
	//값을 변경하기 위해서 씀.
	public void setId(String id) {// 필드 id와 다름.
		this.id = id;
		//(this는 자기 자신, Member 클라스 = id)
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	
}
