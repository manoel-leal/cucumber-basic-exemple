import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	
	private int contador = 0;
	
	Date entrega = new Date();
	
	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente(){
	}

	@Quando("^executá-lo$")
	public void executáLo(){
	
	}

	@Entao("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() {

	}
	
	@Dado("^que o valor do contador é (\\d+)$")
	public void que_o_valor_do_contador_é(int arg1) {
	   contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {
	    contador += arg1;
	}

	@Entao("^o valor do contador deve ser (\\d+)$")
	public void o_valor_do_contador_deve_ser(int arg1) throws Throwable {
	   assertEquals(contador, arg1);
	}

	@Dado("^que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaÉDia(int dia, int mes, int ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("^a entrega atrasar em (\\d+) (.+)$")
	public void aEntregaAtrasarEmDias(int qnd, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, qnd);
			entrega = cal.getTime();
		} else if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, qnd);
			entrega = cal.getTime();
		}
	}

	@Entao("^a entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data)  {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		assertEquals(data, dataFormatada);
	}


}
