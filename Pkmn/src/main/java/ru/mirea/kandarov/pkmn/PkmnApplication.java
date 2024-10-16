package ru.mirea.kandarov.pkmn;


import ru.mirea.kandarov.pkmn.Card;
import ru.mirea.kandarov.pkmn.CardImport;

import java.io.IOException;

public class PkmnApplication {

    public static void main(String[] args) {

        String cardFilePath = "C:/Users/user/IdeaProjects/Pkmn/src/main/resources/my_card.txt";

        try {

            Card importedCard = CardImport.importCard(cardFilePath);


            System.out.println("Импортированная карта покемона:");
            System.out.println(importedCard);

        } catch (IOException e) {
            System.err.println("Ошибка при загрузке данных карты: " + e.getMessage());
        }
    }
}

