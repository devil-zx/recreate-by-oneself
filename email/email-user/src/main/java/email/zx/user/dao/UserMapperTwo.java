package email.zx.user.dao;

import email.zx.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface UserMapperTwo extends JpaRepository<User,Integer> {

    /*@Query("select username from User ")
    List<User> findUser();*/
}
