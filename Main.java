import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner nowy = new Scanner(System.in);
    System.out.println("Wpisz słowo: ");
    String coś = nowy.next();
    int kod;
    char znak;
    int samogłoski = 0;
    int spółgłoski = 0;
    //System.out.println(coś);
    int długość = coś.length();
    //System.out.println(długość);
    char tablica[] = new char[długość];
    tablica = coś.toCharArray();
    //for(int i = 0; i<długość;i++)
      //{
        //System.out.println(tablica[i]);
      //}
     for(int j =0; j<długość;  j++)
       {
        znak = tablica[j];
        kod = (int) znak;
        if(kod == 65  || kod == 97 || kod == 69 || kod == 101 || kod == 89 || kod == 121 || kod == 73 || kod == 105 || kod == 79 || kod == 111 || kod == 85 || kod == 117 || kod == 261 || kod == 260 || kod == 243 || kod == 280 || kod == 281)
        {
          samogłoski++;
        }
       else
        {
          spółgłoski++;
        }
       }
    System.out.println("Liczba samogłosek: " + samogłoski + ", liczba społgłosek: " + spółgłoski);
      }
  }