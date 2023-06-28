package entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;
    
    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin student.");

        System.out.println("Nhập vào name:");
        this.name = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào hometown:");
        this.hometown = scanner.nextLine();
    }
    
    public void setScore(double score) {
        this.score = score;
    }
    
    public void plusScore(double value) {
        this.score += value;
    }
    
    public void showInfo() {
        String rank;
        if (score < 4.0) {
            rank = "Yếu";
        } else if (score < 6.0) {
            rank = "Trung bình";
        } else if (score < 8.0) {
            rank = "Khá";
        } else {
            rank = "Giỏi";
        }
        System.out.println(name + rank);
    }

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

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public double getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + "]";
	}


	
    
    
}
