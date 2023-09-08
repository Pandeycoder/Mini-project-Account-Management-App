package pandey.com.service;

import java.util.List;

import pandey.com.entities.UserAccount;

public interface UserAccountService {
	
   public String saveOrUpdateUserAcc(UserAccount userAcc);
   
   public List<UserAccount> getAllUserAccount();
   
   
   public UserAccount getUserAcc(Integer userId);
   
   public boolean deleteUserAcc(Integer userId);
   
   public boolean updateUserAccStatus(Integer userId,String status);
   
   
   
}
