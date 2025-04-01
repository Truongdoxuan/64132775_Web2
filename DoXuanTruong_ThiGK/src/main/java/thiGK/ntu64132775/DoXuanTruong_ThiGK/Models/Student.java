package thiGK.ntu64132775.DoXuanTruong_ThiGK.Models;

public class Student {
    private Long id;
    private String name;
    private Long supervisorId;

    public Student(Long id, String name, Long supervisorId) {
        this.id = id;
        this.name = name;
        this.supervisorId = supervisorId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Long getSupervisorId() { return supervisorId; }
    public void setSupervisorId(Long supervisorId) { this.supervisorId = supervisorId; }
}
