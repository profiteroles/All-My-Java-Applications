package javacountries;

import java.util.LinkedList;

public class Country {

    // Country variable
    private String countryName;
    // Cities List

    LinkedList<City> cities = new LinkedList<>();

    // City[] cities;
    // Nested Classes
    class City {

        // cityName Variable
        private String nameCity;

        // getter for the city class
        public String getCityName() {
            return nameCity;
        }

        // City setter
        public void setCityName(String cityName) {
            nameCity = cityName;
        }

        //print the city names
        @Override
        public String toString() {
            return "Cities : " + getCityName();
        }
    }

    public static void main(String[] args) {

//        String[] countriesArray = { "Kiwi Land", "Australia", "Germany", "Spain" };
        // LinkedList<NodeCountries> countriesList = new LinkedList<NodeCountries>();
        // String[] citiesArray = { "AuckLand", "ChristChurch", "Wellington", "QueensTown", "Perth", "Brisbane", "Hobart",
        //         "Darwin", "Berlin", "Munich", "Hamburg", "Frankfurt", "Malaga", "Barcelona", "Madrid", "Valencia" };
        // new DoubleLinkedList variable
        DoublyLinkedList dlList = new DoublyLinkedList();

        // creating 4 object country
        Country nz = new Country();
        Country australia = new Country();
        Country germany = new Country();
        Country spain = new Country();
        Country Italy = new Country();
        

        // naming the countries
        nz.setCountryName("Kiwi Land");
        australia.setCountryName("Australia");
        germany.setCountryName("Germany");
        spain.setCountryName("Spain");

        // adding Nodes
        dlList.addNode(nz);
        dlList.addNode(australia);
        dlList.addNode(germany);
        dlList.addNode(spain);

        // creating 4 cities of country
        City city1 = nz.new City();
        City city2 = nz.new City();
        City city3 = nz.new City();
        City city4 = nz.new City();
        City city5 = australia.new City();
        City city6 = australia.new City();
        City city7 = australia.new City();
        City city8 = australia.new City();
        City city9 = germany.new City();
        City city10 = germany.new City();
        City city11 = germany.new City();
        City city12 = germany.new City();
        City city13 = spain.new City();
        City city14 = spain.new City();
        City city15 = spain.new City();
        City city16 = spain.new City();

        // naming all the cities
        city1.setCityName("AuckLand");
        city2.setCityName("ChristChurch");
        city3.setCityName("Wellington");
        city4.setCityName("QueensTown");
        city5.setCityName("Perth");
        city6.setCityName("Brisbane");
        city7.setCityName("Hobart");
        city8.setCityName("Darwint");
        city9.setCityName("Berlin");
        city10.setCityName("Munich");
        city11.setCityName("Hamburg");
        city12.setCityName("Frankfurt");
        city13.setCityName("Malaga");
        city14.setCityName("Barcelona");
        city15.setCityName("Madrid");
        city16.setCityName("Valencia");

        // adding all the cities belonging countries
        nz.cities.add(city1);
        nz.cities.add(city2);
        nz.cities.add(city3);
        nz.cities.add(city4);
        australia.cities.add(city5);
        australia.cities.add(city6);
        australia.cities.add(city7);
        australia.cities.add(city8);
        germany.cities.add(city9);
        germany.cities.add(city10);
        germany.cities.add(city11);
        germany.cities.add(city12);
        spain.cities.add(city13);
        spain.cities.add(city14);
        spain.cities.add(city15);
        spain.cities.add(city16);

        // display all the countries and the belongin cities of country
        dlList.display();

    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

class DoublyLinkedList {

    // Sets the next and Prev null from the start point
    Node head = null, tail = null;

    class Node {

        // Node Class Variables
        Country country;
        Node prev;
        Node next;

        public Node(Country countryName) {
            country = countryName;
        }
    }

    // Adds new node to the list
    public void addNode(Country country) {
        // New Node Object
        Node newNode = new Node(country);

        // If list is empty
        if (head == null) {
            // From the beggining all point to newNode
            head = tail = newNode;
            head.prev = null;
            tail.next = null;

        } else { // newNode go to the end of it
            // newNode prev is tail
            // newNode would become the tail
            // tail's next will point null.
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    // Print all the node
    public void display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("Node head is NULL");
            return;
        }
        //while current has node will print the below statement.
        while (current != null) {

            System.out.println(current.country.getCountryName() + " " + current.country.cities);
            current = current.next;
        }
    }
}
