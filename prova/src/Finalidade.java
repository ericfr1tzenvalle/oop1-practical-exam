/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */

public enum Finalidade {
    PASSAGEIRO("pessoas"),
    CARGA("mercadorias"),
    AGRICOLA("venenos");
    
    private final String uso;
    
    Finalidade(String uso){
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }
    
    
    
    
   
    
}
