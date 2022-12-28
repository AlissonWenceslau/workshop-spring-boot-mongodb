# Web services API Restful com MongoDB

## Modelo de domínio
![Diagrama de Classes](assets/img/class_diagram.png)

> Trata-se de um projeto Web services com Java e Spring Boot no intuito de simular postagens e comentários

## Diagrama de objetos
![Diagrama de Objetos](assets/img/object_diagram.png)

### Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Você precisa compreender a linguagem Java, conceitos de POO (Encapsulamento, herança e polimorfismo)
* Você precisa compreender alguns projetos do ecossistema Spring
* Você precisa compreender o que é API Restful

### Tecnologias empregadas
- [x] Spring boot
- [x] Spring web
- [x] Spring data
- [x] Object Document Mapping (ODM)
- [x] API Restful
- [x] Banco de dados MongoDB

## Estrutura [Banco de dados MongoDB](https://www.mongodb.com/pt-br/what-is-mongodb)

Banco de dados totalmente contruído com **_ODM_**
#### Estrutura
![Banco de Dados](assets/img/bd_struct.png)
#### Tabela de Usuários
![Banco de Dados](assets/img/user_table.png)
#### Tabela de Posts
![Banco de Dados](assets/img/post_table.png)

<center> 
    <b>Banco de dados orientado a agregados.<br>
</center>
<br>

### Comando linux  MongoDB:
- Ligar o banco: `` sudo service mongod start``
- Desligar o banco: `` sudo service mongod stop``

### Imagens API Restful no [Postman](https://en.wikipedia.org/wiki/Postman_(software))

#### Verbos
![Post](assets/img/api_verbs.png)

#### Post
![Post](assets/img/api_post.png)

#### Get
![Get](assets/img/api_get.png)

#### Put
![Put](assets/img/api_put.png)

#### Delete
![Delete](assets/img/api_delete.png)

Para instalar o projeto, siga estas etapas:

Linux, macOS e Windows:
```
<git clone git@github.com:AlissonWenceslau/workshop-spring-boot-mongodb.git >
```
#### Próximo passo
* Importe o projeto na IDE _**Spring Tools Suite**_, e execute a classe 
``
WorkshopmongoApplication.java
`` dentro da pasta `src/main/java/com/alissonwenceslau/workshopmongo` | [Acessar pasta](src/main/java/com/alissonwenceslau/workshopmongo).

###### Redes Sociais:
[![Facebook](https://img.shields.io/badge/-Facebook-000000?style=flat-square&logo=facebook&logoColor=white&link=https://www.facebook.com/AlissonWenceslau/)](https://www.facebook.com/AlissonWenceslau/)
[![Linkedin](https://img.shields.io/badge/-LinkedIn-000000?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/alisson-wenceslau-b78b4aa3/)](https://www.linkedin.com/in/alisson-wenceslau-b78b4aa3/Twitter)
[![Twitter](https://img.shields.io/badge/-Twitter-000000?style=flat-square&logo=twitter&logoColor=white&link=https://twitter.com/AlissonWences)](https://twitter.com/AlissonWences)
