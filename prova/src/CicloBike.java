
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */

public class CicloBike extends Veiculo {
    
    private String cor;

    public CicloBike(Pessoa p,String modelo, String marca, String cor) {
        super(p,modelo,marca);
        setCor(cor);
    }

    
  
    

  
   

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) throw new IllegalArgumentException("Cor nao pode ser nulo ou vazio");
        this.cor = cor;
    }

    @Override
    public String mover(int distancia){
        int quilometragem = this.getQuilometragem() + Math.abs(distancia);
        setQuilometragem(quilometragem);
        if(distancia > 0){
            return "Bike esta andando pra frente";
        }else if(distancia < 0){
            return "Bike esta andando pra tras";
        }
        return "Bike está parada";
    }

    @Override
    public String toString() {
        return super.toString() + "CicloBike{" + "cor=" + cor + '}';
    }
    
}
