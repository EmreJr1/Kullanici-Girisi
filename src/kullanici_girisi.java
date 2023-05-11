import java.util.Scanner;

public class kullanici_girisi {
    public static void main(String[] args) {
        String username,password,newPassword,choose;

        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = input.nextLine();


        if ((username.equals("patika") && password.equals("java123"))){
            System.out.println("Giriş yaptınız");
        }else{
            System.out.println("Kullanıcı Adı veya Şifre Hatalıdır");
            System.out.println("Şifrenizi değiştirmek ister misiniz = [evet/hayır]");
            choose = input.nextLine();
            switch (choose){
                case "evet" :
                    System.out.print("Yeni şifrenizi giriniz :");
                    newPassword=input.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Yeni şifreniz önceki şifrelerinizle aynı olamaz!");
                    }else {
                        System.out.println("Şifreniz Başarıyla Değiştirildi");
                    }
                    break;
                case "hayır" :
                    System.out.println("Hesabınıza tekrar giriş yapmayı deneyin");
            }
        }
    }
}
