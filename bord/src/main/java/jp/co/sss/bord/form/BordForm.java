package jp.co.sss.bord.form;

public class BordForm {
	
	
	private int bord_id;
	private String name;
	private String mail;
	private String title;
	private String writedate;
	private String contents;
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
