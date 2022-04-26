/*
 * Author @Yucel Can Dogan
 * Project: Let Me Clean
 */

public class Unternehmen {
    private String Name;
    private String Place;
    private String OfferNo;
    private int Id;
    private String Customer;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Unternehmen() {
    }

    public Unternehmen(String name, String OfferNo, boolean b) {
        this.Name = name;
        this.OfferNo = OfferNo;
        b = true;
    }
    public Unternehmen(String name, String JobOrderNo, boolean b,boolean a) {
        this.Name = name;
        this.JobOrderNo = JobOrderNo;
        b = true;
        a = true;
    }

    public Unternehmen(String name, String Place,String Customer) {
        this.Name = name;
        this.Place = Place;
        this.Customer = Customer;
    }

    public Unternehmen(String name) {
        Name = name;
    }

    public Unternehmen(String name, String place, String offerNo, String jobOrderNo, String Customer) {
        Name = name;
        Place = place;
        OfferNo = offerNo;
        JobOrderNo = jobOrderNo;
        this.Customer = Customer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getOfferNo() {
        return OfferNo;
    }

    public void setOfferNo(String offerNo) {
        OfferNo = offerNo;
    }

    public String getJobOrderNo() {
        return JobOrderNo;
    }

    public void setJobOrderNo(String jobOrderNo) {
        JobOrderNo = jobOrderNo;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

}
