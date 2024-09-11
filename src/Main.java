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
    }
}