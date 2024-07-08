package BT1;

public class StaffWorkshop extends Staff{
    private String workshopID;

    StaffWorkshop(int id, String name, String phone, String role, String workshopID) {
        super(id, name, phone, role);
        this.workshopID = workshopID;
    }

}
