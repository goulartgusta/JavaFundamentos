package exercicios.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulandoArq {

	public static void main(String[] args) {
		File diretorio = new File("/home/almaviva-linux/opt/dev/Projetos/JavaFundamentals/src/exercicios/copia/");
		diretorio.mkdir();
		File arquivoDuplicado = new File(diretorio, "Triangulo.java");
		
		try {
			if (arquivoDuplicado.createNewFile()) {
				System.out.println("Arquivo criado: " + arquivoDuplicado.getName());
			} else {
				System.out.println("O arquivo já existe.");
				System.out.println("Arquivo criado: " + arquivoDuplicado.getName());
			}
		} catch (IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}

		try (BufferedReader buffRead = new BufferedReader(new FileReader(
				"/home/almaviva-linux/opt/dev/Projetos/JavaFundamentals/src/exercicios/fundamentos/Triangulo.java"));
				BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivoDuplicado))) {
			String linha;
			while ((linha = buffRead.readLine()) != null) {
				if (linha.equals("package exercicios.fundamentos;")) {
					linha = linha.replace("package exercicios.fundamentos;", "package exercicios.copia;");
				}
				buffWrite.write(linha);
				buffWrite.newLine();
			}
			System.out.println("Arquivo copiado.");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro.");
			e.printStackTrace();
		}
	
			
		try {
		    ProcessBuilder processoJava = new ProcessBuilder("javac", "exercicios/copia/Triangulo.java");
		    processoJava.directory(new File("/home/almaviva-linux/opt/dev/Projetos/JavaFundamentals/src/"));
		    Process processoCompilaJava = processoJava.start();
		    processoCompilaJava.waitFor();

		    ProcessBuilder processoClass = new ProcessBuilder("java", "exercicios.copia.Triangulo");
		    processoClass.directory(new File("/home/almaviva-linux/opt/dev/Projetos/JavaFundamentals/src/"));
		    Process processoCompilaClass = processoClass.start();
		    processoCompilaClass.waitFor();

		    
		    BufferedReader reader = new BufferedReader(new InputStreamReader(processoCompilaJava.getInputStream()));
		    String linha;
		    while ((linha = reader.readLine()) != null) {
		        System.out.println(linha);
		    }
		    BufferedReader readerClass = new BufferedReader(new InputStreamReader(processoCompilaClass.getInputStream()));
		    String linhaClass;
		    while ((linhaClass = readerClass.readLine()) != null) {
		        System.out.println(linhaClass);
		    }

		    
		    BufferedReader errorReader = new BufferedReader(new InputStreamReader(processoCompilaJava.getErrorStream()));
		    while ((linha = errorReader.readLine()) != null) {
		        System.err.println(linha);
		    }
		    BufferedReader errorReaderClass = new BufferedReader(new InputStreamReader(processoCompilaClass.getErrorStream()));
		    while ((linha = errorReaderClass.readLine()) != null) {
		        System.err.println(linha);
		    }

		    int exitCode = processoCompilaJava.waitFor();
		    System.out.println("Código de saída: " + exitCode);
		} catch (IOException | InterruptedException e) {
		    System.out.println("Ocorreu um erro ao executar o processo.");
		    e.printStackTrace();
		}
		

	}
}