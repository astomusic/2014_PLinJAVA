package hw4;

public class Student {
	private String name;
	private String id;
	private String major;
	private int math;
	private int eng;
	private String mathScore;
	private String engScore;
	
	public Student() {
		
	}
			
	public Student(String name, String id, String major, int math, int eng) {
		super();
		this.name = name;
		this.id = id;
		this.major = major;
		this.math = math;
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getMathScore() {
		return mathScore;
	}

	public void setMathScore(String mathScore) {
		this.mathScore = mathScore;
	}

	public String getEngScore() {
		return engScore;
	}

	public void setEngScore(String engScore) {
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", major=" + major + ", math=" + math + ", eng=" + eng + ", mathScore=" + mathScore
				+ ", engScore=" + engScore + "]";
	}
	
}
