package pandey.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import jakarta.transaction.Transactional;
import pandey.com.entities.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount,Integer>{
	
	@Modifying
	@Transactional
	@Query("update UserAccount set activeSw=:status where userId=:userId")
	public void updateUserAccountStatus(Integer userId,String status);
	
	

}
