package team.abc.tonguetwisterserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.abc.tonguetwisterserver.dao.IPDao;
import team.abc.tonguetwisterserver.dao.UserInfoDao;
import team.abc.tonguetwisterserver.entity.UserInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DAOTest {

    @Autowired
    private UserInfoDao userInfoDao;

    @Autowired
    private IPDao ipDao;

    @Test
    public void testInsertUserInfo(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("test");
        userInfo.setUserGender(1);
        userInfo.setChallengePassNum(200);
        userInfoDao.save(userInfo);
    }
}
