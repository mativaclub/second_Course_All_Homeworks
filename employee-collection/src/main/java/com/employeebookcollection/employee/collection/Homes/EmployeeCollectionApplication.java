package com.employeebookcollection.employee.collection.Homes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCollectionApplication.class, args);
	}

}












//    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        List<String> words = new ArrayList<>(List.of("прыг", "скок", "мяу", "квак", "прыг", "скок", "рык"));
//        printOddNumbers(nums);
//        System.out.println();
//        printUniqueEvenNumbers(nums);
//        System.out.println();
//        printUniqueWords(words);
//        System.out.println();
//        printDoublesSize(words);


//    public static void printOddNumbers(List<Integer> nums) {
//        for (int num : nums) {
//            if (num % 2 != 0) {
//                System.out.print(num + " ");


//    public static void printUniqueEvenNumbers(List<Integer> nums) {
//        List<Integer> uniqueEvenNumbers = new ArrayList<>(Set.copyOf(nums));
//        Collections.sort(uniqueEvenNumbers);
//        uniqueEvenNumbers.removeIf(num -> num % 2 != 0);
//        for (Integer num:uniqueEvenNumbers) {
//                System.out.print(num + " ");


//    public static void printUniqueWords(List<String> words) {
//        Set<String> uniqueWords = new HashSet<>(words);
//        List<String> duplicates = new ArrayList<>(words);
//        for (String uniqueWord:uniqueWords) {
//            duplicates.remove(uniqueWord);
//        }
//        uniqueWords.removeAll(duplicates);
//        System.out.println(uniqueWords);
//    }
//
//    public static void printDoublesSize(List<String> words) {
//        Set<String> doubles = new HashSet<>(words);
//        System.out.println(words.size()-doubles.size());
//    }

//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private final Map <String, Employee> employeeList;
//    public EmployeeServiceImpl() {
//        employeeList = new HashMap<>();
//    }

//    @Override
//    public Employee add(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.containsKey(key)) {
//            throw new EmployeeExistsException();
//        }
//        Employee newEmployee = new Employee(firstName, lastName);
//        employeeList.put(key, newEmployee);
//        return newEmployee;
//    }

//    @Override
//    public Employee remove(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        if (employeeList.remove(key) == null) {
//            throw new EmployeeNotFoundException();
//        }
//        Employee removedEmployee = new Employee(firstName, lastName);
//        return removedEmployee;
//    }

//    @Override
//    public Employee find(String firstName, String lastName) {
//        String key = getKey(firstName, lastName);
//        Employee employee = employeeList.get(key);
//        if (employee == null) {
// employee нужно получить по ключу key(ключ key сейчас не используется)
//            throw new EmployeeNotFoundException();
//        }
//        return employee;
//    }

//    @Override
//    public Collection <Employee> getAll() {
//        return Collections.unmodifiableCollection(employeeList.values());
//    }

//    private String getKey(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }

