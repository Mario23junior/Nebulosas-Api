<p align="center"><img src="img/logo-api.gif" width = "3323px" height="333px"></p>

<h1 align="center">API-Nebulosa</h1>

<h3 align="center">
API REST de código aberto para dados de consulta de  pesquisa  as informações nela contida  foi desenvolvida usando como base nos dados da <a href="https://www.nasa.gov/subject/6893/nebulae/" target="_blank">NASA</a>
 e <a href="https://chandra.harvard.edu/photo/2007/orion/" target="_blank">Chandra</a> usando como base organizacional um sistema de CRUD
<p align="center">
 
<a href="https://www.travis-ci.com/github/Mario23junior/Api-Nebulosas/pull_requests" target="_blank"><img src="https://www.travis-ci.com/Mario23junior/Api-Nebulosas.svg?branch=main">
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square" target="_blank"></a>
</p>

## Etapas para testar ou reproduzir

## Primeiro execute o maven 
 
```
 mvn package
```
## Em seguida faça
```
java -jar target/ApiNebulosa-API-1.0-SNAPSHOT.jar

```
## Para obter mais detalhes da documentação acesso o swagger
```
http://localhost:8080/swagger-ui.html
```

## Uso

```
http://localhost:8080/v1/api/listall/
```

## Resultado dos dados da API

```
 [
   {
      "id":1,
      "urlImage":"https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Orion_Nebula_-_Hubble_2006_mosaic_18000.jpg/1200px-Orion_Nebula_-_Hubble_2006_mosaic_18000.jpg",
      "nome":"nebulosa de Orion",
      "costelacao":"Orion",
      "escala":5.5,
      "categoria":"Estrelas normais e aglomerados de estrelas",
      "fatosInformacaoDto":[
         {
            "id":2,
            "dataDeObrservacao":"21/01/2003",
            "tempoDeObservacao":223.0,
            "codigoDeCores":"X-ray: (Blue, yellow, orange); Optical (red-purple)",
            "estimativaDeDistanciaEmLuz":1500.0
         }
      ],
      "baseRelatoDto":[
         {
            "id":3,
            "coDeNome":"M42",
            "instrumento":"ACIS",
            "dataDeLancamento":"03/10/2003",
            "creditos":"Raios-X: NASA / CXC / Penn State / E.Feigelson & K.Getman et al .; Ótico: NASA / ESA / STScI / M. Robberto et al."
         }
      ]
   }
]

```
