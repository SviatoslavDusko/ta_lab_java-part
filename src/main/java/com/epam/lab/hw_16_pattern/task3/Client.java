package com.epam.lab.hw_16_pattern.task3;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;
import com.epam.lab.hw_16_pattern.task3.bouquet.impl.birthday.BirthAnniversaryBouquet;
import com.epam.lab.hw_16_pattern.task3.bouquet.impl.custom.CustomBouquet;
import com.epam.lab.hw_16_pattern.task3.bouquet.impl.funeral.FuneralBouquet;
import com.epam.lab.hw_16_pattern.task3.constants.Flowers;
import com.epam.lab.hw_16_pattern.task3.decorator.BouquetDecorator;
import com.epam.lab.hw_16_pattern.task3.decorator.abstr.delivery.BicycleDelivery;
import com.epam.lab.hw_16_pattern.task3.decorator.abstr.delivery.CarDelivery;
import com.epam.lab.hw_16_pattern.task3.decorator.abstr.discount_card.GoldCard;
import com.epam.lab.hw_16_pattern.task3.decorator.abstr.flower.FlowersAdditional;

public class Client {
    public static void main(String[] args) {

        Bouquet birthAnniversary = new BirthAnniversaryBouquet();
        BouquetDecorator carDelivery = new CarDelivery();
        BouquetDecorator goldCard = new GoldCard();
        BouquetDecorator add10roses = new FlowersAdditional(Flowers.ROSE, 10);

        carDelivery.setBouquet(birthAnniversary);
        goldCard.setBouquet(carDelivery);
        add10roses.setBouquet(goldCard);

        System.out.println(add10roses);
        //------------------------

        Bouquet myBouquet = new CustomBouquet();
        BouquetDecorator add = new FlowersAdditional(Flowers.ASTER, 10);
        BouquetDecorator add2 = new FlowersAdditional(Flowers.ROSE, 10);
        BouquetDecorator add3 = new BicycleDelivery();

        add.setBouquet(myBouquet);
        add2.setBouquet(add);
        add3.setBouquet(add2);

        System.out.println(add3);
        //------------------------

        Bouquet funeralBouquet = new FuneralBouquet();
        BouquetDecorator add2roses = new FlowersAdditional(Flowers.ROSE, 2);

        add2roses.setBouquet(funeralBouquet);

        System.out.println(add2roses);
    }
}
