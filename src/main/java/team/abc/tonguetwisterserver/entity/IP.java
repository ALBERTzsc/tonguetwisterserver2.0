package team.abc.tonguetwisterserver.entity;

import javax.persistence.Id;

public class IP {

    @Id
    private Long id;
    private String userIp;
    private long time;
    private String location;

    public IP(String userIp , long time){
        this.userIp = userIp;
        this.time = time;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }
}
