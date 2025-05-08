
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */

public abstract class Veiculo {
    

    private Pessoa proprietarioPrincipal;
    private Registro registro;
    private String modelo;
    private String marca;
    private int quilometragem;
    

 
    
   
    public Veiculo(Pessoa proprietarioPrincipal, String modelo, String marca) {
        setProprietarioPrincipal(proprietarioPrincipal);
        setModelo(modelo);
        setMarca(marca);
        
    }
    
     public void setRegistro(Registro r){
        if(r == null){
            throw new IllegalArgumentException("O registro nao pode ser nulo");
        }
        this.registro = r;
    }
    
    
    

    public final void setProprietarioPrincipal(Pessoa proprietario) {
        if (proprietario == null) throw new IllegalArgumentException("Proprietario nao pode ser nulo");
        this.proprietarioPrincipal = proprietario;
    }

    public Pessoa getProprietarioPrincipal() {
        return proprietarioPrincipal;
    }
    
    /**
     * @return the registro
     */
    public Registro getRegistro() {
        return registro;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    private void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) throw new IllegalArgumentException("O modelo nao pode ser nulo ou vazio");
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    private void setMarca(String marca) {
         if (marca == null || marca.isEmpty()) throw new IllegalArgumentException("A marca nao pode ser nula ou vazia");
        this.marca = marca;
    }

    /**
     * @return the quilometragem
     */
    public int getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */

    protected void setQuilometragem(int quilometragem) {
        if (quilometragem <0){
            throw new IllegalArgumentException("A quilometragem não pode ser negativa");
        }
        this.quilometragem = quilometragem;
    }
    

    public abstract String mover(int distancia);
    
    
    @Override
    public String toString() {
        return "Veiculo{" + "registro=" + registro + ", modelo=" + modelo + ", marca=" + marca + ", quilometragem=" + quilometragem + ", proprietarioPrincipal=" + proprietarioPrincipal + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.registro);
        hash = 43 * hash + Objects.hashCode(this.modelo);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + this.quilometragem;
        return hash;
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
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.registro, other.registro);
    }
    
    
    
}
