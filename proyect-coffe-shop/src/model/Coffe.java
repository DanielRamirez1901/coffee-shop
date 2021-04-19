package model;

import java.util.ArrayList;

/**
 * This class manages the ingredients, products, customers, employees and
 * orders.<br>
 *
 * @author DanielRamirez<br>
 * @author AmilcarRodriguez<br>
 */
public class Coffe {

    //Relations
    private ArrayList<Client> clients;//Relation with class Client, clients are contained in an ArrayList of that type(Client)
    private ArrayList<Product> products;//Relation with class Product, products are contained in an ArrayList of that type(Product)
    private ArrayList<Ingredient> ingredients;//Relation with class Ingredient, ingredients are contained in an ArrayList of that type(Ingredient)
    private ArrayList<Employee> employees;//Relation with class Employee, employees are contained in an ArrayList of that type(Employee)
    private ArrayList<Order> order;//Relation with class Order, order are contained in an ArrayList of that type(Order)

//***********************************************************************************************************************************************************
    /**
     * Coffe class construct method<br>
     * <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param clients Is a Client with the attributes of that class<br>
     * @param products Is a Product with the attributes of that class<br>
     * @param ingredients Is an Ingredient with the attributes of that class<br>
     * @param employees Is an Employee with the attributes of that class<br>
     */
    public Coffe() {
        clients = new ArrayList<Client>();
        products = new ArrayList<Product>();
        ingredients = new ArrayList<Ingredient>();
        employees = new ArrayList<Employee>();
    }//End Coffe method

//***********************************************************************************************************************************************************
    /**
     * This method allows adding a product to the coffee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the product has been added to the ArrayList<br>
     *
     * @param product Is a Product with the attributes of that class<br>
     */
    public void addProduct(Product product) {
        products.add(product);
    }//End addProduct method

//***********************************************************************************************************************************************************
    /**
     * This method allows search a product in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the product name<br>
     * @return position Returns the position in the arrayList where the product
     * was found<br>
     */
    public int searchProductInt(String name) {
        int position = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }//End searchProductInt method

//***********************************************************************************************************************************************************
    /**
     * This method allows search a product in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the product name<br>
     * @return products name in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the product
     * was not found<br>
     */
    public Product searchProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().compareTo(name) == 0) {
                return products.get(i);
            }//End if
        }//End for
        return null;
    }//End searchProduct method

//***********************************************************************************************************************************************************
    /**
     * This method allows modifying the products attributes<br>
     *
	* <b>pre:</b>the product must be initialized and created<br>
     * <b>post:</b>the product has been modified<br>
     *
     * @param product Is a product of Product type. product =! null<br>
     * @param name Is a string with the product name. name =! null , name =!
     * ""<br>
     */
    public void modifyProduct(Product product, String name) {
        int index = searchProductInt(name);
        products.set(index, product);
    }//End modifyProduct

//***********************************************************************************************************************************************************
    /**
     * This method allows remove a product<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the product has been deleted to the arrayList if the
     * conditional is satisfactorily fulfilled<br>
     *
     * @param name Is a string with the product name. product =! ""<br>
     */
    public void removeProduct(String name) {
        Product product = searchProduct(name);
        if (product != null) {
            products.remove(product);
        }//End if
    }//End removeProduct method

//***********************************************************************************************************************************************************
    /**
     * This method allows adding an ingredient to the coffee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the ingredient has been added to the ArrayList<br>
     *
     * @param ingredient Is a Ingredient with the attributes of that class<br>
     */
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

//***********************************************************************************************************************************************************
    /**
     * This method allows search an ingredient in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the ingredient name<br>
     * @return position Returns the position in the arrayList where the
     * ingredient was found<br>
     */
    public int searchIngredientInt(String name) {
        int position = 0;
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }//End searchIngredientInt method

//***********************************************************************************************************************************************************
    /**
     * This method allows search an ingredient in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the ingredient name<br>
     * @return ingredients name in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the
     * ingredient was not found<br>
     */
    public Ingredient searchIngredient(String name) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().compareTo(name) == 0) {
                return ingredients.get(i);
            }//End if
        }//End for
        return null;
    }//End searchIngredient method

//***********************************************************************************************************************************************************
    /**
     * This method allows remove an ingredient<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the ingredient has been deleted to the arrayList if the
     * conditional is satisfactorily fulfilled<br>
     *
     * @param name Is a string with the ingredient name. ingredient =! ""<br>
     */
    public void removeIngredient(String name) {
        Ingredient ingredient = searchIngredient(name);
        if (ingredient != null) {
            ingredients.remove(ingredient);
        }//End if
    }//End removeIngredient method

//***********************************************************************************************************************************************************
    /**
     * This method allows modifying the ingredients attributes<br>
     *
	* <b>pre:</b>the ingredient must be initialized and created<br>
     * <b>post:</b>the ingredient has been modified<br>
     *
     * @param ingredient Is an ingredient of Ingredient type. ingredient =!
     * null<br>
     * @param name Is a string with the ingredient name. name =! ""<br>
     */
    public void modifyIngredient(Ingredient ingredient, String name) {
        int index = searchIngredientInt(name);
        ingredients.set(index, ingredient);
    }//End modifyIngredient method

//***********************************************************************************************************************************************************
    /**
     * This method allows search a system user in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the user name<br>
     * @return employees name in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the
     * employee(system user) was not found<br>
     */
    public Employee searchUsername(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getUserName().compareTo(name) == 0) {
                return employees.get(i);
            }//End if
        }//End for
        return null;
    }//End searchUsername

//***********************************************************************************************************************************************************
    /**
     * This method allows login to the system user<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @return true if the user name and password are similar to the user name
     * and password registered in data base of the Employee class. False if the
     * user name and password are not similar to the user name and password
     * registered in data base of the Employee class <br>
     */
    public boolean userLogin(String name, String password) {
        return ((searchUsername(name) != null) && (searchUsername(name).getPassword().compareTo(password) == 0)) ? true : false;
    }//End userLogin method

//***********************************************************************************************************************************************************
    /**
     * This method allows adding an employee to the coffee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the employee has been added to the ArrayList<br>
     *
     * @param employee Is an Employee with the attributes of that class<br>
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }//End addEmployee method

//***********************************************************************************************************************************************************
    /**
     * This method allows search an employee in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the employee name<br>
     * @return position Returns the position in the arrayList where the employee
     * was found<br>
     */
    public int searchEmployeeInt(String name) {
        int position = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }//End searchEmployeeInt method

//***********************************************************************************************************************************************************
    /**
     * This method allows search an employee in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the employee name<br>
     * @return employees name in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the employee
     * was not found<br>
     */
    public Employee searchEmployee(String name) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().compareTo(name) == 0) {
                return employees.get(i);
            }//End if
        }//End for
        return null;
    }//End searchEmployee method

//***********************************************************************************************************************************************************
    /**
     * This method allows remove an employee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the employee has been deleted to the arrayList if the
     * conditional is satisfactorily fulfilled<br>
     *
     * @param name Is a string with the employee name. employee =! ""<br>
     */
    public void removeEmployee(String name) {
        Employee employee = searchEmployee(name);
        if (employee != null) {
            employees.remove(employee);
        }//End if
    }//End removeEmployee method
//***********************************************************************************************************************************************************

    /**
     * This method allows modifying the employees attributes<br>
     *
	* <b>pre:</b>the employee must be initialized and created<br>
     * <b>post:</b>the employee has been modified<br>
     *
     * @param employee Is an employee of Employee type. employee =! null<br>
     * @param name Is a string with the employee name. name =! "" ,
     * employee =! ""<br>
     */
    public void modifyEmployee(Employee employee, String name) {
        int index = searchEmployeeInt(name);
        employees.set(index, employee);
    }//End modifyEmployee method
    
//***********************************************************************************************************************************************************

    /**
     * toString class method<br>
     * <b>pre:</b>The ArrayList<Product> products it does not have to be empty
     * <br>
     * <b>post:</b>order the products depending on the price<br>
     */
    public void SortByPrice() {

        for (int i = 0; i < products.size(); i++) {
            int posMin = i;
            for (int j = i + 1; j < products.size(); j++) {
                if (products.get(j).getPrice() < products.get(posMin).getPrice()) {
                    posMin = j;
                }
            }
            Product aux = products.get(i);
            products.set(i, products.get(posMin));
            products.set(posMin, aux);
        }
    }
    
//***********************************************************************************************************************************************************

    /**
     * This method allows adding a client to the coffee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the client has been added to the ArrayList<br>
     *
     * @param client Is an Client with the attributes of that class<br>
     */
    public void addClient(Client client) {
        clients.add(client);
    }//End addClient method 
    
 //***********************************************************************************************************************************************************

    /**
     * This method allows search a client in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the client name<br>
     * @return position Returns the position in the arrayList where the client
     * was found<br>
     */
    public int searchClientInt(String name) {
        int position = 0;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getName().compareTo(name) == 0) {
                position = i;
            }//End if
        }//End for
        return position;
    }//End searchClientInt method
    
//***********************************************************************************************************************************************************
    
    /**
     * This method allows search a client in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param name Is a String that contain the client name<br>
     * @return clients name in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the client
     * was not found<br>
     */
    public Client searchClient(String name) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getName().compareTo(name) == 0) {
                return clients.get(i);
            }//End if
        }//End for
        return null;
    }//End searchClient method
    
//***********************************************************************************************************************************************************

    /**
     * This method allows remove a client<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the client has been deleted to the arrayList if the
     * conditional is satisfactorily fulfilled<br>
     *
     * @param name Is a string with the client name. client =! ""<br>
     */
    public void removeClient(String name) {
        Client client = searchClient(name);
        if (client != null) {
            clients.remove(client);
        }//End if
    }//End removeClient method

//***********************************************************************************************************************************************************
    
    /**
     * This method allows modifying the client attributes<br>
     *
	* <b>pre:</b>the client must be initialized and created<br>
     * <b>post:</b>the client has been modified<br>
     *
     * @param client Is an client of Client type. client =! null<br>
     * @param name Is a string with the client name. name =! ""<br>
     */
    public void modifyClient(Client client, String name) {
        int index = searchClientInt(name);
        clients.set(index, client);
    }//End modifyEmployee method
    
//***********************************************************************************************************************************************************

    /**
     * This method allows adding an order to the coffee<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the order has been added to the ArrayList<br>
     *
     * @param orders Is an Order with the attributes of that class<br>
     */
    public void addOrder(Order orders) {
        order.add(orders);
    }//End addOrder method

//***********************************************************************************************************************************************************
    
    /**
     * This method allows search an order in the coffe class<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b><br>
     *
     * @param code Is a String that contain the order code<br>
     * @return order code in a position i of the iteration but if the
     * conditional is not met, it returns a null value, this means the order
     * was not found<br>
     */
    public Order searchOrder(String code) {
        for (int i = 0; i < order.size(); i++) {
            if (order.get(i).getOrderCode().compareTo(code) == 0) {
                return order.get(i);
            }//End if
        }//End for
        return null;
    }//End searchOrder method

//***********************************************************************************************************************************************************

    /**
     * This method allows remove a client<br>
     *
	* <b>pre:</b><br>
     * <b>post:</b>the client has been deleted to the arrayList if the
     * conditional is satisfactorily fulfilled<br>
     *
     * @param name Is a string with the client name. client =! ""<br>
     */
    public void removeOrder(String code) {
        Order orderA = searchOrder(code);
        if (orderA != null) {
            order.remove(orderA);
        }//End if
    }

//**************************Setters & Getters**************************************************************************************************
    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }
}//End Coffe class
