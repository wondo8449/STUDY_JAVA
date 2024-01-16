package hiden;

public class Article {
	
	private int seq;
	private String subject;
	private String content;
	private String writer;
	private int hit;
	private String regData;
	
	public Article(int seq, String subject, String content, String writer, int hit, String regData) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regData = regData;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getRegData() {
		return regData;
	}

	public void setRegData(String regData) {
		this.regData = regData;
	}
	
}
