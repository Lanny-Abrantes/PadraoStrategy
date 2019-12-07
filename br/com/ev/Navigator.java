package br.com.ev;

public class Navigator{
    
    private double origem, destino;
    
    public Navigator(double origem, double destino) {
        this.origem = origem;
        this.destino = destino;
    }
    public double getOrigem() {
        return origem;
    }
    public double getDestino() {
        return destino;
    }
    public double tempoDeRota(RouteStrategy route ) {
        return this.destino*60 / route.velocidade();
     }
}
