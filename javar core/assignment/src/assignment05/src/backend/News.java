package backend;

public class News implements INews{
	private int Id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;
	
	private int[] rates;
	

	public News(int id, String title, String publishDate, String author, String content) {
		super();
		Id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rates = rates;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		content = content;
	}
	public float getAverageRate() {
		return averageRate;
	}
	
	
	public int[] getRates() {
		return rates;
	}

	public void setRates(int[] rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
			return "News{" +
	                "title='" + title + '\'' +
	                ", publishDate='" + publishDate + '\'' +
	                ", author='" + author + '\'' +
	                ", content='" + content + '\'' +
	                ", averageRate=" + averageRate +
	                '}';
		}	
		
	
    @Override
    public void display() {
        System.out.println(this);
    }

	
	@Override
	public float Calculate() {
		// TODO Auto-generated method stub
        if (rates.length == 0) {
            averageRate = 0;
        } else {
            int sum = 0;
            for (int rate : rates) {
                sum += rate;
            }
            averageRate = (float) sum / rates.length;
        }
        return averageRate;
    }
}
	
	
	
