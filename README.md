# click-viagens
- [API-Heroku](#API-Heroku)
- [Contrato-Api](#contrato)
- .[Model](#model)

# Banco de dados
O H2 é um banco de dados Open Source que funciona em memória com um console acessível pelo browser dentro do contexto da aplicação. Por ser um banco de configuração rápida e fácil, decidi utiliza-lo.

# End-Points:
# GetMapping:
###### Busca todos os locais: /clickBus/v1/places
###### Busca por ID: /clickBus/v1/{id}
###### Busca por cidade e estado: /clickBus/v1/place/getCityAndState/{city}/{state}
###### Busca por cidade: /clickBus/v1/places/getCity/{city}
###### Busca por nome: /clickBus/v1/places/getName/{name}
###### Busca por nome e cidade: /clickBus/v1/places/getNameAndCity/{name}/{city}

# Post
###### Cadastrar Local: /clickBus/v1/place
###### Content Type: application/json
Exemplo:
<p align="center">
<img src="https://github.com/Jonathan16811/images/blob/master/post.png">
</p>

# PutMapping
###### Atualização: /clickBus/v1/{id}
###### Content Type: application/json
Exemplo:
<p align="center">
<img src="https://github.com/Jonathan16811/images/blob/master/update.png">
</p>

# DeleteMapping
###### Exclusão: /clickBus/v1/{id}
Parameter: {id}

# API-Heroku
Para utilizar os end-points da Api é necessário entrar no link abaixo e começar a fazer as chamadas nos end-points descritos a cima.
End-Point-heroku: https://gentle-basin-10620.herokuapp.com/swagger-ui.html#/
<p align="center">
<img src="https://github.com/Jonathan16811/images/blob/master/swagger.png.png">
</p>

# Model
<p align="center">
<img src="https://github.com/Jonathan16811/images/blob/master/model.png">
</p>

# contrato
https://gentle-basin-10620.herokuapp.com/v2/api-docs
<p align="center">
<img src="https://github.com/Jonathan16811/images/blob/master/contrato.png">
</p>
