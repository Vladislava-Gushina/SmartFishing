package org.vladislava_g;

import java.util.*;

public class Pond{

    protected static void fishing(){
      String[] nameFish = {"Carp", "Perch", "Pike"};
      Random random = new Random();
      List<Fish> listNameFish = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listNameFish.add((new Fish(nameFish[random.nextInt(nameFish.length)], random.nextInt(2, 5), random.nextInt(10, 40))));
        }
        Collections.shuffle(listNameFish);

        int randomIndex = new Random().nextInt(listNameFish.size());
        String randomString = listNameFish.get(randomIndex).toString();

        System.out.println(" Рыба поймана" + "\n" + randomString );
    }
}


