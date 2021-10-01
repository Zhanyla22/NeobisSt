import java.util.Date;

public class Order{

        private int id;
        private Person person;
        private Product product;
        private Date orderDate;

        public Order(){

        }
        public Order(int id,Person person,Product product,Date orderDate){
            this.id = id;
            this.person = person;
            this.product =product;
            this.orderDate = orderDate;
        }

        public int getId(){
            return id;
        }

        public  void  setId(int id){
            this.id = id;
        }

        public Person getPerson() {
             return person;
        }

        public void setPerson(Person person){
            this.person = person;
        }

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
             this.product = product;
        }

        public Date getOrderDate() {
              return orderDate;
        }

        public void setOrderDate(Date orderDate) {
               this.orderDate = orderDate;
        }
}