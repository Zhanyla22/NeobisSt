import java.util.Date;

public class Receipt {

    private int id;
    private Person person;
    private Employee employee;
    private Product product;
    private Date saleDate;

    public  Order() {

    }

    public Order(int id, Person person, Product product, Date orderDate) {
        this.id = id;
        this.person = person;
        this.employee = employee;
        this.product = product;
        this.saleDate = saleDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}