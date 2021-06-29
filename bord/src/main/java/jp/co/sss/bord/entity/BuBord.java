package jp.co.sss.bord.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//2021/06/29

@Entity
@Table(name="bubord")

public class BuBord {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bord_id_seq_gen")
	@SequenceGenerator(name="bord_id_seq_gen", sequenceName="bord_id_seq", allocationSize=1)
	
	private int bord_id;

	@Column
	private String name;

	@Column
	private String mail;
	
	@Column
	private String title;
	
	@Column
	private String writedate;
	
	@Column
	private String contents;
	
	@Column
	private int color;
	
	
	public int getBord_id() {
		return bord_id;
	}
	public void setBord_id(int bord_id) {
		this.bord_id = bord_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}

}
