# microservice-micronaut
Microserviço de um CRUD de competências da aplicação Linketinder do programa de aceleração da ZG Soluções.

# ZG-Hero Project trilha (K3-T5): Micronaut Framework
  O desenvolvimento da aplicação teve como objetivo fazer o CRUD de competencias para a aplicação do <a href="https://github.com/hideki-abe/angular-spring-linketinder">Linketinder</a>
  
<h2>Frontend</h2>

O Frontend foi dividido nos seguintes módulos: 

  - cadastro(de empresas e candidatos)
  - competencia
  - inicial(contém o componente da página inicial)
  - perfil(de empresas e candidatos)
  - vaga
  
Para o microserviço de Competencias, as outras funcionalidades estão desabilitadas e os endpoints utilizados foram: 
  - http://*/candidato/competencias(Requisição GET e POST para as Competências)
  
Obs.: A aplicação não tem a lógica completa de relação candidato com a competência, pois está em microserviço. É necessário o microserviço de cadastro
para pegar o id do candidato, armazenar no localstorage e relacionar o candidato correspondente com a competência escolhida. 

<h3>Executando o projeto Angular</h3>

  Para executar o projeto Angular, abra o arquivo no caminho "frontend/view-linketinder" e execute o seguinte comando: "ng serve". Após isso, abra no navegador 
  o localhost na porta de execução.
  

<h2>Backend</h2>

O Backend está em um microserviço Micronaut com a entidade de Competencia, CandidatoCompetencia, sua View e Controllers apenas.

<h3>Executando o projeto Micronaut</h3>

  Para executar o projeto Micronaut, abra o projeto no Intellij, configure a aplicação e rode a API. 
  

<h3>Configuração do banco de dados</h3>

O banco de dados é o mesmo do projeto <a href="https://github.com/hideki-abe/angular-spring-linketinder">Linketinder</a>, com as configurações do 
Postgree no arquivo application.yml.

