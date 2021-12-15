package Template_Method.src;

public class TreinamentoInicio extends Treinamento{

    @Override
    public void preparoFisico() {
        System.out.println("Preparo físico de início da temporada...");
        
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de início da temporada...");
        
    }
    
}
