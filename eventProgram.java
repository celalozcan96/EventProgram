package EventProgram;

import java.util.Scanner;

//Koşullar :

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
//Ödev
//Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

public class eventProgram {
    public static void main(String[] args) {
        int degree;

        Scanner inp = new Scanner(System.in);
        System.out.print("Havanın Sıcaklığını Derece Cinsinden Giriniz : ");
        degree = inp.nextInt();

        if(degree<5){
            System.out.println("Kayak Yapabilirsiniz.Havanın Sıcaklığı : " + degree + "°C");
        }else if(degree<15){
                System.out.println("Sinemaya Gidebilirsiniz.Havanın Sıcaklığı : " + degree + "°C");
        }else if(degree<25){
                    System.out.println("Piknik Yapmaya Gidebilirsiniz.Havanın Sıcaklığı : " + degree + "°C");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.Havanın Sıcaklığı : " + degree + "°C");
                    }
                }
            }

        

        
    
    

