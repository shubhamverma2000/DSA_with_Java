package slidingWindow;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAnagramsofText {

    private static int findPatOccurances(String txt, String pat) {
        Map<Character, Integer> patChars = new HashMap<>();

        for (char c : pat.toCharArray()) {
            patChars.put(c, patChars.getOrDefault(c, 0) + 1);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evens = numbers.stream()
                .filter(item -> item % 2 == 0)
                .collect(Collectors.toList());

        List<String> names = Arrays.asList("alice", "bob", "charlie");
        names.contains("alice");
        List<String> captials = names.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());

        List<String> words = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        Long count = words.stream().filter(item -> item.startsWith("a")).count();

        List<Integer> nums = Arrays.asList(10, 35, 22, 5, 98, 42);

        Optional<Integer> maxElement = nums.stream().max(Integer::compareTo);

        int maxValue = maxElement.orElse(0);

        List<Integer> nums1 = Arrays.asList(10, 35, 22, 5, 98, 41);

        int sum = nums1.stream().filter(item -> item % 2 != 0).mapToInt(Integer::intValue).sum();

        List<String> fruits = Arrays.asList("banana", "apple", "orange", "apple", "banana", "kiwi");
        List<String> sortedUniqueFruits = fruits.stream().distinct().sorted().collect(Collectors.toList());

        List<Integer> nums2 = Arrays.asList(2, 5, 8, 11, 14, 3);

        String txt2 = nums2.stream().filter(item -> item % 2 == 0).map(String::valueOf).collect(Collectors.joining(","));

        List<String> words1 = Arrays.asList("one", "two", "three", "four", "six", "seven");

        words1.stream().collect(Collectors.groupingBy(String::length));


        List<String> names1 = Arrays.asList("alice", "bob", "brad", "charlie", "bryan");
        Optional<String> firstName = names1.stream().filter(item -> item.startsWith("b")).findFirst();
        String ansFirst = firstName.orElse("no String");


        List<Integer> numbersArray = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Map<Boolean, List<Integer>> evenOddArray = numbersArray.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));


        List<String> fruits1 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> fruitCount = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<String> longestwords = Arrays.asList("ant", "elephant", "dog", "giraffe", "bat");

        Optional<String> longest = longestwords.stream().max(Comparator.comparingInt(String::length));
        String result = longest.orElse("No words found");

        List<Integer> nums4 = Arrays.asList(2, 3, 3, 4, 5, 2);

        List<Integer> results = nums4.stream().distinct().map(item -> item * item).sorted().collect(Collectors.toList());

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("David", "Finance"),
                new Employee("Eve", "IT")
        );

        Map<String, List<String>> listOfEmployees = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.mapping(Employee::getName,
                                        Collectors.toList())));

    }

    static class Employee {
        String name;
        String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
// constructor, getters, etc.
    }




    public static void main(String[] args){
       String txt = "forxxorfxdofr";
        String pat="for";
        System.out.println(findPatOccurances(txt, pat));
    }
}





//           e=s+k-1;
//           Boolean found = false;
//           for(int i=s; i<=e; i++){
//               if(array[i]<0){
//                   ans.add(array[i]);
//                   found =true;
//                   break;
//               }
//           }
//           if(!found){
//               ans.add(0);
//           }
//           e++;
//           s++;


