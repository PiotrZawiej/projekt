import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Double;

public class Main {
    public static void Szukaj_Nazwy(String Szukana_nazwa, ArrayList<Gwiazda>Baza_danych){

        for(int i = 0; i<= Baza_danych.size()-1; i++ ){
            if(Baza_danych.get(i).getGwiazdozbior().equals(Szukana_nazwa)){
                System.out.println(Baza_danych.get(i).getNazwa()); //Piotrek
            }
        }
    }

    public static void Szukaj_Temperatura(int Od_temperatura, int Do_temperatura, ArrayList<Gwiazda>Baza_danych){

        for(int i = 0; i<= Baza_danych.size()-1; i++ ){
            if(Baza_danych.get(i).getTemperatura() >= Od_temperatura && Baza_danych.get(i).getTemperatura() <= Do_temperatura){
                System.out.println(Baza_danych.get(i).getNazwa()); //Piotrek
            }
        }
    }//Piotrek

    public static void Szukaj_Wilekosc(double Od_Wielkosc, double Do_Wielkosc, ArrayList<Gwiazda>Baza_danych){

        for(int i = 0; i<= Baza_danych.size()-1; i++ ){
            if(Baza_danych.get(i).getObserwowana_Wielkosc_Gwiazdowa() >= Od_Wielkosc && Baza_danych.get(i).getObserwowana_wielkosc_giwazdowa() <= Do_Wielkosc){
                System.out.println(Baza_danych.get(i).getNazwa()); //Piotrek
            }
        }
    }//Piotrek

    public static void Szukaj_Polkola(String Szukana_polkola, ArrayList<Gwiazda>Baza_danych){

        for(int i = 0; i<= Baza_danych.size()-1; i++ ){
            if(Baza_danych.get(i).getPółkula().equals(Szukana_polkola)){
                System.out.println(Baza_danych.get(i).getNazwa());//Piotrek
            }
        }
    }

    public static void Odleglosc_w_parsekach(Double szukana_odleglosc, ArrayList<Gwiazda>Baza_danych){
        System.out.println("Prosze podac nazwe gwiazdozbioru szukanej gwiazdy");
        for(int i = 0; i<= Baza_danych.size()-1; i++ ){

            if(Baza_danych.get(i).getOdleglosc_w_latach_swietlnych() == szukana_odleglosc){
                System.out.println(Baza_danych.get(i).getNazwa());
            }
        }
    }

    public static void Supernowa(ArrayList<Gwiazda>Baza_danych){
        for(int i = 0; i<= Baza_danych.size()-1; i++ ){

            if(Baza_danych.get(i).getMasaS() >= 1.44){
                System.out.println(Baza_danych.get(i).getNazwa());
            }
        }
    }


    public static void main(String[] args) {


        ArrayList<Gwiazda> Baza_danych = new ArrayList<Gwiazda>();

        Gwiazda g1 = new Gwiazda("ABC1234","tak","tak",100,45,23,14,21,43,-2,54,545454,23);
        Gwiazda g2 = new Gwiazda("ABC4567","tak","tak",23,45,23,11,21,43,10,54,545454,23);
        Gwiazda g3 = new Gwiazda("OFS1234","nie","nie",60,45,23,23,45,43,11,54,545454,23);
        Gwiazda g4 = new Gwiazda("OFS5678","nie","nie",60,45,23,23,45,43,11,54,1000000,23);


        Baza_danych.add(g1);
        Baza_danych.add(g2);
        Baza_danych.add(g3);
        Baza_danych.add(g4);
        g1.setNazwa("ABC");

        Scanner scan = new Scanner(System.in);

        String szukana_nazwa;

        int wybor = 0;

        do
        {
            System.out.println("1.Pokaz Gwiazdy\n2.Szukaj Gwiazdy w Gwizdozbiorze\n3.Szukaj Gwiazdy po temperaturze\n5.Wyszukaj po pokloi\n6.Szukaj po parseka");
            wybor = scan.nextInt();
            switch(wybor){

                case 1:
                    for (Object gwiazda: Baza_danych) {
                        System.out.println(gwiazda); //Piotrek
                    }
                    break;
                case 2:
                    Scanner NazwaGwiazdy = new Scanner(System.in);
                    System.out.println("Prosze podac nazwe gwiazdozbioru szukanej gwiazdy");
                    szukana_nazwa = NazwaGwiazdy.nextLine();
                    Szukaj_Nazwy(szukana_nazwa,Baza_danych);
                    break;
                case 3:
                    System.out.println("Prosze podac przedział temperatury");
                    int od_temperatura = scan.nextInt();
                    int do_temperatura = scan.nextInt();
                    Szukaj_Temperatura(od_temperatura, do_temperatura, Baza_danych);
                    break;
                case 4:
                    System.out.println("Prosze podac przedział wilkosci gwiazdowej");
                    double od_wielkosc = scan.nextDouble();
                    double do_wielkosc = scan.nextDouble();
                    Szukaj_Wilekosc(od_wielkosc,do_wielkosc,Baza_danych);
                    break;
                case 5:
                    System.out.println("Prosze podac polkule");
                    Scanner tak = new Scanner(System.in);
                    String polkola = tak.nextLine();
                    Szukaj_Polkola(polkola,Baza_danych);
                    break;
                case 6:
                    System.out.println("Prosze podac szukana odleglosc w parsecah");
                    Double parsek = scan.nextDouble();
                    Odleglosc_w_parsekach(parsek,Baza_danych);
                case 7:
                    System.out.println("Potenjal Supernowje: ");
                    Supernowa(Baza_danych);
            }
        }
        while(wybor < 8);

    }
}