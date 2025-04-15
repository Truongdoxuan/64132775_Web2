package thiGK.ntu64132775.DoXuanTruong_RemakeThiGK.Models;

public class Topic {
    private String id;
    private String topicName;
    private String topicDescription;
    private String supervisorld;
    private String topicType;
	
    public Topic(String id, String topicName, String topicDescription, String supervisorld, String topicType) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.supervisorld = supervisorld;
		this.topicType = topicType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public String getSupervisorld() {
		return supervisorld;
	}

	public void setSupervisorld(String supervisorld) {
		this.supervisorld = supervisorld;
	}

	public String getTopicType() {
		return topicType;
	}

	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}
}
