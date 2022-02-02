class MyBook extends Book {
    int price;
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    public void display(){
        System.out.println(
                "Title: " + this.title + "\n"
            +   "Author: " + this.author + "\n"
            +   "Price: " + this.price
        );
    }
}
