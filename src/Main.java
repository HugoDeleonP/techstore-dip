import service.RecuperadorDeSenha;
import service.ServicoEmail;
import service.ServicoSMS;

public class Main {

    public static void main(String[] args) {
        ServicoSMS servicoSMS = new ServicoSMS();
        ServicoEmail servicoEmail = new ServicoEmail();

        RecuperadorDeSenha recuperadorSMS = new RecuperadorDeSenha(servicoSMS);
        RecuperadorDeSenha recuperadorEmail = new RecuperadorDeSenha(servicoEmail);

        System.out.println("Recuperação via SMS:" );
        recuperadorSMS.recuperar("aaaa@teste.com");

        System.out.println("Recuperação via Email: ");
        recuperadorEmail.recuperar("bbbb@teste.com");

    }
}
