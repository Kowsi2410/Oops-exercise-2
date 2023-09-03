/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author lohit
 */

    public class InvoiceItem {
    private final String id;
    private final String desc;
    private final int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total
    public double getTotal() {
        return qty * unitPrice;
    }

    // toString method to display InvoiceItem details
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
    }

    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem("12345", "Widget", 5, 10.0);
        System.out.println("Item ID: " + item.getId());
        System.out.println("Item Description: " + item.getDesc());
        System.out.println("Item Quantity: " + item.getQty());
        System.out.println("Item Unit Price: " + item.getUnitPrice());
        System.out.println("Total Price: " + item.getTotal());
        System.out.println(item.toString());
    }
    }

    

