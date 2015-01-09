import lombok.Getter;
import lombok.Setter;
import model.arquivo.Arquivo;

import java.io.IOException;

@Getter
@Setter
public class BaseFramework {
    public final static char TERMINAL = 'T';
    public final static char ARQUIVO = 'A';
    protected String script;
    protected String nomeProjeto;

    /**
     * Joga o script para uma saida, seja terminal ou model.arquivo texto
     *
     * @param saida - Tipo de saida: - T ~> Terminal - A ~> Arquivo
     */
    public void print(char saida, String extensao) throws IOException {
        switch (saida) {
            case 'T':
                System.out.println(this.script);
                break;

            case 'A':
                Arquivo arquivo = new Arquivo(this.nomeProjeto, "." + extensao);
                arquivo.escreverArquivo(this.script);
                arquivo.close();
                break;

            default:
                break;
        }
    }

    public BaseFramework() {
        this.script = "";
        this.nomeProjeto = "";
    }
}
