 <div id="top"></div> 

<br />
<div align="center">
  <a href="logo.gif">
    <img src="logo1.gif" alt="Logo" width="700" height="300" style="border-radius: 50%"/>
  </a>

  
  <h3 align="center">Projeto cientifico de buracos negros</h3>

  <h4 align="center">
     <br />
    <a href="https://github.com/othneildrew/Best-README-Template"><strong>Explore the docs »</strong></a>
    <br />
    <br />
     ·
    <a href="">Reportar Bug</a>
    ·
    <a href="">Soliciatar recurso</a>
  </p>
</div>

 <h3 align="center">
API REST de código aberto para dados de consulta e pesquisa, as informações contida foram desenvolvidas usando como base a estruturas da <a href="https://www.nasa.gov/subject/6893/nebulae/" target="_blank">NASA</a>
 e o laboratorio <a href="https://chandra.harvard.edu/photo/2007/orion/" target="_blank">Chandra</a> usando dados estruturais da base organizacional.
<p align="center">
 
<p align="center">
  <a href="https://github.com/Mario23junior/Galaxy-API/runs/7950437483?check_suite_focus=true"><img src="https://github.com/Mario23junior/Galaxy-API/actions/workflows/Maven.yml/badge.svg"></a>
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface%20-build-green.svg"></a>
</p>


## 🔩 Instruções para uso local

Clone o repositório:

Git:
```
$ git clone https://github.com/Mario23junior/Mapeamento-de-buracos-negros.git
```
Ou baixe um ZIP de main [manualmente](https://github.com/Mario23junior/Galaxy-API/archive/refs/heads/main.zip) e expanda o conteúdo em algum lugar em seu sistema

## 📋  Pré-requisitos

* Tenha um JDK Java instalado
* Tenha o Maven instalado e disponível em seu PATH ou IDE
* Tenha o google-chorme instalado
* Tenha um iterador de APIs para testes HTTP ex: [Postman](https://www.postman.com/downloads/), [Insonia](https://insomnia.rest/download)

## ⚛️ CLI

Abra o terminal de comando e verifique se todos os compartimentos necessários estão em seu devido path e atualizados:

```
$ java -versão
# ^ deve ser pelo menos *8
$ mvn -v
# ^ deve ser pelo menos 3.0.0
```
## ☑️ Verifique a instalação

Você pode verificar as compilações do projeto corretamente no seu IDE ou por linha de comando

Finalmente, verifique se `mvn install` foi bem sucedido.

``` Java
$ cd galaxy
$ mvn install
#...

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.api.galaxy GalaxyApplicationTests
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.357 sec
Running com.acme.app.GalaxyApplicationTests
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ app ---
[INFO] Building jar: galaxy-api/target/app-0.0.1-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ app ---
[INFO] Installing com.api.galaxy/target/app-0.0.1-SNAPSHOT.jar to /Users/justin/.m2/repository/com/acme/app/0.0.1-SNAPSHOT/app-0.0.1-SNAPSHOT.jar
[INFO] Installing com.api.galaxy/pom.xml to /Users/justin/.m2/repository/com/acme/app/0.0.1-SNAPSHOT/app-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.159 s
[INFO] Finished at: 2015-08-26T13:49:46-04:00
[INFO] Final Memory: 20M/177M
[INFO] ------------------------------------------------------------------------
```

Em seguida execute o arquivo `mvnw` na raiz do projeto no IntelliJ ou eclipse que ira iniciar a execução do projeto:

```
./mvnw
```

Você deve ver uma saída como a seguinte:

## 🔧 🔨 🛠  Construído com ⛏ 🪚 🔩 ⚙️

* [Java 18](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Spring boot](https://spring.io/projects/spring-boot)
* [H2](https://www.h2database.com/html/main.html)
* [Eclipse](https://www.eclipse.org/downloads/)
* [openJDK](https://maven.apache.org/)
* [NASA](https://solarsystem.nasa.gov/)

## 📄 Licença ##

Este projeto está sob a licença (GNU GPLv3) - [GNU GPLv3.md](https://www.gnu.org/licenses/gpl-3.0.pt-br.html)
