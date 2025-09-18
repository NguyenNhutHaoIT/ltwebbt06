package btth.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column(nullable = false, unique = true)
	String username;

	@Column(nullable = false)
	String password;

	@Column(nullable = false)
	int role; // 0 - user,1 - manager, 2 - admin
	@Column(nullable = false)
	String fullname;

	@Column(nullable = false, unique = true)
	String email;

	@Column(nullable = false, unique = true)
	String phone;

	@Column(nullable = false)
	boolean status;
	
	@OneToMany(mappedBy = "user")
	private List<Category> categories;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Users(int id, String username, String password, int role, String fullname, String email, String phone,
			boolean status, List<Category> categories) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.status = status;
		this.categories = categories;
	}

	public Users() {
	}
	
}
