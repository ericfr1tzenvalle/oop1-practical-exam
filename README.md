# oop1-practical-exam

**English:**  
Practical exam project for Object-Oriented Programming I – IFRS Osório.  
Implementation of classes using inheritance, abstraction, composition, and aggregation in Java.  
Includes error handling with `IllegalArgumentException` and array manipulation.

**Português:**  
Projeto da prova prática de Programação Orientada a Objetos I – IFRS Osório.  
Implementação de classes utilizando herança, abstração, composição e agregação em Java.  
Inclui tratamento de erros com `IllegalArgumentException` e manipulação de arrays.

---

## 🧱 Project Structure

- `Pessoa.java` – Classe que representa uma pessoa (nome, CPF).
- `Finalidade.java` – Enum representando a finalidade do avião (PASSAGEIROS, CARGA, AGRÍCOLA).
- `Registro.java` – Record que contém os dados de registro do veículo.
- `Veiculo.java` – Classe abstrata base para veículos.
- `Aviao.java` – Subclasse de `Veiculo`, com múltiplos proprietários e comportamento específico.
- `CicloBike.java` – Subclasse de `Veiculo` com relação de composição com `Pessoa`.

---

## 🧪 Test Classes

Todas as classes de teste estão dentro da pasta `TestPackages`:

1. `TestaPessoa.java`
2. `TestaRegistro.java`
3. `TestaCicloBike.java`
4. `TestaAviao.java`

Cada teste contém saídas esperadas como comentários para validar o comportamento.

---

## 🚀 How to Run

1. Open the project in **NetBeans**.
2. Make sure your JDK is set up correctly.
3. Run the test classes in order to validate your implementation.

---

## 📁 Build & Ignore

This project uses a `.gitignore` to exclude compiled files, NetBeans private settings, and build directories.

---

## ⚠️ Error Handling

- **IllegalArgumentException**: Used throughout the project to ensure valid inputs for class constructors and methods.  
  Example: If a `Veiculo` is created with an invalid model name, an `IllegalArgumentException` is thrown.
  
- **Array Manipulation**: Arrays are used for storing multiple owners for certain vehicle types (e.g., `Aviao`). Proper checks are in place to ensure no `ArrayIndexOutOfBoundsException` occurs.

---

## 📄 License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.
