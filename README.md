<div align="center">

![](https://img.shields.io/badge/Status-Em%20Desenvolvimento-orange)
</div>

<div align="center">

# POC - Micronaut, Kotlin, Schema Registry, Apache Avro e Apache Kafka .
Trata-se de uma aplicação de prova de conceito para desenvolver um consumer e um producer kafka utilizando arquitetura: Micronaut, Kotlin, Schema Registry, Apache Avro e Apache Kafka ..

![](https://img.shields.io/badge/Autor-Wesley%20Oliveira%20Santos-brightgreen)
![](https://img.shields.io/badge/Language-Kotlin-brightgreen)
![](https://img.shields.io/badge/Framework-Micronaut-brightgreen)
![](https://img.shields.io/badge/Framework-Apache%20Avro-brightgreen)
![](https://img.shields.io/badge/Message%20Broker-Apache%20Kafka-brightgreen)

</div> 

## Fundamentos teóricos

> Micronaut: Microunaut é um framework baseado na JVM para criação de micros-serviços inspirado pelo Spring e Grails e permite a criação de aplicações utilizando Java, Kotlin ou Groovy.

> Apache Kafka: Apache Kafka é uma plataforma open-source de processamento de streams desenvolvida pela Apache Software Foundation, escrita em Scala e Java. O projeto tem como objetivo fornecer uma plataforma unificada, de alta capacidade e baixa latência para tratamento de dados em tempo real.

> Schema Registry: O Schema Registry valida se a mensagem que está sendo enviada por uma aplicação é compatível. Podemos usar vários formatos de arquivos para criar os nossos schemas como XML, CSV, JSON mas aqui usaremos Apache Avro que é um formato desenvolvido para criação de schemas com tipagem.

> Apache avro: O Avro é uma estrutura de serialização de chamada e procedimento remoto orientada a linhas, desenvolvida no projeto Hadoop do Apache. Ele usa JSON para definir tipos e protocolos de dados e serializa dados em um formato binário.

> Kotlin: Kotlin é uma Linguagem de programação multiplataforma, orientada a objetos e funcional, concisa e estaticamente tipada, desenvolvida pela JetBrains em 2011, que compila para a Máquina virtual Java e que também pode ser traduzida para a linguagem JavaScript e compilada para código nativo.

## Tecnologias
- Kotlin 1.4.30
- Micronaut 2.3.4
    - micronaut-validation
    - micronaut-kotlin-runtime
    - micronaut-http-client
    - micronaut-kafka
    - logback-classi
    - jackson-module-kotlin
    - micronaut-test-kotest
- avro
- kafka-schema-registry-client
- kafka-streams-avro-serde
- kafka-avro-serializer
- GIT

## Execução

A execução das aplicações são feitas através do de um comando Gradle que envoca a inicialização do Micronaut.

- Scripts
  ### Executar docker-compose
    - 1° comando: ``` cd src/main/docker/```
    - 2° comando: ```docker-compose -f docker-compose.yml up```
  ### Executar a aplicação
    - 1° comando: ``` ./gradlew build```
    - 2° comando: ```./gradlew run```

## Utilização
  - Schema Registry para validar schemas avro cadastrados e versões: http://localhost:8001   
  - Efetuar uma requisição REST com verbo POST na seguinte URL: http://localhost:8080/api/events/publish
  - Payload
      ``` 
           {
              "name": "wesley",
              "age": 29,
              "cpf": "00000000000"     
            }
    
