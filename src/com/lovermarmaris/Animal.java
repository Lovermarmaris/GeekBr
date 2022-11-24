package com.lovermarmaris;
public abstract class Animal {
    protected String name;
    protected int max;
    protected int distance;
    protected abstract boolean run(int distance);
    protected abstract boolean jump(int distance);
    protected abstract boolean swim(int distance);
    protected Animal(String _name) {
        this.name = _name;
    }
    protected void animalInfo() {
        System.out.println("Animal: " + this.name);
    }
    protected boolean isCan() {
        return this.distance <= this.max;
    }
}