package b7;

import java.util.*;

public class xau {
    private String str;

    public xau() {
    }

    public xau(String str) {
        this.str = str;
    }

    public void nhapXau() {
        System.out.print("nhap xau: ");
        Scanner scanner = new Scanner(System.in);
        this.str = scanner.nextLine();
    }

    public int getLength() {
        System.out.print("Do dai xau : ");
        return str.length();
    }

    public int demTu() {
        String[] results = str.split("\\s+");
        return results.length;
    }

    public int demCau() {
        String[] result = str.split("[\\.\\?\\!]");
        return result.length;
    }

    public void tachTu() {
        String[] strings = str.split("[\\s\\d]+");
        System.out.println("tach tu:");

        for (String i : strings) {
            System.out.println(i);
        }
    }

    public void tachSo() {
        String[] result = str.split("[a-zA-Z\\s]+");
        System.out.println("tach so:");

        for (String i : result) {
            if (i != "") System.out.println(i);
        }
    }

    public void tachKyTuDacBiet() {
        String[] result = str.split("[\\d\\sa-zA-Z]+");
        System.out.println("tach ky tu dac biet: ");
        for (String i : result) {
            if (i != "") System.out.println(i);
        }
    }

    public int sumOfDigit() {
        String[] result = str.split("[a-zA-Z\\s]+");
        int sum = 0;
        for (String i : result) {
            if (i != "") sum += Integer.parseInt(i);
        }
        return sum;
    }

    public void countWords() {
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (str == null) {
            return;
        }
        String[] result = str.split("[\\s\\,\\.\\?\\!]+");

        for (int i = 0; i < result.length; i++) {
            addWord(wordMap, result[i]);
        }
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }

    public static void addWord(Map<String, Integer> wordMap, String sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }

    public void typeMoreWord(){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        StringBuilder temp=new StringBuilder(str);
        temp.append(input);
        str=temp.toString();
        this.countWords();
    }
}