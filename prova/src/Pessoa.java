
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public final void setNome(String nome) {
        if (nome==null || nome.isEmpty()) throw new IllegalArgumentException("Nome nao pode ser nulo ou vazio");
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    
    private void setCpf(String cpf){
         if (cpf==null || cpf.isEmpty()) throw new IllegalArgumentException("CPF nao pode ser nulo ou vazio");
        this.cpf = cpf;
    }
    
    

    @Override
    public String toString() {
        return "Proprietario{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.cpf);
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
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
    
}
