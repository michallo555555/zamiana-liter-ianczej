import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj=new Scanner(System.in);

    System.out.println("Podaj tekst do zamiany");

    String tekst=myObj.nextLine();
    int rozmiar=tekst.length();

    char zamiana[]=new char[rozmiar];

    for(int i=0;i<rozmiar;i++){
      zamiana[i]=tekst.charAt(i);

    }
    int wartosc;
    int licznik = 0;
     for(int i=0;i<rozmiar;i++){
      wartosc=zamiana[i];

       if(wartosc>=97 && wartosc<=122){
         wartosc = wartosc - 32;
         zamiana[i]=(char)wartosc;
          licznik++;
       }

       else{
          if(wartosc>=65 && wartosc<=90){
         wartosc = wartosc + 32;
         zamiana[i]=(char)wartosc;
         licznik++;
       }
         else{
           if(wartosc==32){
             wartosc = 95;
             zamiana[i]=(char)wartosc;
             licznik++;
           }
           else;
         }
       }
       System.out.print(zamiana[i]);
    }
    System.out.println();System.out.println();
    System.out.println("Liczba zamian: "+licznik);
  }
}