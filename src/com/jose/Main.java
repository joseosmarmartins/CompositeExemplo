package com.jose;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IRefrigeranteMaquina> refrigeranteMaquinaList = new ArrayList<>();

        CocaCola cocaCola = new CocaCola();
        Fanta fanta = new Fanta();
        Mineiro mineiro = new Mineiro();

        refrigeranteMaquinaList.add(fanta);
        refrigeranteMaquinaList.add(mineiro);

        for (IRefrigeranteMaquina maquinaRefrigerante : refrigeranteMaquinaList) {
            maquinaRefrigerante.saiuDaMaquina();
        }
    }
}
