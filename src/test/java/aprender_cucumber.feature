#language:pt
Funcionalidade: Aprender Cucumber
  
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar a especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Entao a especificação deve finalizar com sucesso
    
  Cenário: Deve incrementar contador
  	Dado que o valor do contador é 15
  	Quando eu incrementar em 3
  	Entao o valor do contador deve ser 18
