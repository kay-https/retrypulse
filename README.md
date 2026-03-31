# 🔁 RetryPulse

RetryPulse é uma API simples desenvolvida com **Java e Spring Boot** para demonstrar o uso do **Retry Pattern** em chamadas para serviços externos instáveis.

O objetivo do projeto é simular cenários onde uma API precisa lidar com falhas temporárias e tentar novamente antes de retornar erro ao usuário.

---

## 🚀 Tecnologias

- Java
- Spring Boot
- Maven
- REST API

---

## 📌 Conceito aplicado

### Retry Pattern

O **Retry Pattern** é utilizado para repetir automaticamente uma operação que falhou, principalmente quando dependemos de serviços externos.

Fluxo implementado neste projeto:

1. A API recebe uma requisição.
2. O sistema chama um serviço externo simulado.
3. Se ocorrer uma falha, o sistema tenta novamente.
4. O processo pode ocorrer até **3 tentativas**.
5. Caso todas falhem, um **fallback** é executado.

---

## ⚙️ Estrutura do Projeto
src/main/java/com/kay/retrypulse

controller
└── RetryController

service
└── RetryService

external
└── ExternalService


- **RetryController** → expõe o endpoint da API  
- **RetryService** → implementa a lógica de retry  
- **ExternalService** → simula um serviço externo instável  

---

## 🔗 Endpoint


GET /retry


Exemplo:


http://localhost:8080/retry


---

## 🧪 Testando a API

Você pode testar utilizando **Postman** ou navegador.

Possíveis respostas:


External service success!


ou


Fallback: external service unavailable


---

## 📚 Objetivo do projeto

Este projeto foi criado como parte de um estudo sobre **resiliência em sistemas backend**, explorando boas práticas para lidar com falhas em serviços externos.

---

## 👩‍💻 Autora

**Kayllanne Farias**

Desenvolvedora Back-End em formação focada em **Java e Spring Boot**.
