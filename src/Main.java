import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //tablica
        //musi mieć z góry określony rozmiar
        //nie można go pózniej zmienić
        //elementem tablicy mogą być typy proste i typy złożone
        //tablica 6 elementowa z wartościami losowymi z zakresu od 1 do 100
        int [] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementów tablicy
        for (int element:tablicaLosowych) {
            System.out.print(element+", ");
        }

        //kolekcje, elementy typami złożonymi
        //nie muszą mieć zdefiniowanego rozmiaru
        //rozmiar w trakcie może się zmieniać
        //listy - List, zbiory - Set, mapy

        //wstawianie liczb z klawiatury do kolekcji
        List<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        System.out.println("Wstawiono liczby:");
        for (Integer liczbaWpisana:listaLiczbWpisanych) {
            System.out.println(liczbaWpisana);
        }
        //wypisywaie inaczej
        System.out.println("Wstawiono liczby:");
        for (int i = 0; i < listaLiczbWpisanych.size(); i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }

        //losowanie liczb bez powtórzeń
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int) (Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        //wypisywanie
        System.out.println("wylosowane bez powtórzeń");
        System.out.println(listaLosowychBezPowtorzen);


        //losowanie bez powtorzen do zbioru
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while(zbiorLiczbLosowych.size()<6){
            int liczba = (int) (Math.random()*10+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
        //lista
        /*
        elementy mogą się powtarzać
        elementy są indeksowane
         */

        //zbiór (zazwyczaj)
        /*
        elementy są unikatowe
        elementy nie są indeksowane
         */
        }
    }
