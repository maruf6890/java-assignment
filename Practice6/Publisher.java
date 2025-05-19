package Practice6;

class Publisher {
    private int Id;
    private String Name;
    private String Address;
    private String PhoneNo;

    public Publisher(int id, String name, String address, String phoneNo) {
        this.Id = id;
        this.Name = name;
        this.Address = address;
        this.PhoneNo = phoneNo;
    }

    public void AddPub() {
        System.out.println("Publisher '" + Name + "' added with ID: " + Id);
    }

    public void ModifyPub() {
        System.out.println("Publisher '" + Name + "' details modified.");
    }

    public void DeletePub() {
        System.out.println("Publisher '" + Name + "' with ID: " + Id + " deleted.");
    }

    public void OrderStatus() {
        System.out.println("Order status for Publisher '" + Name + "': In Progress");
    }
}