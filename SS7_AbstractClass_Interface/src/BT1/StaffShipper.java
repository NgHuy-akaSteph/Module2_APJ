package BT1;

public class StaffShipper extends Staff{
    private String car;


    StaffShipper(int id, String name, String phone, String role, String car) {
        super(id, name, phone, role);
        this.car = car;
    }
}
