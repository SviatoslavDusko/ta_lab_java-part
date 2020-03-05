package com.epam.lab.hw_4_oop_in_java.tank;

import com.epam.lab.hw_4_oop_in_java.tank.nationality.Nationality;

import static com.epam.lab.hw_4_oop_in_java.constant.Constants.ARMOR_PIERCING;
import static com.epam.lab.hw_4_oop_in_java.constant.Constants.EXPLOSIVE;

public class Tank {
    private int armor;
    private int damage;
    private int evasion;
    private int penetration;
    private int health;
    private String typeOfGun;
    private String name;
    private Nationality nationality;

    public Tank(int armor, int damage, int evasion, int penetration, int health, String typeOfGun, Nationality nationality) {
        this.armor = armor;
        this.damage = damage;
        this.evasion = evasion;
        this.penetration = penetration;
        this.health = health;
        this.typeOfGun = typeOfGun;
        this.nationality = nationality;
        this.setName();
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    private int getPenetration() {
        return penetration;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Nationality getNationality() {
        return nationality;
    }

    private String getTypeOfGun() {
        return typeOfGun;
    }

    //+-25%(if tank)/+-60%(if artillery) to "a"
    private int rand(int a, String typeOfGun) {
        if (typeOfGun.equals(ARMOR_PIERCING)) {
            double b = (75 + Math.random() * 50) / 100;
            return (int) (b * a);
        } else {
            double b = (40 + Math.random() * 120) / 100;
            return (int) (b * a);
        }
    }

    private boolean isEvasion(Tank tank) {
        int a = (int) (Math.random() * 100);
        return a < tank.getEvasion();
    }

    private boolean isPenetration(Tank tank) {
        return rand(this.getPenetration(), ARMOR_PIERCING) > tank.getArmor();
    }

    private void doDamage(Tank tank) {
        if (isTankAlive(this)) {
            int damage = rand(this.getDamage(), this.getTypeOfGun());
            tank.setHealth(tank.getHealth() - damage);
            System.out.println("Penetration!");
            System.out.println("-" + damage + "!!!");
            if (tank.getHealth() < 0) {
                tank.setHealth(0);
                System.out.println("Tank killed!!!");
                System.out.println(this.getName() + " WIN!!!");
                return;
            }
            System.out.println(tank.getHealth() + " health left.");
        }
    }

    public String getName() {
        return name;
    }

    private void setName() {
        StringBuilder longName = new StringBuilder(this.getClass().getName());
        String name = "";
        for (int i = longName.lastIndexOf("."); i < longName.length() - 1; i++) {
            name += longName.charAt(i + 1);
        }
        this.name = name;
    }

    protected void useNationalityFeature() {
        this.getNationality().useFeature(this);
    }

    private boolean isTankAlive(Tank tank) {
        return tank.getHealth() > 0;
    }

    public void fire(Tank tank) {
        if (isTankAlive(tank)) {
            if (!isEvasion(tank)) {
                if (this.getTypeOfGun().equals(EXPLOSIVE)) {
                    doDamage(tank);
                } else if (isPenetration(tank)) {
                    doDamage(tank);
                } else System.out.println("Not penetration!");
            } else System.out.println("Evasion!!!");
        } else System.out.println("Tank killed!");
    }
}
