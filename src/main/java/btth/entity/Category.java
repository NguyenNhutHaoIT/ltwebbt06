package btth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    // Quan hệ: mỗi Category thuộc về 1 User (manager tạo ra)
    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private Users user;

    @Column(nullable = false, length = 200)
    private String img;   // tên file ảnh hoặc đường dẫn ảnh

    @Column(nullable = false)
    private boolean status;  // true = active, false = inactive

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Category(int id, String name, Users user, String img, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.img = img;
		this.status = status;
	}

	public Category() {
		super();
	}
    
    
}
