# 🧮 Projeto: Cálculo de IMC com POO em Java

## 🎯 Objetivo do Projeto
Este projeto foi desenvolvido como parte da disciplina de **Programação Orientada a Objetos (POO)**, com o objetivo de aplicar os conceitos fundamentais da POO — **encapsulamento, herança e polimorfismo** — na criação de um programa em **Java** que calcula o **Índice de Massa Corporal (IMC)** de pessoas e atletas.

O projeto demonstra a diferença no cálculo do IMC entre uma pessoa comum e um atleta de alto rendimento, considerando o nível de atividade física.

---

## 🧩 Estrutura do Projeto

### 📘 Classe `Pessoa`
A classe **Pessoa** é a classe base que representa uma pessoa genérica.

**Atributos:**
- `nome` — nome da pessoa  
- `peso` — peso corporal (em kg)  
- `altura` — altura (em metros)

**Métodos principais:**
- `obterImc()` — calcula o IMC com a fórmula:  
  ```
  IMC = peso / (altura * altura)
  ```
- Métodos `get` e `set` para acesso controlado aos atributos (encapsulamento)
- `toString()` — retorna uma representação textual do objeto

---

### 🏋️ Classe `Atleta`
A classe **Atleta** herda de `Pessoa` e representa indivíduos que praticam esportes regularmente.

**Atributos adicionais:**
- `Esporte espotePraticado` — tipo de esporte praticado (ex: Futebol, Basquete, Natação etc.)
- `NivelAtividade nivelAtividade` — enum que representa a intensidade do nível de atividade física (MODERADO, INTENSO ou EXTREMO)

**Sobrescrita de método (`@Override`):**
- `obterImc()` — ajusta o valor do IMC para atletas com **nível de atividade INTENSO ou EXTREMO**, reduzindo o valor em **5%**, para representar diferenças na composição corporal.

Exemplo do ajuste:
```java
if (nivelAtividade == NivelAtividade.INTENSO || nivelAtividade == NivelAtividade.EXTREMO) {
    return imcSimples - (imcSimples * 0.05);
}
```

---

### ⚙️ Enum `Esporte`
Enum responsável por listar diferentes tipos de esportes, cada um com uma descrição amigável:
```java
FUTEBOL("Futebol"),
BASQUETE("Basquete"),
VOLEI("Vôlei"),
...
```
Inclui o método `getDescricao()` para obter o nome legível do esporte.

---

### 🏃 Enum `NivelAtividade`
Enum que define o **nível de atividade física** do atleta, influenciando o cálculo do IMC.

**Constantes:**
- `MODERADO` — Exercícios regulares ou trabalho ativo  
- `INTENSO` — Treinamento físico intenso ou trabalho físico pesado  
- `EXTREMO` — Atividade física de alto desempenho  

Cada constante possui uma descrição e detalhes complementares.

---

### 💻 Classe `Main`
A classe principal **Main** é responsável por instanciar e testar os objetos.

**Principais ações executadas:**
- Criação de diversos objetos `Pessoa` e `Atleta`
- Configuração de atributos por construtor e via métodos `set`
- Exibição dos dados e do cálculo do IMC no console

**Exemplo de saída esperada:**
```
Pessoa{nome='José Cláudio', peso=65.0, altura=1.77}
IMC: 20.76
Atleta{nome='Rafael Veiga', peso=60.0, altura=1.74, espotePraticado=FUTEBOL, nivelAtividade=INTENSO}
IMC: 19.81
```

O programa demonstra **polimorfismo**, pois objetos do tipo `Pessoa` e `Atleta` utilizam o mesmo método `obterImc()` de formas diferentes conforme o tipo do objeto.

---

## 🧠 Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
|-----------|----------------------|
| **Encapsulamento** | Uso de modificadores de acesso e métodos getters/setters para proteger os atributos. |
| **Herança** | A classe `Atleta` herda atributos e métodos da classe `Pessoa`. |
| **Polimorfismo** | O método `obterImc()` é sobrescrito em `Atleta`, alterando seu comportamento sem mudar a forma de chamada. |

---

## 🚀 Tecnologias Utilizadas
- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos (POO)  
- **Versão:** JDK 21  
- **IDE:** IntelliJ IDEA  

## 👨‍💻 Autor
**Samuel Dias da Silva Dantas**  
Projeto desenvolvido como trabalho prático da disciplina de **Programação Orientada a Objetos (POO)**.
