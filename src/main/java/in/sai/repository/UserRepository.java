package in.sai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sai.entity.UserDeatils;
@Repository
public interface UserRepository extends JpaRepository<UserDeatils, Integer> {

}
