
package stratego;

import java.util.ArrayList;

public class fichaseliminadasH {
    private String eliminadasH;
    public fichaseliminadasH(String eliminadasH){
        this.eliminadasH=eliminadasH;
    }

    public String getEliminadasH() {
        return eliminadasH;
    }

    public void setEliminadasH(String eliminadasH) {
        this.eliminadasH = eliminadasH;
    }
   public static ArrayList<fichaseliminadasH> fichas=new ArrayList();
   public static void eliminadas (String verificar){
       
        fichas.add(new fichaseliminadasH(verificar));
    }
   public static String fichas(){
       String words="";
        for (fichaseliminadasH ficha : fichas) {
            words +=ficha.getEliminadasH()+"\n";
        }
        return words;
        }
}
