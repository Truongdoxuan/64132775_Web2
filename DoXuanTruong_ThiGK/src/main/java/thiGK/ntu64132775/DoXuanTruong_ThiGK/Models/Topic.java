package thiGK.ntu64132775.DoXuanTruong_ThiGK.Models;

public class Topic {
	private String id;
	private String topicName;
	private String topicDescription;
	private String supervisorID;
	private String topicType;
	
	public Topic(String id, String topicName, String topicDescription, String supervisorID, String topicType) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.supervisorID = supervisorID;
		this.topicType = topicType;
	}
}
