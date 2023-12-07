package service;

import dto.House;

public class MainClass {

    /**
     * Многострочный комментарий
     * */
    public static void main(String[] args) {
        House woodHouse = new House();
        woodHouse.setMaterial("дерево");

        updateMaterial(woodHouse);

        System.out.println(woodHouse);

        int firstNumber = 1;

        updateNum(firstNumber);

        System.out.println(firstNumber);
    }

    public static void updateMaterial(House house) {
        house.setMaterial("кирпич");
        house = new House();
        house.setMaterial("пластик");
    }

    public static void updateNum(int number) {
        number = 42;
    }
}
