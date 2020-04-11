package fun.czrj.springboot_example.dao;

import fun.czrj.springboot_example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/12
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
