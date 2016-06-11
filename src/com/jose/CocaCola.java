package com.jose;

public class CocaCola implements IRefrigeranteMaquina {

    @Override
    public void saiuDaMaquina() {
        System.out.println("Escolhido o refrigerante: Coca-Cola");
    }
}
