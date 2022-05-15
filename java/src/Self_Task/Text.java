package Self_Task;

public class Text {

	private boolean type;
	private String date;
	private String title;
	private String text;
	
	public Text() {
		// TODO Auto-generated constructor stub
	}
	
	public Text(boolean type, String date, String title, String text) {
		this.type = type;
		this.title = title;
		this.date = date;
		this.text = text;
	}
	public boolean getType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return (type?"공지":"일반") + ", " + date + ", 제목:" + title + "]";
	}
	
	
	
}
