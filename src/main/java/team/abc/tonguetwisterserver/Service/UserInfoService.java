package team.abc.tonguetwisterserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import team.abc.tonguetwisterserver.dao.UserInfoDao;
import team.abc.tonguetwisterserver.entity.UserInfo;


@Service
public class UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    public void insertUser(UserInfo userInfo){
        userInfoDao.save(userInfo);
    }
}
