package team.abc.tonguetwisterserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import team.abc.tonguetwisterserver.entity.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
}
