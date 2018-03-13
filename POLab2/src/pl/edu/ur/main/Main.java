package pl.edu.ur.main;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        // Zadanie 3
//        double[] x = new double[10];
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Podaj dane do " + (i + 1) + " komórki tablicy: ");
//            Scanner odczyt = new Scanner(System.in);
//            x[i] = odczyt.nextDouble();
//        }
//        int zmienna;
//        do {
//            System.out.println("podaj wartosc zadania od 1 do 4, 0 przerywa petle \n"
//                    + "1 - Wyświetlanie tablicy od pierwszego do ostatniego indeksu.\n"
//                    + "2 - Wyświetlanie tablicy od ostatniego do pierwszego indeksu.\n"
//                    + "3 - Wyświetlanie elementów o nieparzystych indeksach.\n"
//                    + "4 - Wyświetlanie elementów o parzystych indeksach.");
//            zmienna = odczyt.nextInt();
//
//            if (zmienna == 1) {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Wartość elementu [" + i + "] = " + x[i]);
//
//                }
//            } else if (zmienna == 2) {
//                for (int i = 9; i >= 0; i--) {
//                    System.out.println("T[" + i + "] = " + x[i]);
//
//                }
//            }
//            else if(zmienna == 3){
//                for(int i=0; i<10; i++)
//                {
//                    if(i%2==1) System.out.println("T[" + i + "] = " + x[i]);
//                }
//            }
//            else if(zmienna == 4){
//                 for(int i=0; i<10; i++)
//                {
//                    if(i%2==0) System.out.println("T[" + i + "] = " + x[i]);
//                }
//                 
//                 
//            } 
//            else if(zmienna==0) System.out.println("Program zakończy działanie.");
//            else System.out.println("Wybrałeś złą funkcję!");
//                
//
//        } while (zmienna != 0);
            // Zadania 4
//            Scanner odczyt = new Scanner(System.in);
// int y;
//        double suma=0;
//        double iloczyn = 1;
//        double srednia;
//        double[] tab1;
//        tab1 = new double[10];      
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
//            tab1[i] = odczyt.nextDouble();
//        }
//        
//        double min=tab1[0];
//        double max=tab1[0];
//        
//            do{
//                System.out.println("Wybierz opcję programu: \n"
//                        + "1 - oblicz sumę elementów tablicy,\n" 
//                        + "2 - oblicz iloczyn elementów tablicy,\n"
//                        + "3 - wyznacz wartość średnią,\n"
//                        + "4 - wyznacz wartość minimalną,\n"
//                        + "5 - wyznacz wartość maksymalną\n"
//                        + "0 - Zakończ działanie programu.");
//                y = odczyt.nextInt();
//                
//                switch(y)
//                {
//                    case 0 : System.out.println("Program zakończy działane."); break;
//                    case 1 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            suma+=tab1[i];
//                        }
//                        System.out.println("Suma wszystkich elementów tablicy wynosi: "+suma);
//                        break;
//                    case 2 : 
//                       for(int i=0; i<10; i++)
//                        {
//                            iloczyn*=tab1[i];
//                        }
//                        System.out.println("Iloczyn wszystkich elementów tablicy wynosi: "+iloczyn);
//                        break;
//                    case 3 :
//                        for(int i=0; i<10; i++)
//                        {
//                            suma+=tab1[i];
//                        }
//                        srednia = suma/10;
//                        System.out.println("Srednia wartość wszystkich elementów tablicy wynosi: "+srednia);
//                        break;
//                        
//                    case 4 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            if(tab1[i]<min)
//                                min=tab1[i];
//                        }
//                        System.out.println("Najmniejszy element tablicy to: "+min);
//                        break;
//                    case 5 : 
//                        for(int i=0; i<10; i++)
//                        {
//                            if(tab1[i]>max)
//                                max=tab1[i];
//                        }
//                        System.out.println("Największy element tablicy to: "+max);
//                        break;
//                        
//                    default : System.out.println("Wybrałeś złą funkcję!"); break;                }
//                
//            }while(y!=0);
//        
            // Zadanie 6
//            Scanner odczyt = new Scanner(System.in);
//    int z;
//            while(true)	
//            { 
//                System.out.println("Wprowadź liczbę całkowitą: (Żeby zakończyć działanie wprowadź liczbę mniejszą od 0)");
//                z = odczyt.nextInt();
//                if(z<0) break; 
//            }
            // Zadanie 7
//            Scanner odczyt = new Scanner(System.in);
//        int a;
//        System.out.println("Ile liczb chcesz wprowadzić do tablicy?");
//        a = odczyt.nextInt();
//        int[] tab2;
//        tab2 = new int[a];
//        int b;
//        boolean c = true;
//
//        for (int i = 0; i < a; i++) {
//            System.out.println("Podaj " + (i + 1) + " element tablicy: ");
//            tab2[i] = odczyt.nextInt();
//        }
//
//        while (c) {
//                c=false;
//            for (int i = 1; i < a; i++) {
//
//                if (tab2[i] < tab2[i - 1]) {
//                    b = tab2[i - 1];
//                    tab2[i - 1] = tab2[i];
//                    tab2[i] = b;
//                    c=true;
//
//                }
//            }
//        }
//
//        for (int i = 0; i < a; i++) {
//            System.out.println("T[" + i + "] = " + tab2[i]);
        }
        }
    
    
