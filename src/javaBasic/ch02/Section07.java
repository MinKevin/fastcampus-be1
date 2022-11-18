package javaBasic.ch02;

public class Section07 {
    public static class UserInfo{
        public String userId;
        public String userPassWord;
        public String userName;
        public String userAddress;
        public String phoneNumber;

        public UserInfo(){}

        public UserInfo(String userId, String userPassWord, String userName){
            this.userId = userId;
            this.userPassWord = userPassWord;
            this.userName = userName;
        }

        public String showUserInfo(){
            return userId + ' ' + userName;
        }
    }

    public static void main(String[] args) {
        UserInfo user1 = new UserInfo();
        System.out.println(user1.showUserInfo());

        user1.userName = "Lee";
        user1.phoneNumber = "01012345678";
        user1.userAddress = "Address";
        System.out.println(user1.showUserInfo());

        UserInfo user2 = new UserInfo("id", "12345", "kim");
        System.out.println(user2.showUserInfo());

//        null null
//        null Lee
//        id kim
    }
}
