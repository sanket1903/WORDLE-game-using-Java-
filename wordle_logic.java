/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanke
 */
import java.util.ArrayList;
public class wordle_logic {
    static int wordSize;
    static ArrayList<String> answer = new
            ArrayList<>();

    wordle_logic() {
        answer.add("s");
        answer.add("a");
        answer.add("n");
        answer.add("k");
        answer.add("e");
        answer.add("t");


        wordSize = answer.size();
    }

    static boolean matchExactLetter(int i) {

        if (wordle.tff.get(i).getText().equals(answer.get(i)
        )) {
            return true;
        }
        return false;
    }

    static boolean matchLetter(int i) {
        if (answer.contains(wordle.tff.get(i).getText())) {
            return true;
        }
        return false;
    }
}
