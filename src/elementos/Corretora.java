package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Corretora {

	private static final String HISTORICO_DE_ORDENS_TXT = "HistoricoDeOrdens.txt";

	// os arquivo de texto pra armazenar
	private BufferedWriter Writer;
	
	private BufferedReader Reader;

	private static int IdBase = 0;

	public Corretora() {

	public void enviarOrdem(AcaoAbstrata a, Investidor i) {
		i.adicionarPapel(a);
		

		try {
			Reader = new BufferedReader(new FileReader(HISTORICO_DE_ORDENS_TXT));

			char Id;
			
			if(Reader.readLine() == null) {
				Id = 0;
			} else {
			Id = Reader.readLine().charAt(0);
			}
			
			String Ordem = Id + ": Ordem " + ": " + a + " enviada para " + i;
			IdBase++;
			
			Writer = new BufferedWriter(new FileWriter(new File(HISTORICO_DE_ORDENS_TXT), true));
			
			Writer.write(ordem + "\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exibirOrdens() {
		try {
			Reader = new BufferedReader(new FileReader(HISTORICO_DE_ORDENS_TXT));
			
			if(Reader.readLine() == null) {
				System.out.println("Nenhuma ordem efetuada");
				return;
			}
			
			String Linha;
			
			while((Linha = Reader.readLine()) != null) {
				System.out.println(Linha);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
