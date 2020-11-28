package org.kodluyoruz.examples.maps;

import org.kodluyoruz.examples.maps.Customer;

import java.util.*;

public class ExampleMaps {

    public static void main(String[] args) {
        Customer google = new Customer(1, "Google", 100.00);
        Customer amazon = new Customer(2, "Amazon", 200.00);
        Customer spaceX = new Customer(3, "SpaceX", 300.00);
        Customer samsung = new Customer(4, "Samsung", 400.00);

        CustomerAddress googleDefaultAddress = new CustomerAddress(1, "America");
        CustomerAddress googleTurkeyAddress = new CustomerAddress(2, "Turkey");

        List<CustomerAddress> customerAddressList = new ArrayList<>();
        customerAddressList.add(googleDefaultAddress);
        customerAddressList.add(googleTurkeyAddress);


        Map<Customer, List<CustomerAddress>> customerMaps = new HashMap<>();
        customerMaps.put(google, customerAddressList);

        System.out.println("----------");

        Map<String, String> englishToTurkishDictionary = new HashMap<>();
        englishToTurkishDictionary.put("go", "git");
        englishToTurkishDictionary.put("come", "gel");
        englishToTurkishDictionary.put("dictionary", "sözlük");
        englishToTurkishDictionary.put("animal", "-hayvan-");

        System.out.println("GO kelimesinin türkçe karşılığı = " + englishToTurkishDictionary.get("go"));
        System.out.println("dictionary kelimesinin türkçe karşılığı = " + englishToTurkishDictionary.get("dictionary"));


        Set<Map.Entry<String, String>> entries = englishToTurkishDictionary.entrySet();

        for(Map.Entry<String, String> line: entries) {
            String key = line.getKey();
            String value = line.getValue();
            System.out.println("Key is -> " + key);
            System.out.println("value is -> " + value);
        }

        System.out.println("-----------");

        Set<String> keys = englishToTurkishDictionary.keySet();
        Collection<String> values = englishToTurkishDictionary.values();

        printAll(keys);
        System.out.println("------------");
        printAll(values);

        System.out.println("------------");

        System.out.println("Has go key -> " + englishToTurkishDictionary.containsKey("gogogogo"));
        System.out.println("Has go valus -> " + englishToTurkishDictionary.containsValue("sözlük2"));

        System.out.println("Has animal "  + englishToTurkishDictionary.getOrDefault("animal","Hayvan"));

        List<String> students = new ArrayList<>();
        students.add("Abdurrahman");
        students.add("Cansu");
        students.add("Umut");
        students.add("Işıl");
        students.add("Mina");
        students.add("Nazlı");

        // 100 elemanlı liste
        // t anında 5. elemanı okuyorsunuz fo
        Iterator<String> iterator = students.iterator();

        System.out.println("--------------");
       while(iterator.hasNext()){
           String element = iterator.next();
           System.out.println(element);
       }



    }

    static void printAll(Collection<?> collection) {
        if (!collection.isEmpty()) {
            for (Object object : collection) {
                System.out.println(object.toString());
            }
        }
    }
}
