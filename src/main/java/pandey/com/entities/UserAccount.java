package pandey.com.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserAccount {
	@Id
	@GeneratedValue
	private Integer userId;
	
	private String userName;
	
	private String userEmail;
	
	private Long userPhno;
	
	private String usergender;
	
	private LocalDate userDob;
	
	private Integer userSsn;
	
	private String activeSw="Y";
	
	@CreationTimestamp
	private LocalDate createDate;
    
	@UpdateTimestamp
	private LocalDate updateDate;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserPhno() {
		return userPhno;
	}

	public void setUserPhno(Long userPhno) {
		this.userPhno = userPhno;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public LocalDate getUserDob() {
		return userDob;
	}

	public void setUserDob(LocalDate userDob) {
		this.userDob = userDob;
	}

	public Integer getUserSsn() {
		return userSsn;
	}

	public void setUserSsn(Integer userSsn) {
		this.userSsn = userSsn;
	}

	public String getActiveSw() {
		return activeSw;
	}

	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "UserAccount [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPhno="
				+ userPhno + ", usergender=" + usergender + ", userDob=" + userDob + ", userSsn=" + userSsn
				+ ", activeSw=" + activeSw + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", getUserId()=" + getUserId() + ", getUserName()=" + getUserName() + ", getUserEmail()="
				+ getUserEmail() + ", getUserPhno()=" + getUserPhno() + ", getUsergender()=" + getUsergender()
				+ ", getUserDob()=" + getUserDob() + ", getUserSsn()=" + getUserSsn() + ", getActiveSw()="
				+ getActiveSw() + ", getCreateDate()=" + getCreateDate() + ", getUpdateDate()=" + getUpdateDate() + "]";
	}
	
	

}
