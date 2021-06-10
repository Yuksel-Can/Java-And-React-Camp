class Customer{
    constructor(id, customerName){
        this.id = id;
        this.customerName = customerName;
    }
}

let customer = new Customer(1,"Can");
//Prototyping
customer.surname="Özdemir"
console.log(customer.surname);

Customer.bisey = "Bisey1";
console.log(Customer.bisey);

console.log(customer.customerName);
///////////////
class IndividualCustomer extends Customer{
    constructor(firstName, id, customerName){
        super(id, customerName);
        this.firstName = firstName;
    }
}
class CorporateCustomer extends Customer{
    constructor(companyName, id, customerName){
        super(id, customerName);
        this.companyName = companyName;
    }
}