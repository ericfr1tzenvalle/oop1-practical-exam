/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author mk
 */
public class TestaAviao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marco", "1234-00");
      // Aviao av1 = new Aviao(p1, "737", "boing", Finalidade.CARGA);
      //  System.out.println(av1);
         //Veiculo{registro=null, modelo=737, marca=boing, quilometragem=0}Aviao{finalidade=CARGA}
         
// Aviao av2 = new Aviao(p1, "", "boing", Finalidade.CARGA);
//         System.out.println(av2);
         //Exception in thread "main" java.lang.IllegalArgumentException: O modelo nao pode ser nulo ou vazio
         
//      Aviao av3 = new Aviao(p1, null, "boing", Finalidade.CARGA);
//       System.out.println(av3);
//         //Exception in thread "main" java.lang.IllegalArgumentException: O modelo nao pode ser nulo ou vazio
         
//         Aviao av4= new Aviao(p1, "737", "", Finalidade.CARGA);
//        System.out.println(av4);
         //Exception in thread "main" java.lang.IllegalArgumentException: A marca nao pode ser nula ou vazia
         
 //         Aviao av5= new Aviao(p1, "737", null, Finalidade.CARGA);
 //        System.out.println(av5);
         //Exception in thread "main" java.lang.IllegalArgumentException: A marca nao pode ser nula ou vazia
         
         // ---------------- AQUI TESTE DE AVIAO COM REGISTRO -------------------------
         //Aviao av1 = new Aviao(p1, "737", "boing", Finalidade.CARGA);
         //Registro reg1 = new Registro(1000, "POA", "29/4/2025");
        //av1.setRegistro(reg1);
        //System.out.println(av1);
         //Veiculo{registro=Registro{numero=1000, local=POA, data=29/4/2025}, modelo=737, marca=boing, quilometragem=0}Aviao{finalidade=CARGA}
         
        //Aviao av2 = new Aviao(p1, "737", "boing", Finalidade.CARGA);
         //av2.setRegistro(null);
         // Exception in thread "main" java.lang.IllegalArgumentException: O registro nao pode ser nulo
         
         //--------------------AQUI TESTE AVIAO COM PROPRIETARIOS ---------------------------------
  //      Aviao av1 = new Aviao(p1, "737", "boing", Finalidade.CARGA);
 //       Registro reg1 = new Registro(1000, "POA", "29/4/2025");
  //       av1.setRegistro(reg1);
  //      Pessoa p2 = new Pessoa("Ana", "6789-22");
  //      av1.setProprietarioPrincipal(p2);
  //      System.out.println(av1);
//         // Veiculo{registro=Registro{numero=1000, local=POA, data=29/4/2025}, modelo=737, marca=boing, quilometragem=0, proprietarioPrincipal=Proprietario{nome=Ana, cpf=6789-22}}Aviao{finalidade=CARGA
//        
 //      System.out.println("Adiconou Marco ? " + av1.addProprietario(p1)); //true
 //     Pessoa p3 = new Pessoa("Joao", "2345-99");
 //       System.out.println("Adicionou Joao ? " + av1.addProprietario(p3)); //true
 //       System.out.println("Adicionou Ana novamente ? " + av1.addProprietario(p2)); //false
  //     System.out.println("Adicionou Luiz ? " + av1.addProprietario(new Pessoa ("Luiz", "6543-77"))); //true
 // System.out.println("Adicionou Pedro ? " + av1.addProprietario(new Pessoa ("Pedro", "2468-11"))); //false
         
  //*PROF FIZ COM ARRAYLIST ENTAO ESSE FOR VAI SER DIFERENE; :((( NAO VAI DAR TEMPO DE MUDAR
  //VOU MODIFICAR AQUI SORA MAS NAO EM DESCONTA NOTA PLZ* É SO UMA LISTAGEM...
        // ArrayList<Pessoa> proprietarios = av1.getProprietarios();
         //System.out.println(proprietarios);
  
     //   Pessoa[] proprietarios = av1.getProprietarios();
         //for (int i = 0; i < proprietarios.length; i++) {
         //    System.out.println(proprietarios[i]); //Ana, Marco, Joao, Luiz
     //     
      //  }
//         
//       System.out.println("Luiz eh proprietario do aviao ?" + av1.pertence(new Pessoa ("Luiz", "6543-77"))) ; //true
 //        System.out.println("Pedro eh proprietario do aviao ?" + av1.pertence(new Pessoa ("Pedro", "2468-11"))) ; //false
         
         //--------------------AQUI TESTE DOS METODOS DE AVIAO ---------------------------------
   //      Aviao av1 = new Aviao(p1,"737", "boing", Finalidade.CARGA);
  //      Registro reg1 = new Registro(1000, "POA", "29/4/2025");
 //       av1.setRegistro(reg1);
 //    System.out.println(av1.mover(1500)); // O aviao está se movendo para frente
  //     System.out.println("Quilometragem atual = " + av1.getQuilometragem()); //1500
//         
 //     av1.mover(1000);
 //        System.out.println("Quilometragem atual = " + av1.getQuilometragem()); //2500
         
//         av1.mover(-100);
         //Exception in thread "main" java.lang.IllegalArgumentException: A quilometragem não pode ser negativa
         
  //      System.out.println("O aviao esta transportando " + av1.getConteudo()); //O aviao esta transportando mercadorias
//         
  //     av1.setFinalidade(Finalidade.PASSAGEIRO);
   //    System.out.println("O aviao esta transportando " + av1.getConteudo()); //O aviao esta transportando passageiros
//         
 //     av1.setFinalidade(Finalidade.AGRICOLA);
         //Exception in thread "main" java.lang.IllegalArgumentException: Aviao nao pode mudar de finalidade 
         
        //  Aviao av2 = new Aviao(p1,"TECO-TECO", "ZZZZ", Finalidade.AGRICOLA);
        // av2.setFinalidade(Finalidade.CARGA);
          //Exception in thread "main" java.lang.IllegalArgumentException: Aviao nao pode mudar de finalidade 
    }
    
}
