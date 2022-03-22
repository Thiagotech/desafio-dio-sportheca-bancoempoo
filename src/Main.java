import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("___________________");
		Date dataHoraAtual = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = formatar.format(dataHoraAtual);
		System.out.println(dataFormatada);
		System.out.println("-------------------");
		
		// System.out.println(dataHoraAtual);		
		
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago");
		
		Conta cc = new ContaCorrente(thiago);
		Conta poupanca = new ContaPoupanca(thiago);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
