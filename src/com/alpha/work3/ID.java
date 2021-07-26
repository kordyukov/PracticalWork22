package com.alpha.work3;

public class ID {
    private int id;
    private static int nextId;

    static {
        nextId = 0 + (int) (Math.random() * 100);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public ID(){
        this.id = nextId;
        this.id++;
    }
}
