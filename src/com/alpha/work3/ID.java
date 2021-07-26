package com.alpha.work3;

public class ID {
    private int id;
    public static int nextId;
    {
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
    }
}
