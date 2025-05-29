# JFono 🎙️ - Sistema de Monitoramento de Exercícios Vocais

## 💡 Contexto e Problema

O **JFono** é uma solução inovadora projetada para atender às necessidades de fonoaudiólogos, professores de voz e pacientes que buscam um acompanhamento estruturado e eficiente na execução de exercícios vocais. A prática inadequada ou a falta de monitoramento pode resultar em problemas graves de saúde vocal, como rouquidão, nódulos nas cordas vocais ou até lesões mais sérias.

Atualmente, o acompanhamento vocal é frequentemente realizado de forma manual, o que dificulta a organização, a centralização de dados e a comunicação entre profissionais e pacientes. O JFono propõe uma abordagem digital moderna para otimizar a gestão de clínicas de fonoaudiologia, facilitar o acompanhamento de pacientes e promover a saúde vocal de maneira proativa, precisa e acessível.

## 🎯 Objetivo

O JFono tem como missão oferecer uma plataforma robusta e intuitiva que centralize informações, melhore a comunicação entre clínicas, profissionais e pacientes, e auxilie na prevenção e reabilitação vocal, garantindo maior eficiência e melhores resultados para a saúde da voz.

## 🚀 Tecnologias Utilizadas

O projeto foi construído com as seguintes tecnologias, garantindo um desenvolvimento eficiente e escalável:

- **Linguagem de Programação**: Java
- **Controle de Versão**: Git
- **Repositório de Código**: GitHub
- **Ferramentas de Desenvolvimento**: IDEs como IntelliJ IDEA, Eclipse ou Visual Studio Code
- **Estrutura do Projeto**: Programação Orientada a Objetos (POO) com encapsulamento, construtores e métodos

## 📋 Estrutura do Projeto

O JFono é organizado em classes que representam as entidades centrais do sistema, modelando de forma clara e modular os conceitos relacionados ao monitoramento vocal.

### 📁 Classes Principais

#### `App.java`
- **Descrição**: Classe principal que inicializa o sistema e demonstra as funcionalidades básicas, criando e manipulando objetos das demais classes.
- **Função**: Serve como ponto de entrada do programa, instanciando objetos e exibindo informações.

#### `Clinica.java`
- **Descrição**: Representa uma clínica de fonoaudiologia.
- **Atributos**:
  - `id` (int): Identificador único da clínica.
  - `nome` (String): Nome da clínica.
  - `cnpj` (String): CNPJ da clínica.
- **Responsabilidades**: Armazenar e gerenciar informações institucionais da clínica.

#### `Exercicio.java`
- **Descrição**: Modela um exercício vocal a ser monitorado.
- **Atributos**:
  - `id` (int): Identificador único do exercício.
  - `nome` (String): Nome do exercício.
  - `descricao` (String): Instruções detalhadas para execução.
  - `som` (String): Som associado ao exercício (quando aplicável).
  - `tempoMin` (int): Tempo mínimo recomendado para execução.
  - `exemplo` (String): Exemplo prático ou observação.
- **Responsabilidades**: Descrever e gerenciar exercícios vocais com diferentes níveis de detalhe, utilizando construtores sobrecarregados.

#### `Paciente.java`
- **Descrição**: Representa um paciente que realiza exercícios vocais.
- **Atributos**:
  - `id` (int): Identificador único do paciente.
  - `nome` (String): Nome do paciente.
  - `email` (String): E-mail de contato.
- **Responsabilidades**: Armazenar informações básicas do paciente e permitir atualizações.

#### `Profissional.java`
- **Descrição**: Modela um profissional de fonoaudiologia.
- **Atributos**:
  - `id` (int): Identificador único do profissional.
  - `nome` (String): Nome do profissional.
  - `telefone` (String): Telefone de contato.
- **Responsabilidades**: Gerenciar informações do profissional que acompanha os pacientes.

## 🧠 Competências Desenvolvidas

Durante o desenvolvimento do JFono, foram consolidadas e aprimoradas as seguintes competências em Programação Orientada a Objetos (POO) com Java:

- **Modelagem de Classes**: Criação de classes que refletem entidades do mundo real, como clínicas, pacientes e exercícios.
- **Encapsulamento**: Uso de atributos privados com métodos `getters` e `setters` para controle de acesso.
- **Construtores**: Implementação de construtores padrão e sobrecarregados para flexibilidade na criação de objetos.
- **Instanciação**: Prática na criação e manipulação de objetos a partir de classes.
- **Métodos**: Desenvolvimento de métodos para definir comportamentos específicos dos objetos.
- **Organização de Código**: Estruturação modular do código para facilitar manutenção e escalabilidade.
- **Boas Práticas**: Adoção de convenções de nomenclatura e organização para garantir legibilidade e clareza.

## 💻 Código-Fonte

Abaixo está a estrutura do código-fonte do JFono, organizado por classes para maior clareza.

### `App.java`
```java
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao JFono!");

        // Instanciação de exercícios vocais
        Exercicio ex1 = new Exercicio("Soprar Canudo",
                                      "Soprar ar por um canudo para relaxar as cordas vocais",
                                      "/", 3, "/");
        Exercicio ex2 = new Exercicio("Vibração Labial",
                                      "Vibrar os lábios simulando som de motor",
                                      "brrrrr");
        Exercicio ex3 = new Exercicio("Canto Sustentado");

        // Exibição de informações dos exercícios
        System.out.println("Exercício: " + ex1.getNome() + " | Descrição: " + ex1.getDescricao() +
                           " | Som: " + ex1.getSom() + " | Tempo: " + ex1.getTempoMin() + " min");
        System.out.println("Exercício: " + ex2.getNome() + " | Exemplo: " + ex2.getExemplo());
        System.out.println("Exercício: " + ex3.getNome());

        // Instanciação de clínicas
        Clinica c1 = new Clinica("Voz & Saúde", "12.345.678/0001-99");
        Clinica c2 = new Clinica("FonoVida", "98.765.432/0001-88");
        System.out.println("Clínica: " + c1.getNome() + " | CNPJ: " + c1.getCnpj());
        System.out.println("Clínica: " + c2.getNome() + " | CNPJ: " + c2.getCnpj());

        // Instanciação de profissionais
        Profissional p1 = new Profissional("Dr. João Lima", "(11) 98765-4321");
        Profissional p2 = new Profissional("Dra. Ana Costa", "(21) 91234-5678");
        System.out.println("Profissional: " + p1.getNome() + " | Telefone: " + p1.getTelefone());
        System.out.println("Profissional: " + p2.getNome() + " | Telefone: " + p2.getTelefone());

        // Instanciação de pacientes
        Paciente pac1 = new Paciente("Mariana Silva", "mariana.silva@email.com");
        Paciente pac2 = new Paciente();
        pac2.setNome("Lucas Oliveira");
        pac2.setEmail("lucas.oliveira@email.com");
        System.out.println("Paciente: " + pac1.getNome() + " | Email: " + pac1.getEmail());
        System.out.println("Paciente: " + pac2.getNome() + " | Email: " + pac2.getEmail());
    }
}
```

### `Clinica.java`
```java
public class Clinica {
    private int id;
    private String nome;
    private String cnpj;

    public Clinica() {}

    public Clinica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
}
```

### `Exercicio.java`
```java
public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin;
    private String exemplo;

    public Exercicio() {}

    public Exercicio(String nome) {
        this.nome = nome;
    }

    public Exercicio(String nome, String descricao, String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.exemplo = exemplo;
    }

    public Exercicio(String nome, String descricao, String som, int tempoMin, String exemplo) {
        this.nome = nome;
        this.descricao = descricao;
        this.som = som;
        this.tempoMin = tempoMin;
        this.exemplo = exemplo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getSom() { return som; }
    public void setSom(String som) { this.som = som; }
    public int getTempoMin() { return tempoMin; }
    public void setTempoMin(int tempoMin) { this.tempoMin = tempoMin; }
    public String getExemplo() { return exemplo; }
    public void setExemplo(String exemplo) { this.exemplo = exemplo; }
}
```

### `Paciente.java`
```java
public class Paciente {
    private int id;
    private String nome;
    private String email;

    public Paciente() {}

    public Paciente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
```

### `Profissional.java`
```java
public class Profissional {
    private int id;
    private String nome;
    private String telefone;

    public Profissional() {}

    public Profissional(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}
```

## 📈 Benefícios do JFono

- **Centralização de Dados**: Organização eficiente de informações sobre clínicas, profissionais, pacientes e exercícios.
- **Acompanhamento Personalizado**: Suporte à criação e monitoramento de exercícios vocais adaptados às necessidades dos pacientes.
- **Prevenção de Problemas Vocais**: Ferramenta que promove práticas seguras e orientadas para a saúde vocal.
- **Escalabilidade**: Estrutura modular que permite a adição de novas funcionalidades, como integração com bancos de dados ou interfaces gráficas.

## 🔮 Próximos Passos

- **Integração com Banco de Dados**: Implementar persistência de dados para armazenar informações de forma permanente.
- **Interface Gráfica**: Desenvolver uma interface amigável para facilitar o uso por profissionais e pacientes.
- **Funcionalidades Avançadas**: Adicionar relatórios de progresso, notificações para pacientes e integração com dispositivos de áudio para análise de voz.

## 📜 Licença

Este projeto é de código aberto e está licenciado sob a [MIT License](LICENSE). Sinta-se à vontade para contribuir ou adaptar o JFono às suas necessidades!

---

**JFono** - Cuidando da sua voz, um exercício de cada vez. 🎶