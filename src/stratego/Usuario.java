package stratego;

public class Usuario {
    
    private String user;
    private String contrasena;
    private int puntos;
    private int vecesJugadasHeroes;
    private int vecesJugadasVillanos;
    
    
    public Usuario(String user, String contrasena, int puntos, int vecesJugadasHeroes, int vecesJugadasVillanos){
        this.user=user;
        this.contrasena=contrasena;
        this.puntos=puntos;
        this.vecesJugadasHeroes=vecesJugadasHeroes;
        this.vecesJugadasVillanos=vecesJugadasVillanos;
    }
    
    public void setUser(String user){
    this.user=user;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena=contrasena;
    }
    public String getContrasena(){
        return contrasena;
    }
    public void setPuntos(int puntos){
        this.puntos=this.puntos+puntos;
    }
    public int getPuntos(){
        return puntos;
    }
    public void setVecesJugadasHeroes(int vecesJugadasHeroes){
        this.vecesJugadasHeroes=vecesJugadasHeroes;
    }
    public int getVecesJugadasHeroes(){
        return vecesJugadasHeroes;
    }
    public void setVecesJugadasVillanos(int vecesJugadasVillanos){
        this.vecesJugadasVillanos=vecesJugadasVillanos;
    }
    public int getVecesJugadasVillanos(){
        return vecesJugadasVillanos;
    }
    
    


}



