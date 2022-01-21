/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fionali
 */
public class Book {
    private String name;
    private int year;
    
    public Book(String name, int year){
        this.name = name;
        this.year = year;
    }

    /**
     * @return the name
     */
    public String getName() {
        String NEWTEST;
        return name;
        
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
}
