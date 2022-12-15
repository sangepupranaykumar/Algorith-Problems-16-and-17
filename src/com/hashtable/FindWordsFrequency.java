package com.hashtable;
import java.util.HashMap;
import java.util.Set;
public class FindWordsFrequency {
    static void userInputSentence(String userString)
    {
        HashMap<String, Integer> frequency = new HashMap<String,Integer>();
        String[] words = userString.split(" ");
        for (String word : words)
        {
            if (frequency.containsKey(word))
            {
                frequency.put(word, frequency.get(word) + 1);
            }
            else
            {
                frequency.put(word, 1);
            }
        }
        Set<String> stringFrequency = frequency.keySet();
        System.out.println("Frequency Of Each word in Sentence: \n 'To Be Or Not To Be'");
        for (String word : stringFrequency)
        {
            System.out.println(word + " = " + frequency.get(word) + " times.");

        }
    }

    public static void main(String[] args)
    {
        userInputSentence("To Be Or Not To Be");
    }
}
