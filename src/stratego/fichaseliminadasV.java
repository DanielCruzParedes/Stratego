
package stratego;

import java.util.ArrayList;

public class fichaseliminadasV {
     private String eliminadasV;
    public fichaseliminadasV(String eliminadasV){
        this.eliminadasV=eliminadasV;
    }

    public String getEliminadasV() {
        return eliminadasV;
    }

    public void setEliminadasV(String eliminadasV) {
        this.eliminadasV = eliminadasV;
    }
   public static ArrayList<fichaseliminadasV> fichas=new ArrayList();
   public static void eliminadas (String verificar){
       
        fichas.add(new fichaseliminadasV(verificar));
    }
   public static String fichas(){
       String words="";
        for (fichaseliminadasV ficha : fichas) {
            words +=ficha.getEliminadasV()+"\n";
        }
        return words;
        }
}
