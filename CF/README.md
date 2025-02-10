# Compilar e Executar Programa Java no NetBeans


# Como Compilar e Executar o Programa Java

Este guia explica como compilar e executar um programa Java desenvolvido no NetBeans. O código-fonte está localizado no diretório `src/br/edu/views` e faz parte do pacote `br.edu.views`.

## 📌 Pré-requisitos

Antes de começar, certifique-se de ter instalado:

- [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (versão 8 ou superior)
- NetBeans IDE (opcional, caso queira editar o código no ambiente gráfico)

## 🛠 Compilação e Execução Manual pelo Terminal

Caso deseje compilar e executar o programa sem o NetBeans, siga estas etapas:

### 1️⃣ Abrir o Terminal

- **Windows**: Pressione `Win + R`, digite `cmd` e pressione `Enter`.
- **Linux/macOS**: Abra um terminal normalmente.

### 2️⃣ Navegar até o Diretório do Código-Fonte

Use o comando `cd` para acessar o diretório do projeto. Supondo que seu projeto está em `C:\Users\SeuUsuario\MeuProjeto` no Windows ou `~/MeuProjeto` no Linux/macOS, use:

```sh
cd Caminho/para/seu/projeto/src
```

### 3️⃣ Compilar os Arquivos Java

No terminal, execute o seguinte comando para compilar os arquivos dentro do pacote `br.edu.views`:

```sh
javac -d bin br/edu/views/*.java
```

Isso criará os arquivos `.class` dentro do diretório `bin`.

### 4️⃣ Executar o Programa

Agora, para rodar o programa, use:

```sh
java -cp bin br.edu.views.NomeDaClassePrincipal
```

Substitua `NomeDaClassePrincipal` pelo nome da classe que contém o método `main`.

## 🚀 Executando pelo NetBeans

Se quiser rodar o programa diretamente no NetBeans:

1. Abra o NetBeans e carregue o projeto.
2. No menu superior, clique em `Executar > Limpar e Construir Projeto`.
3. Para rodar o programa, clique em `Executar > Executar Projeto` ou pressione `Shift + F6`.

## ✅ Conclusão

Seguindo esses passos, você conseguirá compilar e executar seu programa Java manualmente pelo terminal ou utilizando o NetBeans.

Caso tenha dúvidas, consulte a documentação oficial do NetBeans ou do JDK.
```


