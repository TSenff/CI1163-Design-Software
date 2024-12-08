
import java.util.Scanner;

public class Sistema {

    /* --- Handle Input --- */

    /* Na falta de um preprocessador, montamos as escolhas do switch como variaveis */
    /* Talvez seja mais elegante usar um enum. eu nao sei nada de java :p */

    private static final int FECHAR_SISTEMA                     = 0; 
    private static final int INICIAR_CADASTRAR_PROJETO          = 1; /* ECU 001 */
    private static final int INICIAR_CADASTRO_ETAPA_PROJETO     = 2; /* ECU 002 */
    private static final int INICIAR_CADASTRAR_ATIVIDADE        = 3; /* ECU 004 */
    private static final int INICIAR_CADASTRAR_ITEM_FISCAL      = 4; /* ECU 004 */
    private static final int INICIAR_GERAR_RELATORIO            = 5; /* ECU 007 */
    private static final int INICIAR_CADASTRAR_MEMBRO_DA_ECOMP  = 6; /* ECU 006 */
    private static final int INICIAR_SELECIONAR_PROJETO         = 7; /* ECU 003 */

    public static void imprimirMenu() {

        System.out.println("\n---------------------");
        System.out.println("   \033[92;1;4mSistema Ecomp\033[0m    ");
        System.out.println("---------------------");
        System.out.printf(" %d Sair\n",                  FECHAR_SISTEMA);
        System.out.printf(" %d Cadastrar Projeto\n",     INICIAR_CADASTRAR_PROJETO);
        System.out.printf(" %d Cadastrar Etapa\n",       INICIAR_CADASTRO_ETAPA_PROJETO);
        System.out.printf(" %d Cadastrar Atividade\n",   INICIAR_CADASTRAR_ATIVIDADE);
        System.out.printf(" %d Cadastrar item Fiscal\n", INICIAR_CADASTRAR_ITEM_FISCAL);
        System.out.printf(" %d Gerar Relatorio\n",       INICIAR_GERAR_RELATORIO);
        System.out.printf(" %d Cadastrar Membro\n",      INICIAR_CADASTRAR_MEMBRO_DA_ECOMP);
        System.out.printf(" %d Selecionar Projeto\n",    INICIAR_SELECIONAR_PROJETO);
        System.out.printf("---------------------\n\n");

    }

    /* Trata os inputs do usuario e chama a funcao responsavel por resolver o caso de uso */

    public static void main(String[] args) {

        Ecomp E = new Ecomp();

        ListaProjeto projList = new ListaProjeto();

        ListaRelatorio rltList = new ListaRelatorio();

        ListaAtividade atiList = new ListaAtividade();

        /* --- Handle IO --- */

        boolean running = true;

        Scanner input = new Scanner(System.in);

        imprimirMenu();


        do {
            System.out.print("Input: ");

            switch (input.nextInt()) {
                case FECHAR_SISTEMA:
                    running = false; break;

                case INICIAR_CADASTRAR_PROJETO:                 /* Luan */
                    E.iniciarCadastrarProjeto(); break;     

                case INICIAR_CADASTRO_ETAPA_PROJETO:            /* Luan */
                    E.iniciarCadastroEtapaProjeto(); break; 

                case INICIAR_CADASTRAR_ATIVIDADE:               /* Ramalho */
                    E.iniciarCadastrarAtividade(); break;   
                
                case INICIAR_CADASTRAR_ITEM_FISCAL:             /* Ramalho */
                    E.iniciarCadastrarItemFiscal(); break;

                case INICIAR_GERAR_RELATORIO:                   /* Senff */
                    E.iniciarGerarRelatorio(); break;       

                case INICIAR_CADASTRAR_MEMBRO_DA_ECOMP:         /* Feitosa */
                    E.iniciarCadastrarMembroEcomp(); break;

                case INICIAR_SELECIONAR_PROJETO:                /* Feitosa */
                    E.iniciarSelecionarProjeto(); break;

                default:
                    System.out.println("Invalido"); break;
            }

        } while (running);


    }
}
