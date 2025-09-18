package btth.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Video")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 255)
    private String title;   // tên video

    @Column(nullable = false, length = 500)
    private String url;     // link video (YouTube hoặc file)

    private boolean status = true; // true = active, false = inactive

    // Liên kết với User (ai thêm video)
    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private Users user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Video() {
		super();
	}
    
    

}
