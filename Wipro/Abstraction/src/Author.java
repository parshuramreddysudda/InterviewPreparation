

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Author {

    //private variable
    private String name;
    private String gender;  
    //constructor
    public Author (String name, String gender){
        this.name = name;
        this.gender = gender;   
    }
    //getters
    public String getName(){
        return name;  
    }
    public String getGender(){
        return gender;
    }
    
public static class Book {

    //private variables
    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    //constructor
    public Book(String title, int noOfPages, boolean fiction){
        this.author=new Author ("Jacquie Barker","Female");
        this.title = title;
        this.noOfPages=noOfPages;
        this.fiction = fiction;    
    }

    //getters
    public Author getAuthorsName(){
        return this.author;
    }
    public String getTitle(){
        return title;
    }

    public int getNoOfPages(){
        return noOfPages;
    }

    public boolean getFiction(){
        return fiction;
    }

    //setters
    public void setAuthor(Author newAuthor){
        author=newAuthor;
    }
    public void setTitle (String title){
        this.title=title;
    }
    public void setNoOfPages(int noOfpages){
        this.noOfPages=noOfpages;
    }
    public void setfiction(boolean fiction){
        this.fiction=false;
    }

    public String toString(){
        return "Title: " + this.title + "\n"+"Author: " + this.author.getName() + "\n" +
               "No. of pages: " + this.noOfPages + "\n" + "Fiction: " + this.fiction;
    }
}

public static void main (String args[]) {
	Book b=new Book("male", 34, false);
	System.out.print(b.toString());
}
}
