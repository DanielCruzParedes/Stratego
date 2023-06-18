package stratego;

import java.util.ArrayList;
import java.util.Random;

public class FichasTableroHeroes {

    int contadorbombas = 0;
    vistatablero tablero;
    ArrayList<String> rangos2 = new ArrayList();
    ArrayList<String> fichassobrantes = new ArrayList();
    boolean espaciovacio;
    public javax.swing.JLabel LbTierra;
    public FichasTableroHeroes(vistatablero tablero) {
        
        this.tablero = tablero;
        //Fichas rango 2 (8)
        rangos2.add("gambit");
        rangos2.add("spider-girl");
        rangos2.add("ice-man");
        rangos2.add("storm");
        rangos2.add("phoenix");
        rangos2.add("dr.-strange");
        rangos2.add("elektra");
        rangos2.add("nightcrawler");
        //Fichas que no son ni bomba, ni tierra, ni rango 2 (25)
        fichassobrantes.add("mr.-fantastic");
        fichassobrantes.add("captain-america");
        fichassobrantes.add("professor-x");
        fichassobrantes.add("nick-fury");
        fichassobrantes.add("spider-man");
        fichassobrantes.add("wolverine");
        fichassobrantes.add("namor");
        fichassobrantes.add("daredevil");
        fichassobrantes.add("silver-surfer");
        fichassobrantes.add("hulk");
        fichassobrantes.add("iron-man");
        fichassobrantes.add("thor");
        fichassobrantes.add("human-torch");
        fichassobrantes.add("cyclops");
        fichassobrantes.add("invisible-woman");
        fichassobrantes.add("ghost-rider");
        fichassobrantes.add("punisher");
        fichassobrantes.add("blade");
        fichassobrantes.add("thing");
        fichassobrantes.add("emma-frost");
        fichassobrantes.add("she-hulk");
        fichassobrantes.add("giant-man");
        fichassobrantes.add("beast");
        fichassobrantes.add("colossus");
        fichassobrantes.add("black-widowH");
    }

    public void ponerFichas() {
        Random nAzar = new Random();
        int numeroAlAzar = 0;
        do {
            numeroAlAzar = nAzar.nextInt(0, 10) + 1; // Numero aleatorio de 1 a 10
        } while (numeroAlAzar == 1 || numeroAlAzar == 10);
        // Colocar tierra en posición aleatoria
        colocarTierra(numeroAlAzar);
        int numerodebombas=0;
        // Colocar bombas arriba, a la izquierda y a la derecha de la tierra
        colocarBomba(numeroAlAzar - 1); // Izquierda
        numerodebombas++;
        colocarBomba(numeroAlAzar + 1); // Derecha
        numerodebombas++;
        colocarBomba(numeroAlAzar + 10); // Arriba
        numerodebombas++;

        // Colocar 3 bombas adicionales en posiciones aleatorias

            do{
            int posicion = nAzar.nextInt(1, 21); // Número aleatorio de 1 a 20
            if (posicion != numeroAlAzar && posicion != numeroAlAzar - 1 && posicion != numeroAlAzar + 1 && posicion != numeroAlAzar + 10) {
                colocarBomba(posicion);
                numerodebombas++;
            }else{
                System.out.println("Quiso poner bomba donde ya habia.");
                System.out.println("Numero de bombas en el campo: "+numerodebombas);
            }
            }while(numerodebombas!=6);
        
        int vecesrepetidas = 0;
        do {//Poner fichas de rango 2
            int posicion = nAzar.nextInt(11, 31);
            if (revisarSiEstaVacio(posicion) == true) {
                System.out.println("Rangos 2: "+posicion);
                colocarRango2(posicion);
                vecesrepetidas++;
            } else {
                System.out.println("Espacio ocupado rango 2"+posicion);
            }
        } while (vecesrepetidas != 8);
        
        int vecesrepetidasSobrantes=0;
        do { //Poner fichas de rango 3
            int posicion = nAzar.nextInt(1, 41);
            if (revisarSiEstaVacio(posicion) == true) {
                System.out.println("Sobrantes: "+posicion);
                colocarFichasSobrantes(posicion);
                vecesrepetidasSobrantes++;
            } else {
                System.out.println("Espacio ocupado sobrantes"+posicion);
            }
        } while (vecesrepetidasSobrantes != 25);

    }

    
    private void colocarTierra(int posicion) {
       
        switch (posicion) {

            case 2:
                tablero.c2.setText("tierraH");
                break;
            case 3:
                tablero.c3.setText("tierraH");
                break;
            case 4:
                tablero.c4.setText("tierraH");
                break;
            case 5:
                tablero.c5.setText("tierraH");
                break;
            case 6:
                tablero.c6.setText("tierraH");
                break;
            case 7:
                tablero.c7.setText("tierraH");
                break;
            case 8:
                tablero.c8.setText("tierraH");
                break;
            case 9:
                tablero.c9.setText("tierraH");
                break;

        }
    }

    private void colocarBomba(int posicion) {
        switch (posicion) {
            case 1:
                tablero.c1.setText("nova-blast");
                break;
            case 2:
                tablero.c2.setText("nova-blast");
                break;
            case 3:
                tablero.c3.setText("nova-blast");
                break;
            case 4:
                tablero.c4.setText("nova-blast");
                break;
            case 5:
                tablero.c5.setText("nova-blast");
                break;
            case 6:
                tablero.c6.setText("nova-blast");
                break;
            case 7:
                tablero.c7.setText("nova-blast");
                break;
            case 8:
                tablero.c8.setText("nova-blast");
                break;
            case 9:
                tablero.c9.setText("nova-blast");
                break;
            case 10:
                tablero.c10.setText("nova-blast");
                break;
            case 11:
                tablero.c11.setText("nova-blast");
                break;
            case 12:
                tablero.c12.setText("nova-blast");
                break;
            case 13:
                tablero.c13.setText("nova-blast");
                break;
            case 14:
                tablero.c14.setText("nova-blast");
                break;
            case 15:
                tablero.c15.setText("nova-blast");
                break;
            case 16:
                tablero.c16.setText("nova-blast");
                break;
            case 17:
                tablero.c17.setText("nova-blast");
                break;
            case 18:
                tablero.c18.setText("nova-blast");
                break;
            case 19:
                tablero.c19.setText("nova-blast");
                break;
            case 20:
                tablero.c20.setText("nova-blast");
                break;
        }
    }

    int numeroAlAzar;

    Random nAzar = new Random();
    int limitedelgenerador = 8;

    private boolean revisarSiEstaVacio(int posicion) {
        if (posicion == 1) {
            if (tablero.c1.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 2) {
            if (tablero.c2.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 3) {
            if (tablero.c3.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 4) {
            if (tablero.c4.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 5) {
            if (tablero.c5.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 6) {
            if (tablero.c6.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 7) {
            if (tablero.c7.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 8) {
            if (tablero.c8.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 9) {
            if (tablero.c9.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 10) {
            if (tablero.c10.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 11) {
            if (tablero.c11.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 12) {
            if (tablero.c12.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 13) {
            if (tablero.c13.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 14) {
            if (tablero.c14.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 15) {
            if (tablero.c15.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 16) {
            if (tablero.c16.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 17) {
            if (tablero.c17.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 18) {
            if (tablero.c18.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 19) {
            if (tablero.c19.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 20) {
            if (tablero.c20.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 21) {
            if (tablero.c21.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 22) {
            if (tablero.c22.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 23) {
            if (tablero.c23.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 24) {
            if (tablero.c24.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 25) {
            if (tablero.c25.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 26) {
            if (tablero.c26.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 27) {
            if (tablero.c27.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 28) {
            if (tablero.c28.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 29) {
            if (tablero.c29.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 30) {
            if (tablero.c30.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 31) {
            if (tablero.c31.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 32) {
            if (tablero.c32.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 33) {
            if (tablero.c33.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 34) {
            if (tablero.c34.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 35) {
            if (tablero.c35.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 36) {
            if (tablero.c36.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 37) {
            if (tablero.c37.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 38) {
            if (tablero.c38.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 39) {
            if (tablero.c39.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 40) {
            if (tablero.c40.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        return espaciovacio;
    }

    private void colocarRango2(int posicion) {
        if (posicion == 11) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c11.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 12) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c12.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 13) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c13.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 14) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c14.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 15) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c15.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 16) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c16.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 17) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c17.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 18) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c18.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 19) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c19.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 20) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c20.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 21) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c21.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 22) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c22.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 23) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c23.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 24) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c24.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 25) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c25.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 26) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c26.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 27) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c27.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 28) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c28.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 29) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c29.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 30) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c30.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

    }
    
    
    int limitedelgeneradorFS = 25;//LIMITE DEL GENERADOR FICHAS SOBRANTES
    
    public void colocarFichasSobrantes(int posicion){
         if (posicion == 1) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c1.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 2) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c2.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 3) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c3.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 4) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c4.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 5) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c5.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 6) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c6.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 7) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c7.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 8) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c8.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 9) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c9.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 10) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c10.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 11) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c11.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 12) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c12.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 13) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c13.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 14) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c14.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 15) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c15.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 16) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c16.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 17) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c17.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 18) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c18.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 19) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c19.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 20) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c20.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 21) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c21.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 22) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c22.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 23) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c23.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 24) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c24.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 25) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c25.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 26) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c26.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 27) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c27.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 28) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c28.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 29) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c29.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 30) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c30.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 31) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c31.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 32) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c32.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 33) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c33.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 34) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c34.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 35) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c35.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 36) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c36.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 37) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c37.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 38) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c38.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 39) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c39.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 40) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c40.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         
    }

}
