package zz.sk.bankingdashboard.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import zz.sk.bankingdashboard.Entities.User;

import java.util.Optional;

@Repository
@Component
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    Optional<User> findUserByUsername(String username);
    @Override
    Optional<User> findById(Long aLong);
}
