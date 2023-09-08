package pandey.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pandey.com.entities.UserAccount;
import pandey.com.repo.UserAccountRepo;

@Service
public class UserAccountServiceImp implements UserAccountService {
    
	@Autowired
	private UserAccountRepo userAccountRepo;
	
	
	
	@Override
	public String saveOrUpdateUserAcc(UserAccount userAcc) {
		
		Integer userId=userAcc.getUserId() ;
		
		//UPSERT (INSERT OR UPDATE)
		userAccountRepo.save(userAcc);
		
		if(userAcc==null)
		{
			return "User Record Saved";
			
		}else
		{
			return "User Record Updated";
		}
	
	}

	@Override
	public List<UserAccount> getAllUserAccount() {
	
		//List<UserAccount> accounts=userAccountRepo.findAll();
		//return accounts
		
		return userAccountRepo.findAll();
	}

	@Override
	public UserAccount getUserAcc(Integer userId) {
		
		Optional<UserAccount> findById= userAccountRepo.findById(userId);
		
		if(findById.isPresent())
		{
			return findById.get();	
		}
		return null;
	}

	@Override
	public boolean deleteUserAcc(Integer userId) {
		
		
		boolean existId=userAccountRepo.existsById(userId);
		
		if(existId)
		{
			userAccountRepo.deleteById(userId);
			return true;
		}
		
		/*try
		{
			userAccountRepo.deleteById(userId);
			
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}*/
		return false;

	}

	@Override
	public boolean updateUserAccStatus(Integer userId, String status) {
		
		try {
			userAccountRepo.updateUserAccountStatus(userId, status);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
