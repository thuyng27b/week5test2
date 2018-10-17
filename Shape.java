/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.task2;

/**
 *
 * @author Huy Hung
 */
public class Shape {
    private String color;
    private boolean filled= true;
    /**
     * hàm khai báo không chứa tham số
     */
    public Shape(){}
    /**
     * @param color thông số 1
     * @param filled thông số 2
     */
    public Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }
    /**
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * @param color thông số 1
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return filled
     */
    public boolean isFilled() {
        return filled;
    }
    /**
     * @param filled thông số 2
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    /**
     * hiện thị thông tin đối tượng
     * @return 
     */
    @Override
    public String toString(){
        return this.color+"\n"+ this.filled;
    }
}
