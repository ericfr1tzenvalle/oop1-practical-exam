/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * 
 * @author mk
 */
import java.util.ArrayList;
public class Aviao extends Veiculo {

    private ArrayList<Pessoa> proprietarios = new ArrayList();
    
    private Finalidade finalidade;
    private int contador;
    
 
 
 
    public Aviao(Pessoa proprietarioPrincipal, String modelo, String marca, Finalidade finalidade){
        super(proprietarioPrincipal,modelo,marca);
        this.finalidade = finalidade;
        
    }

   
   
  
    public Finalidade getFinalidade() {
        return finalidade;
    }
  
    public void setFinalidade(Finalidade finalidade) {
        if(this.getFinalidade().equals(Finalidade.PASSAGEIRO)|| this.getFinalidade().equals(Finalidade.CARGA) && finalidade.equals(Finalidade.AGRICOLA)){
            throw new IllegalArgumentException("Aviao nao pode mudar de finalidade.");
        }else if(this.getFinalidade().equals(Finalidade.AGRICOLA)){
            throw new IllegalArgumentException("Aviao nao pode mudar de finalidade.");
        }
        
        if(this.getFinalidade().equals(Finalidade.PASSAGEIRO) || this.getFinalidade().equals(Finalidade.CARGA)){
            this.finalidade = finalidade;
        }
    }
    
    
  
    

   @Override
    
    public String mover(int distancia){
        int quilometragem = this.getQuilometragem() + Math.abs(distancia);
        setQuilometragem(quilometragem);
        if(this.getQuilometragem() > 0){
             return "O avião está andando pra frente";
        }
        return "O avião esta parado";
       
    }
    

    
    
    public  String getConteudo(){
      return this.finalidade.getUso();
    }
    

    
    
    public boolean addProprietario(Pessoa p){
            for(Pessoa p1: proprietarios){
                if(p1.equals(p)){
                    return false;
                    
                }
            }
            if(proprietarios.isEmpty()){
                 proprietarios.add(this.getProprietarioPrincipal());
            }
            
            
            if(proprietarios.size() < 4){
                proprietarios.add(p);
                return true;
            }
            
            return false;
            
     
        
    }

    public ArrayList<Pessoa> getProprietarios() {
        return proprietarios;
    }
    
    
    

    
    public boolean pertence(Pessoa p2){
        for(Pessoa p1: proprietarios){
            if(p1.getCpf().equals(p2.getCpf()) && p1.getNome().equals(p2.getNome())){
                return true; // existe
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Aviao{" + "finalidade=" + finalidade + '}';
    }

 


   

}
