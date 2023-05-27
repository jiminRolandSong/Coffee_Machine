import java.util.*;
class Main {

    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String[] firstLetters = first.split("");
        String[] secondLetters = second.split("");
        SortedMap<String,Integer> firstMap = new TreeMap<>();
        SortedMap<String,Integer> secondMap = new TreeMap<>();
        for (String s : firstLetters){
            String n = s.toLowerCase(Locale.ROOT);
            if (firstMap.containsKey(n)){
                int now = firstMap.get(n);
                firstMap.remove(n);
                firstMap.put(n, now + 1);
            } else{
                firstMap.put(n,1);
            }
        }
        for (String s : secondLetters){
            String n = s.toLowerCase(Locale.ROOT);
            if (secondMap.containsKey(n)){
                int now = secondMap.get(n);
                secondMap.remove(n);
                secondMap.put(n, now + 1);
            } else{
                secondMap.put(n,1);
            }
        }
        if (firstMap.equals(secondMap)) System.out.println("yes");
        else System.out.println("no");
    }
}