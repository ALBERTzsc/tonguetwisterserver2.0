package team.abc.tonguetwisterserver.entity;


import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "t_user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private int userGender;
    private int challengePassNum;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public int getChallengePassNum() {
        return challengePassNum;
    }

    public void setChallengePassNum(int challengePassNum) {
        this.challengePassNum = challengePassNum;
    }

    @Override
    public String toString() {
        return "UserInfo [userId=" + userId + ", userName=" + userName
                + ", userGender=" + userGender + ", challengePassNum="
                + challengePassNum + "]";
    }
}
