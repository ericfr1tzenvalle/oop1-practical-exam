
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 
 * @author mk
 */
public record Registro (int numero,String local, String data) {


      public Registro{
        if(numero <= 0){
            throw new IllegalArgumentException("Registro deve ser um numero maior do que zero");
        }
        if(local.length() <= 0 || local == null ){
            throw new IllegalArgumentException("Local nao pode ser nulo ou vazio");
        }
         if(data == null || data.length()<= 0 ){
            throw new IllegalArgumentException("Data nao pode ser nula ou vazia");
        }
        
       
    }
    
   
    @Override
    public String toString() {
        return "Registro{" + "numero=" + numero + ", local=" + local + ", data=" + data + '}';
    }
    
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        return this.numero == other.numero;
    }
    
};
