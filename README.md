# Drools Application - Avaliação de Fornecedores

Este projeto utiliza o Drools para definir e aplicar regras de negócios na avaliação de fornecedores com base em critérios como preço e qualidade. O sistema atribui pontuações a fornecedores de acordo com as regras definidas e determina se o fornecedor é aceito ou não, com base em sua pontuação.

## Estrutura do Projeto

### 1. Classes principais

#### `Fornecedor.java`
A classe `Fornecedor` contém os atributos principais relacionados a um fornecedor, como:
- **Nome**: O nome do fornecedor.
- **Preço**: O preço praticado pelo fornecedor.
- **Qualidade**: A qualidade do produto fornecido.
- **Pontuação**: A pontuação atribuída ao fornecedor com base nas regras.

A classe possui métodos para acessar e modificar os valores desses atributos, como `getNome()`, `getPreco()`, `getQualidade()`, e `getPontuacao()`.

#### `DroolsApplication.java`
A classe `DroolsApplication` é o ponto de entrada da aplicação e é responsável por:
1. Configurar o contêiner do Drools (`KieContainer`) e a sessão (`KieSession`).
2. Criar e inserir instâncias de `Fornecedor` na sessão do Drools.
3. Disparar as regras através do método `kieSession.fireAllRules()`.

#### `FornecedorRepository.java`
O repositório `FornecedorRepository` pode ser utilizado para simular uma base de dados de fornecedores, retornando uma lista com instâncias predefinidas para fins de teste. (Esta classe pode ser adicionada conforme a necessidade.)

### 2. Regras de Negócio

As regras de negócio são definidas no arquivo `rules.drl`, onde são aplicadas as regras relacionadas à avaliação dos fornecedores.

#### `rules.drl`
Este arquivo define as regras utilizando a linguagem Drools Rule Language (DRL). As regras principais incluem critérios de aceitação com base em preço e qualidade.

##### Regras implementadas:

1. **Regra "Avaliar Fornecedor com Preço Aceitável"**
   - Condição: O preço do fornecedor é inferior a 1000 e a qualidade do produto é maior ou igual a 8.
   - Ação: A pontuação do fornecedor é aumentada em 20 pontos e o fornecedor é aceito com boa qualidade.

2. **Regra "Fornecedor com Preço Muito Alto"**
   - Condição: O preço do fornecedor é superior a 1000.
   - Ação: A pontuação do fornecedor é reduzida e ele não é aceito, já que o preço é considerado muito alto.

3. **Regra "Fornecedor com Qualidade Ruim"**
   - Condição: A qualidade do fornecedor é inferior a 5.
   - Ação: A pontuação do fornecedor é reduzida devido à baixa qualidade do produto.

### 3. Configuração do Drools

O Drools é configurado através do contêiner de regras e a sessão:

- **KieContainer**: Responsável por carregar todas as configurações do Drools e inicializar o ambiente de execução das regras.
- **KieSession**: Gerencia as inserções de fatos (instâncias de `Fornecedor`) e dispara as regras quando necessário. A sessão utilizada no código é criada a partir da configuração definida no arquivo `kmodule.xml`.

### 4. Execução

Quando a aplicação é executada, os fornecedores são criados e inseridos na sessão do Drools. As regras são aplicadas conforme as condições estabelecidas no arquivo de regras (`rules.drl`).

Após a execução, o console exibe informações sobre os fornecedores avaliados, incluindo suas pontuações e mensagens sobre sua aceitação ou rejeição.

### 5. Exemplo de Saída

O programa pode imprimir mensagens no console como:


### 6. Possíveis Expansões

- Adicionar mais critérios para avaliação de fornecedores, como prazo de entrega ou confiabilidade.
- Integrar com um banco de dados para persistir as informações dos fornecedores.
- Implementar uma interface para visualização e gerenciamento dos fornecedores avaliados.

## Considerações

- Este projeto usa uma abordagem baseada em regras com o Drools, separando a lógica de negócios da lógica de aplicação.
- O uso do Drools facilita a manutenção e atualização das regras, além de permitir a fácil adição de novas regras sem modificar diretamente o código principal.

## Requisitos

- **Java 8+**
- **Drools 7.x**

## Como executar

1. Clone o repositório.
2. Compile e execute o projeto Java.
3. Verifique o console para ver os resultados da aplicação das regras de negócio.

```bash
$ mvn clean install
$ java -jar target/drools-application.jar
