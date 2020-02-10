package com.bookit.pojos;

import java.util.Objects;

public class Room implements Comparable <Room>{

    private int id;
    private String name;
    private String description;
    private int capacity;
    private String withTV;
    private boolean withWhiteBoard;

    public Room(){

    }

    //to check if 2 room objects are equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id && Objects.equals(name, room.name);
    }
    //need to override if you gonna use hash based data structures
    //like HashMap, HashSet
    //Otherwise, HashSet/HashMap will not contain only unique values
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public Room(String name, String description, int capacity, String withTV, boolean whiteBoard) {

        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.withTV = withTV;
        withWhiteBoard = whiteBoard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getWithTV() {
        return withTV;
    }

    public void setWithTV(String withTV) {
        this.withTV = withTV;
    }

    public boolean isWhiteBoard() {
        return withWhiteBoard;
    }

    public void setWhiteBoard(boolean whiteBoard) {
        withWhiteBoard = whiteBoard;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", capacity=" + capacity +
                ", withTV='" + withTV + '\'' +
                ", WhiteBoard=" + withWhiteBoard +
                '}';
    }

    @Override
    public int compareTo(Room o) {
        return this.name.compareTo(o.getName());
    }
}
