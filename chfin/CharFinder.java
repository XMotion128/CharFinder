package chfin;

import java.util.Scanner;
import java.util.Vector;

public class CharFinder {

    public int charCount(String phrase, char letter) {

        int letterCounter = 0;

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.charAt(i) == letter) {

                letterCounter++;

            }
        }

        return letterCounter;

    }

    public String charPos(String phrase, char letter) {

        Vector<Integer> positions = new Vector<>(1, 1);

        String returnNumber = new String();

        int index = 0;

        for (int i = 0; i < phrase.length(); i++) {

            if (phrase.charAt(i) == letter) {

                positions.add(index, i);

                index++;

            }

        }

        returnNumber = positions.toString();

        return returnNumber;
    }

}
