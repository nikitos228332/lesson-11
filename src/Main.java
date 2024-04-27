public class Main {


    public static void main(String[] args) {
        Book newBook1 = new Book("История красоты" , 2004 );
        Author eko = new Author("Умберто" , "Эко");
        System.out.println(newBook1.getName() + " - " + newBook1.getУearsPublication() + " года публикации, автора - "+ eko.getName() + " " + eko.getSoname());

        Book newBook2 = new Book("История уродства" , 2007);
        Author eko1 = new Author("Умберто" , "Эко");
        System.out.println(newBook2.getName() + " - " + newBook2.getУearsPublication() + " года публикации, автора - "+ eko1.getName() + " " + eko1.getSoname());

        newBook2.setYearsPublication(2009);
        System.out.println("newBook2  " + newBook2.getУearsPublication());
    }
}



