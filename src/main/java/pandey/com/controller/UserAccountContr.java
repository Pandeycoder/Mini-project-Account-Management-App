package pandey.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pandey.com.entities.UserAccount;
import pandey.com.service.UserAccountServiceImp;

@Controller
public class UserAccountContr {
	
	@Autowired
	private UserAccountServiceImp userAccountService;
	
	@GetMapping("/")
	public String loadForm(Model model)
	{
		model.addAttribute("user",new UserAccount());
		return "index";
	}
	
	@PostMapping("/save-user")
	public String handleSubmitBtn(@ModelAttribute("user") UserAccount user,Model model)
	{
		System.out.println(user);
		//save form data in db
		
		String msg=userAccountService.saveOrUpdateUserAcc(user);
		model.addAttribute("msg","Successfuly created ");
		
		
		return "index";
	}
	
	@GetMapping("/users")
	public String getUsers(Model model)
	{
		List<UserAccount> userList=userAccountService.getAllUserAccount();
		model.addAttribute("users",userList);
		
		return "view-user";
	}
	
	
	
	
	
}
