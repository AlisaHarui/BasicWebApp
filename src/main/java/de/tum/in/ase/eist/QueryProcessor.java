package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Ad";
        } else if (query.contains("plus")) {
            String[] numbers = query.split(" plus ");
            char[] chars1 = numbers[0].toCharArray();
            char[] chars2 = numbers[1].toCharArray();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (char c : chars1) {
                if (Character.isDigit(c)) {
                    sb1.append(c);
                }
            }

            for (char c : chars2) {
                if (Character.isDigit(c)) {
                    sb2.append(c);
                }
            }
//            int num1 = new Integer(sb1.toString());
//            new Integer(sb2.toString());
            return "" + sb1 + sb2;
        }
        return "";
    }
}
