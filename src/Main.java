import java.util.Scanner;

public class Main {
    //Nazwa pliku i nazwa klasy muszą być takie same
    //nazwy klas powinny być z wielkiej litery - tak karze obyczaj
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Witamy na lekcjach programowania");
        //typ prosty - tylko wartośc, z małej litery
        /*
        boolean,
        int long  short byte
        float double
        char
         */
        //typ zlozony - obiekt ktory ma walansosci i metody, z wielkiej litery
        int wylosowanaLiczba = (int)(Math.random()*100+1);//rzutowanie

        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();
        //instrukcja warunkowa
        if(wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Gratulacje wygrana");
        }
        else {
            System.out.println("Pudło");
        }
        //wyrażenie warunkowe
        int roznica = wylosowanaLiczba>wpisanaLiczba ?
                wylosowanaLiczba-wpisanaLiczba : wpisanaLiczba - wylosowanaLiczba;
        roznica = roznica/10;//dzielenie całkowite

        switch (roznica){
            case 0:
                System.out.println("Dobra robota");
                break;
            case 1:
                System.out.println("Bardzo blisko");
                break;
            case 2:
                System.out.println("Blisko");
                break;
            default:
                System.out.println("Słabo");
        }
        System.out.println(switch (roznica){
            case 0 -> "Bardzo dobrze";
            case 1->"Blisko";
            case 2->"dość blisko";
            default -> "slabo";
        });
        //zgadujemy 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if(wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje wygrana");
                break;
            }
        }
        //zgadujemy do skutku
       do{
           System.out.println("Podaj liczbę");
           wpisanaLiczba = klawiatura.nextInt();
               if(wylosowanaLiczba>wpisanaLiczba){
                   System.out.println("Wpisano za mało");
               }
               else{
                   System.out.println("Wpisano za dużo");
               }
       }
        while (wylosowanaLiczba != wpisanaLiczba);
        System.out.println("Gratulacje wygrana");
    }
}
