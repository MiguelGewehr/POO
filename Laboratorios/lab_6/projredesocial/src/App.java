import redesocial.IdentificadorInvalido;
import redesocial.RedeSocial;
import redesocial.Usuario;

/**
 * @plantuml
 * class A
 * @enduml
 */

public class App {
    public static void main(String[] args)  {
        RedeSocial r = new RedeSocial();
        Usuario sicrano = r.criaUsuario("Sicrano");
        Usuario fulano = r.criaUsuario("Fulano");
        Usuario maria = r.criaUsuario("Maria");

        sicrano.addAmigo(fulano);
        sicrano.addAmigo(maria);
        maria.addAmigo(fulano);

        // System.out.println("Digite um número de 1 a 10:");
        // boolean lidoComSucesso=false;
        // do 
        // {
        //     String stringLida = System.console().readLine();
        //     try {
        //         int i=Integer.parseInt(stringLida);
        //         if ((i>=1) && (i<11)) {
        //             lidoComSucesso=true;
        //             i++;
        //             System.out.println(i);
        //         }
        //     } catch (NumberFormatException e)
        //     {
        //         System.out.println("Número inválido, digite novamente.");
        //     }
        // }
        // while (!lidoComSucesso);

        try {
            Usuario u = r.getUsuario(10008);
            System.out.println("Não houve erro na linha anterior.");
            System.out.println(u.getNome());
        } 
        catch (IdentificadorInvalido e)
        {
            System.out.println("Identificador de usuário inválido.");
            e.printStackTrace();
        }



    }
}
