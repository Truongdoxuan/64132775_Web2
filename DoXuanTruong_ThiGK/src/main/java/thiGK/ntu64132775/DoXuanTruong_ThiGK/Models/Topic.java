package thiGK.ntu64132775.DoXuanTruong_ThiGK.Models;

public class Topic {
    private Long id;
    private String topicName;
    private String topicDescription;
    private Long supervisorld;
    private String topicType;

    public Topic(Long id, String topicName, String topicDescription, Long supervisorld, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorld = supervisorld;
        this.topicType = topicType;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTopicName() { return topicName; }
    public void setTopicName(String topicName) { this.topicName = topicName; }
    
    public String getTopicDescription() { return topicDescription; }
    public void setTopicDescription(String topicDescription) { this.topicDescription = topicDescription; }
    
    public Long getSupervisorld() { return supervisorld; }
    public void setSupervisorld(Long supervisorld) { this.supervisorld = supervisorld; }
    
    public String getTopicType() { return topicType; }
    public void setTopicType(String topicType) { this.topicType = topicType; }
}
	
	
