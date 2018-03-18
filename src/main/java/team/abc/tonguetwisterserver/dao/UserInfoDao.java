package team.abc.tonguetwisterserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.abc.tonguetwisterserver.entity.UserInfo;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, Long> {

}
