package database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FichaDatabase {
	
	public FichaDatabase() {
		super();
	}
	public void writing(String s) {
        try {
            //Whatever the file path is.
            File dados = new File("C:/Utilizadores/portatil/workspace/ESS-IPVC/res/dados.txt");
            FileOutputStream is = new FileOutputStream(dados);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(s);
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }
}
