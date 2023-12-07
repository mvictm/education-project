package service;

import dto.House;

public class MainClass {

    /**
     * Многострочный комментарий
     * */
    public static void main(String[] args) {
        House woodHouse = new House();
        woodHouse.setMaterial("кирпич");

        updateMaterial(woodHouse);

        System.out.println(woodHouse);
    }

    public static void updateMaterial(House house) {
        house.setMaterial("дерево");
        house = new House();
        house.setMaterial("пластик");
    }

}
