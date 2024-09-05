public class Main {
    //Nazwa pliku i nazwa klasy muszą być takie same
    //nazwy klas powinny być z wielkiej litery - tak karze obyczaj
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Witamy na lekcjach programowania");
        //typ prosty - tylko wartośc, z małej litery
        //typ zlozony - obiekt ktory ma walansosci i metody, z wielkiej litery
        int wylosowanaLiczba = (int)(Math.random()*10+1);//rzutowanie

        System.out.println(wylosowanaLiczba);
    }
}
