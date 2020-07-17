package buoi8.usesrmanagement;

import java.rmi.NoSuchObjectException;

public class UserManagement {
    private int totalUser;
    private User[] users;

    public UserManagement(User[] users) {
        this.users = users;
        this.totalUser = this.users.length;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User findUserByUsername(User userNames){
        User findUserbyUsername = null;
        for (int i = 0; i < totalUser; i++) {
            if (users[i].getUsername().equals(userNames)) {
                findUserbyUsername = users[i];
            }else {
                findUserbyUsername = null;
            }
        }
        return findUserbyUsername;
    }

    public User login(String userNames, String passWords){
        User userAccount = null;
            for (int i = 0; i < totalUser; i++) {
                try {
                    if(users[i].getUsername().equals(userNames)){
                        if (users[i].getPassword().equals(passWords)){
                            userAccount = users[i];
                        }else {
                            System.out.println("Đăng nhập thất bại, sai mật khẩu.");
                        }
                    }else {
                        System.out.println("Đăng nhập thất bại, sai tên đăng nhập.");
                    }
                }catch (NullPointerException e){
                    System.out.println("error, User khong ton tai.");
                }
            }
            return userAccount ;
        }

}
