package thiGK.ntu64132775.DoXuanTruong_ThiGK.Models;

public class Topic {
	private int id;
	private String topicName;
	private String topicDescription;
	private int supervisorID;
	private String topicType;
	public Topic(int id, String topicName, String topicDescription, int supervisorID, String topicType) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.supervisorID = supervisorID;
		this.topicType = topicType;
	}
}
	
	
