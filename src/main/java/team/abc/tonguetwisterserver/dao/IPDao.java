package team.abc.tonguetwisterserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.abc.tonguetwisterserver.entity.IP;

@Repository
public interface IPDao extends JpaRepository<IP, Long> {

}
