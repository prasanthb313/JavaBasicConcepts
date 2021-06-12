package BasicInJava;

public class StringExample {

	/* String[] transactions = { "purse", "purse", "belt", "jeans", "jeans"};
     String text = "";


     for (int i = 0; i <= transactions.length; i++) {
         int count = 1;
         for (int j = i + 1; j < transactions.length; j++) {
             if (transactions[i] == transactions[j]) {
                 if (!text.contains(transactions[i])) {
                     count++;
                     text += transactions[i] + ":" + count + ",";
                 }
                 else if(text.contains(transactions[i])){
                     count++;
                     text += transactions[i] + ":" + count + ",";
                 }
             } else if (!text.contains(transactions[i])) {
                 text += transactions[i] + ":" + count + ",";
             }
         }
     }
     String[] textArray = text.split(",");
     ArrayList<String> ss = new ArrayList<>(Arrays.asList(textArray));
     Collections.sort(ss);
     ArrayList<String> lastArray = new ArrayList<String>();
     ArrayList<String> lastArray2nd = new ArrayList<String>();
     for (String string : ss) {
         String ss1 = string.substring(string.length() - 1);
         if (Integer.parseInt(ss1) > 1) {
             lastArray.add(string);
         } else {
             lastArray2nd.add(string);
         }
     }
     lastArray.addAll(lastArray2nd);
     System.out.println(lastArray.toString().replace(":", " "));*/




}
