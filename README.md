# Desafio

Métodos implementados para o processo seletivo.

Os métodos devem utilizar somente as bibliotecas nativas JEE.

Endpoints REST com Spring Boot são um diferencial

## Como começar

### Pré-requisitos

* Java 8

### Obtendo o pacote

    git clone https://github.com/klimber/desafioProJ.git

### Executando

Um wrapper do gradle é incluído na aplicação, para utilizá-lo:

    cd desafioProJ
    ./gradlew bootrun

## APIs

Ao executar o programa, as APIs estarão disponíveis nos seguintes endereços

* findArray
	* Disponível no endpoint http://127.0.0.1:8080/findArray, recebe @RequestParam array e @RequestParam subArray. Exemplo: `http://127.0.0.1:8080/findArray?array=1,2,5,7,8&subArray=2,5` deverá retornar 1
* findChar
	* Disponível no endpoint http://127.0.0.1:8080/findChar, recebe um @RequestBody String. Exemplo usando curl: `curl --request GET 127.0.0.1:8080/findChar -d stress` deve retornar "t"
* custoCargo
	* Disponível no endpoint http://127.0.0.1:8080/custoCargo, recebe um @RequestBody List\<Funcionario>. Exemplo no Insomnia:
	
	![Insomnia](https://i.ibb.co/VN6fjNd/Arch-Labs-2019-05-30-08-1366x768.png)
	
* custoDepartamento
	* Disponível no endpoint http://127.0.0.1:8080/custoCargo, recebe um @RequestBody List\<Funcionario>. 


## Testando

Foram implementados alguns testes durante o desenvolvimento do desafio, atingindo o coverage a seguir:

![Coverage](https://i.ibb.co/bsZqBkG/Arch-Labs-2019-05-30-55-1366x768.png)

### Tipos de teste

Até o momento somente testes unitários foram implementados, e mesmo estes não cobrem todos os casos

## Softwares Utilizados

 - [Spring Tools 4](https://spring.io/tools)
 - [Gradle](https://gradle.org/)
 - [Spring Boot](https://start.spring.io/)
 - [Insomnia](https://insomnia.rest/)

> Written with [StackEdit](https://stackedit.io/).

