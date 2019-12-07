package br.com.ev;
public class Main {
   
    public static void main(String[] args) {
        
        Navigator navegador = new Navigator(0, 50);
        RouteStrategy carro = new Carro();
        RouteStrategy ape = new APe();
        RouteStrategy transP = new TransPublico();
        RouteStrategy bike = new Bicicleta();
        
        System.out.println("Na navegação, da posição inicial  " + navegador.getOrigem()
                + "km para " + navegador.getDestino() + "km");
        System.out.println("De carro gasta: " + navegador.tempoDeRota(carro)+" minutos");
        System.out.println("De transporte publico gasta: " + navegador.tempoDeRota(transP)+" minutos");
        System.out.println("A pé gasta: " + navegador.tempoDeRota(ape)+" minutos");
        System.out.println("De bike gasta: " + navegador.tempoDeRota(bike)+" minutos");   
    }
}
