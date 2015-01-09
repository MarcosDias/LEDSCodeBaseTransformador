package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    private FileWriter fw;
    private BufferedWriter escritor;

    /**
     * Escreve texto em model.arquivo
     *
     * @param texto
     * @throws java.io.IOException
     */
    public void escreverArquivo(String texto) throws IOException {
        this.escritor.write(texto);
    }

    /**
     * Fecha o objeto
     *
     * @throws java.io.IOException
     */
    public void close() throws IOException {
        if (this.escritor != null)
            this.escritor.close();
        if (this.fw != null)
            this.fw.close();
    }

    /**
     * Construtor
     *
     * @param nome     - Nome do model.arquivo
     * @param extensao - Extensao do model.arquivo
     * @throws java.io.IOException
     */
    public Arquivo(String nome, String extensao) throws IOException {
        this.fw = new FileWriter("model/arquivo/" + nome + extensao);
        this.escritor = new BufferedWriter(this.fw);
    }
}
