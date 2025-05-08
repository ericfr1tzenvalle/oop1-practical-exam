/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestaCicloBike {
    public static void main(String[] args) {
   //  CicloBike cb1 = new CicloBike(null,"air", "caloi", "preto");
         // Exception in thread "main" java.lang.IllegalArgumentException: Proprietario nao pode ser nulo
        
        Pessoa p1 = new Pessoa("Marco", "1234-00");
 //       CicloBike cb1 = new CicloBike(p1,"air", "caloi", "preto");
    //    System.out.println(cb1);
        // Veiculo{registro=null, modelo=air, marca=caloi, quilometragem=0, proprietarioPrincipal=Proprietario{nome=Marco, cpf=1234-00}}CicloBike{cor=preto}
   //    cb1.setProprietarioPrincipal(new Pessoa("Ana", "6789-11"));
     //   System.out.println(cb1); 
        //Veiculo{registro=null, modelo=air, marca=caloi, quilometragem=0, proprietarioPrincipal=Proprietario{nome=Ana, cpf=6789-11}}CicloBike{cor=preto}
//        
 //      CicloBike cb2 = new CicloBike(p1,"air", "caloi", "");
//        System.out.println(cb2);
        //Exception in thread "main" java.lang.IllegalArgumentException: Cor nao pode ser nulo ou vazio
        
//        CicloBike cb3 = new CicloBike(p1, "air", "caloi", null);
//        System.out.println(cb3);
        //Exception in thread "main" java.lang.IllegalArgumentException: Cor nao pode ser nulo ou vazio

                
        // ---------------- AQUI TESTE DE CICLOBIKE COM REGISTRO -------------------------
  //     CicloBike cb1 = new CicloBike(p1, "air", "caloi", "preto");
   //     Registro reg1 = new Registro(1000, "POA", "29/4/2025");
  //      cb1.setRegistro(reg1);
  //      System.out.println(cb1);
        //Veiculo{registro=Registro{numero=1000, local=POA, data=29/4/2025}, modelo=air, marca=caloi, quilometragem=0}CicloBike{cor=preto}
//        
//   cb1.setRegistro(null);
        //Exception in thread "main" java.lang.IllegalArgumentException: O registro nao pode ser nulo
               
        //--------------------AQUI TESTE DOS METODOS DE CICLOBIKE ---------------------------------
          CicloBike cb1 = new CicloBike(p1, "air", "caloi", "preto");
          System.out.println(cb1.mover(-100)); //O CicloBike está se movendo para trás
          System.out.println("Quilometragem atual = " + cb1.getQuilometragem()); //quilometragem atual = 100
          System.out.println(cb1.mover(1100)); //O CicloBike está se movendo para frente
          System.out.println("Quilometragem atual = " + cb1.getQuilometragem()); //quilometragem atual = 1200
        
    }
}
