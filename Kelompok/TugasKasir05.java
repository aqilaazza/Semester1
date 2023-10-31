import java.util.Scanner;
public class TugasKasir05 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String user1 = "Renald", user2 = "Belqis", user3 = "Aqila", username, password,
    userPw1 = "Renald123", userPw2 = "Belqis123", userPw3 = "Aqila123";
    System.out.println("Masukkan username : ");
    username = input.next();
    System.out.println("Masukkan password : ");
    password = input.next();
    if (username.equals(user1) && password.equals(userPw2)) {
        System.out.println("Selamat datang Renald");
    } else if (username.equals(user2) && password.equals(userPw2)) {
        System.out.println("Selamat datang Belqis");
    } else if (username.equals(user3) && password.equals(userPw3)){
        System.out.println("Selamat datang Aqila");
    } else {
        System.out.println("Gagal masuk");
    }
    }
}