package stratego;

import java.util.ArrayList;
import java.util.Random;

public class FichasTableroVillanos {

    int contadorbombas = 0;
    vistatablero tablero;
    ArrayList<String> rangos2 = new ArrayList();
    ArrayList<String> fichassobrantes = new ArrayList();
    boolean espaciovacio;

    public FichasTableroVillanos(vistatablero tablero) {
        this.tablero = tablero;
        
        //Heroes
        rangos2.add("mr.-sinister");
        rangos2.add("sentinel-1");
        rangos2.add("sentinel-2");
        rangos2.add("ultron");
        rangos2.add("sandman");
        rangos2.add("leader");
        rangos2.add("viper");
        rangos2.add("electro");
        
        //Villanos
        fichassobrantes.add("dr.-doom");
        fichassobrantes.add("galactus");
        fichassobrantes.add("kingpin");
        fichassobrantes.add("magneto");
        fichassobrantes.add("apocalypse");
        fichassobrantes.add("green-goblin");
        fichassobrantes.add("venom");
        fichassobrantes.add("bullseye");
        fichassobrantes.add("omega-red");
        fichassobrantes.add("onslaught");
        fichassobrantes.add("red-skull");
        fichassobrantes.add("mystique");
        fichassobrantes.add("mysterio");
        fichassobrantes.add("dr.-octopus");
        fichassobrantes.add("deadpool");
        fichassobrantes.add("abomination");
        fichassobrantes.add("thanos");
        fichassobrantes.add("black-cat");
        fichassobrantes.add("sabretooth");
        fichassobrantes.add("juggernaut");
        fichassobrantes.add("rhino");
        fichassobrantes.add("carnage");
        fichassobrantes.add("mole-man");
        fichassobrantes.add("lizard");
        fichassobrantes.add("black-widowV");
    }

    public void ponerFichas() {
        Random nAzar = new Random();
        int numeroAlAzar = 0;
        do {
            numeroAlAzar = nAzar.nextInt(90, 100) + 1; // Número aleatorio de 91 a 100
        } while (numeroAlAzar == 91 || numeroAlAzar == 100);
        // Colocar tierra en posición aleatoria
        colocarTierra(numeroAlAzar);
        int numerodebombas=0;
        // Colocar bombas arriba, a la izquierda y a la derecha de la tierra
        colocarBomba(numeroAlAzar - 1); // Izquierda
        numerodebombas++;
        colocarBomba(numeroAlAzar + 1); // Derecha
        numerodebombas++;
        colocarBomba(numeroAlAzar - 10); // Abajo
        numerodebombas++;

        // Colocar 3 bombas adicionales en posiciones aleatorias
        do{
            int posicion = nAzar.nextInt(81, 101); // Número aleatorio de 81 a 100
            if (posicion != numeroAlAzar && posicion != numeroAlAzar - 1 && posicion != numeroAlAzar + 1 && posicion != numeroAlAzar - 10) {
                colocarBomba(posicion);
                numerodebombas++;
            }else{
                System.out.println("Quiso poner bomba donde ya habia.");
                System.out.println("Numero de bombas en el campo: "+numerodebombas);
            }
        }while(numerodebombas!=6);
        
        int vecesrepetidas = 0;

        do {//PONER RANGOS 2
            int posicion = nAzar.nextInt(71, 91);
            if (revisarSiEstaVacio(posicion) == true) {
                System.out.println(posicion);
                colocarRango2(posicion);
                vecesrepetidas++;
            } else {
                System.out.println("Espacio ocupado");
            }
        } while (vecesrepetidas != 8);
        
        int vecesrepetidasSobrantes=0;
        do { //Poner fichas de rango 3
            int posicion = nAzar.nextInt(61, 101);
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
            case 92:
                tablero.c92.setText("tierraV");
                break;
            case 93:
                tablero.c93.setText("tierraV");
                break;
            case 94:
                tablero.c94.setText("tierraV");
                break;
            case 95:
                tablero.c95.setText("tierraV");
                break;
            case 96:
                tablero.c96.setText("tierraV");
                break;
            case 97:
                tablero.c97.setText("tierraV");
                break;
            case 98:
                tablero.c98.setText("tierraV");
                break;
            case 99:
                tablero.c99.setText("tierraV");
                break;
                

        }
    }

    private void colocarBomba(int posicion) {
        switch (posicion) {
            case 91:
                tablero.c91.setText("pumpkin-bomb");
                break;
            case 92:
                tablero.c92.setText("pumpkin-bomb");
                break;
            case 93:
                tablero.c93.setText("pumpkin-bomb");
                break;
            case 94:
                tablero.c94.setText("pumpkin-bomb");
                break;
            case 95:
                tablero.c95.setText("pumpkin-bomb");
                break;
            case 96:
                tablero.c96.setText("pumpkin-bomb");
                break;
            case 97:
                tablero.c97.setText("pumpkin-bomb");
                break;
            case 98:
                tablero.c98.setText("pumpkin-bomb");
                break;
            case 99:
                tablero.c99.setText("pumpkin-bomb");
                break;
            case 100:
                tablero.c100.setText("pumpkin-bomb");
                break;
            case 81:
                tablero.c81.setText("pumpkin-bomb");
                break;
            case 82:
                tablero.c82.setText("pumpkin-bomb");
                break;
            case 83:
                tablero.c83.setText("pumpkin-bomb");
                break;
            case 84:
                tablero.c84.setText("pumpkin-bomb");
                break;
            case 85:
                tablero.c85.setText("pumpkin-bomb");
                break;
            case 86:
                tablero.c86.setText("pumpkin-bomb");
                break;
            case 87:
                tablero.c87.setText("pumpkin-bomb");
                break;
            case 88:
                tablero.c88.setText("pumpkin-bomb");
                break;
            case 89:
                tablero.c89.setText("pumpkin-bomb");
                break;
            case 90:
                tablero.c90.setText("pumpkin-bomb");
                break;
        }
    }
    
    int numeroAlAzar;

    Random nAzar = new Random();
    int limitedelgenerador = 8;

    private boolean revisarSiEstaVacio(int posicion) {

        if (posicion == 81) {
            if (tablero.c81.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 82) {
            if (tablero.c82.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 83) {
            if (tablero.c83.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 84) {
            if (tablero.c84.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 85) {
            if (tablero.c85.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 86) {
            if (tablero.c86.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 87) {
            if (tablero.c87.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 88) {
            if (tablero.c88.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 89) {
            if (tablero.c89.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 90) {
            if (tablero.c90.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 71) {
            if (tablero.c71.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 72) {
            if (tablero.c72.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 73) {
            if (tablero.c73.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 74) {
            if (tablero.c74.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 75) {
            if (tablero.c75.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 76) {
            if (tablero.c76.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 77) {
            if (tablero.c77.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 78) {
            if (tablero.c78.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 79) {
            if (tablero.c79.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 80) {
            if (tablero.c80.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 61) {
            if (tablero.c61.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 62) {
            if (tablero.c62.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 63) {
            if (tablero.c63.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 64) {
            if (tablero.c64.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 65) {
            if (tablero.c65.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 66) {
            if (tablero.c66.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 67) {
            if (tablero.c67.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 68) {
            if (tablero.c68.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 69) {
            if (tablero.c69.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 70) {
            if (tablero.c70.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 91) {
            if (tablero.c91.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 92) {
            if (tablero.c92.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        if (posicion == 93) {
            if (tablero.c93.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 94) {
            if (tablero.c94.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 95) {
            if (tablero.c95.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 96) {
            if (tablero.c96.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 97) {
            if (tablero.c97.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 98) {
            if (tablero.c98.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 99) {
            if (tablero.c99.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }
        if (posicion == 100) {
            if (tablero.c100.getText().equals("")) {
                espaciovacio = true;
            } else {
                espaciovacio = false;
            }
        }

        return espaciovacio;
    
}
    
    private void colocarRango2(int posicion) {
        if (posicion == 81) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c81.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 82) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c82.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 83) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c83.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 84) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c84.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 85) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c85.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 86) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c86.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 87) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c87.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 88) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c88.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 89) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c89.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 90) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c90.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 71) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c71.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 72) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c72.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 73) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c73.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 74) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c74.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 75) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c75.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 76) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c76.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }
        if (posicion == 77) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c77.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 78) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c78.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 79) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c79.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

        if (posicion == 80) {
            numeroAlAzar = nAzar.nextInt(limitedelgenerador);
            tablero.c80.setText(rangos2.get(numeroAlAzar));
            rangos2.remove(numeroAlAzar);
            limitedelgenerador--;
        }

    }
    
    
    int limitedelgeneradorFS = 25;//LIMITE DEL GENERADOR FICHAS SOBRANTES
    
    public void colocarFichasSobrantes(int posicion){
         if (posicion == 61) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c61.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 62) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c62.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 63) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c63.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 64) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c64.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 65) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c65.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 66) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c66.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 67) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c67.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 68) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c68.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 69) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c69.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 70) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c70.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 71) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c71.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 72) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c72.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 73) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c73.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 74) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c74.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 75) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c75.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 76) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c76.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 77) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c77.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 78) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c78.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 79) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c79.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 80) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c80.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 81) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c81.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 82) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c82.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 83) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c83.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 84) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c84.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 85) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c85.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 86) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c86.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 87) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c87.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 88) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c88.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 89) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c89.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 90) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c90.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
          if (posicion == 91) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c91.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 92) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c92.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 93) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c93.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 94) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c94.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 95) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c95.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 96) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c96.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 97) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c97.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 98) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c98.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 99) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c99.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         if (posicion == 100) {
            numeroAlAzar = nAzar.nextInt(limitedelgeneradorFS);
            tablero.c100.setText(fichassobrantes.get(numeroAlAzar));
            fichassobrantes.remove(numeroAlAzar);
            limitedelgeneradorFS--;
        }
         
    }

}



