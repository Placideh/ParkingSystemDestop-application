/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiParking;



/**
 *
 * @author placide
 */
public class Car {
    private String typeName;
    private String plateNo;
    private String model;

    public Car(String typeName, String plateNo, String model) {
        this.typeName = typeName;
        this.plateNo = plateNo;
        this.model = model;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
}
