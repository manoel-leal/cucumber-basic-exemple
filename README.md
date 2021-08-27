# selenium-cucumber-exemple
A exemple test automation project with cucumber and selenium webdriver (Java). 

# Requirements

* Java 8 (jdk8)
* Maven (mvn)
* cucumber-java (info.cukes)
* cucumber-junit (info.cukes)

# Project config

```
	<properties>
	 	<maven.compiler.target>1.8</maven.compiler.target>
         	<maven.compiler.source>1.8</maven.compiler.source>
        	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

```

# Cucumber execution status

* pending
* skipped
* failure
* passed
* undefined

# Feature basic exemple

```
#language:pt
Funcionalidade: Aprender Cucumber
  
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação

  Cenário: Deve executar a especificação
    Dado que criei o arquivo corretamente
    Quando executá-lo
    Então a especificação deve finalizar com sucesso

```

Obs: for change the gherkin's file language, in first line add the tag #language:<language_code>

