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

# Runner tests junit + cucumber

For execute the tests we need create a class Runner that link the cucumber with junit execution

```

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class Runner {
	
}

```

# Regex

Regular Expression is a String pattern for generic expressions, example:

**(\d+) is a regex that indicates any numeric character has 1 or more digits.**

On Cucumber, for work with steps parameters, it need regex in steps String:

```
	@Entao("^o valor do contador deve ser (\\d+)$")
	public void o_valor_do_contador_deve_ser(int arg1) throws Throwable {
	   assertEquals(contador, arg1);
	}

```

**Obs: Regular expression inicialize with ^ and end with ?**

# References

* https://jex.im/regulex/#!flags=&re=%5E(a%7Cb)*%3F%24
* https://regex101.com/
