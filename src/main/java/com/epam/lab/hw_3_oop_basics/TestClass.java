package com.epam.lab.hw_3_oop_basics;


import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods.Conductors;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods.LightingFixtures;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods.Socket;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.electro.electrical_goods.Switch;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.paints_varnishes_goods.Paint;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.paints_varnishes.paints_varnishes_goods.Varnish;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.plumbing_goods.Bath;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.plumbing_goods.Shower;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.plumbing_goods.Tile;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.plumbing.plumbing_goods.Toilet;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods.Door;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods.Floor;
import com.epam.lab.hw_3_oop_basics.goods_for_repair.wood_product.wood_product_goods.Furniture;

import java.util.LinkedList;

public class TestClass {
    public static void main(String[] args) {
        LinkedList<Goods> allGods = new LinkedList<Goods>();
        LinkedList<Goods> filteredLinkedList;
        TestClass testClass = new TestClass();

        testClass.fillUpList(allGods);
        filteredLinkedList = allGods;

        testClass.printList(filteredLinkedList);
        filteredLinkedList = testClass.filteredByPrice(filteredLinkedList, 700, true);
        testClass.printList(filteredLinkedList);
        filteredLinkedList = testClass.filteredByPrice(filteredLinkedList, 1500, false);
        testClass.printList(filteredLinkedList);

    }

    private void fillUpList(LinkedList<Goods> allGoods) {
        allGoods.add(new Door(900, 2, 3, 123, "Dub", "Red", true));
        allGoods.add(new Door(600, 3, 7, 2, "Dub", "White", true));
        allGoods.add(new Floor(400, 213, 123, 123, "Sosna", "Blue", "Parket"));
        allGoods.add(new Floor(500, 213, 123, 123, "Dub", "Red", "Laminat"));
        allGoods.add(new Furniture(1123, 123, 123, 432, "Klen", "Green"));
        allGoods.add(new Furniture(700, 123, 123, 200, "Klen", "Green"));
        allGoods.add(new Toilet(234, 40, 50, "Ceramic", "White"));
        allGoods.add(new Toilet(99999, 40, 50, "Gold", "Gold"));
        allGoods.add(new Bath(540, 40, 50, "Ceramic", "White"));
        allGoods.add(new Bath(999999, 40, 50, "Gold", "Gold"));
        allGoods.add(new Tile(1567, 40, 50, "Ceramic", "White"));
        allGoods.add(new Tile(800, 20, 30, "Ceramic", "White"));
        allGoods.add(new Shower(4656, 40, 50, "Ceramic", "White"));
        allGoods.add(new Shower(10000, 400, 100, "Ceramic", "White"));
        allGoods.add(new Paint(50, true, false, "White"));
        allGoods.add(new Paint(70, true, false, "Red"));
        allGoods.add(new Varnish(100, true, true));
        allGoods.add(new Varnish(50, false, false));
        allGoods.add(new Switch(40, 123, "Red"));
        allGoods.add(new Switch(60, 256, "White"));
        allGoods.add(new Socket(30, 123, "Red"));
        allGoods.add(new Socket(60, 256, "White"));
        allGoods.add(new Conductors(15, 123, 1));
        allGoods.add(new Conductors(25, 256, 2));
        allGoods.add(new LightingFixtures(2000, 123, "Red"));
        allGoods.add(new LightingFixtures(3000, 256, "Green"));
    }

    private LinkedList<Goods> filteredByName(LinkedList<Goods> goodsList, String name) {
        LinkedList<Goods> filteredGoodsList = new LinkedList<Goods>();
        for (Goods goods : goodsList) {
            if (goods.getName().toLowerCase().equals(name.toLowerCase())) {
                filteredGoodsList.add(goods);
            }
        }
        return filteredGoodsList;
    }

    public LinkedList<Goods> filteredByPrice(LinkedList<Goods> goodsList, int price, Boolean fromOrTo) {
        LinkedList<Goods> filteredGoodsList = new LinkedList<Goods>();
        for (Goods goods : goodsList) {
            if (fromOrTo) {
                if (goods.getPrice() >= price) {
                    filteredGoodsList.add(goods);
                }
            } else {
                if (goods.getPrice() <= price) {
                    filteredGoodsList.add(goods);
                }
            }
        }
        return filteredGoodsList;
    }

    public void printList(LinkedList<Goods> linkedList) {
        int count = 0;
        for (Goods g : linkedList) {
            count++;
            System.out.println(count + ". " + g.toString());
        }
    }
}
