/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ev;

/**
 *
 * @author Lanny Abrantes
 */
public class Carro implements RouteStrategy{

    //Navigator destino
    @Override
    public double velocidade() {
        return 80;       

     /*Caso seja calculado nessa classe será inserido o parametro Navigator
        Calculo = DISTANCIA * TEMPO / VELOCIDADE;
        //return navigator.getDestino * 60 / VELOCIDADE;
        */
    }
}
