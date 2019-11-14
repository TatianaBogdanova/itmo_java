package com.ifmo.lesson11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class TopWords {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File(System.getProperty("user.dir") + "/src/main/java/com/ifmo/lesson11/"+ "wap.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

        System.out.println(top10Words(words));
     //   System.out.println(top10Phrases(lines));
        //System.out.println(charactersFrequency(lines));
    }

    public static Map<String, Integer> top10Words(List<String> lines) {
        // todo implement
        Map<String,Integer> result = new HashMap<String, Integer>();
        for (String temp: lines
             ) {
                if ( result.containsKey(temp)){
                    result.replace(temp, result.get(temp)+1);
                }
                else{
                    result.put(temp,1);
                }
        }

        Map <String,Integer> printResult = new HashMap<>();
        for (int i =0; i < 10; i++
             ) {
            Integer lenght =0;
            for ( String temp: result.keySet()
                 ) {
                if (result.get(temp) > lenght){
                    lenght = result.get(temp);
                }
            }
            for ( String temp: result.keySet()
            ) {
                if (result.get(temp) == lenght){
                    printResult.put(temp, lenght);
                    result.replace(temp, lenght,0);
                }
                if (printResult.size() >= 10){
                    return printResult;
                }
            }

        }


        return printResult;
    }
//
//    public static Map<String, Integer> top10Phrases(List<String> lines) {
//        // todo implement
//        return Map.of();
//    }
//
//    public static Map<String, Character> charactersFrequency(List<String> lines) {
//        // todo implement
//        return Map.of();
//    }
}
