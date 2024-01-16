package vo;

public class UserVO {
	private int userNumber;
	private String userName;
	private String userPassword;
	private String userPhoneNumber;
	private String userNickname;
	private String userEmail;
	private String userAddress;
	private String userBirthday;
	private String userGender;
	private String userRecommenderID;
	private String userJob;
	private String userId;
	
	
	
	public UserVO() {;}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserRecommenderID() {
		return userRecommenderID;
	}

	public void setUserRecommenderID(String userRecommenderID) {
		this.userRecommenderID = userRecommenderID;
	}

	public String getUserJob() {
		return userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		String str = userNumber
				+ ", " +  userName
				+ ", " +  userPassword
				+ ", " +  userPhoneNumber
				+ ", " +  userNickname
				+ ", " +  userEmail
				+ ", " +  userAddress
				+ ", " +  userBirthday
				+ ", " +  userGender
				+ ", " +  userRecommenderID
				+ ", " +  userJob
				+ ", " + userId;
		return str;
	}
}
