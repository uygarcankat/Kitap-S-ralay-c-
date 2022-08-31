import java.util.*;



class book implements Comparable<book>{

    private String book_name;
    private Integer number_page;
    private String Author_name;
    private String pblcton_date;

    public book(String book_name, int number_page, String author_name, String pblcton_date) {
        this.book_name = book_name;
        this.number_page = number_page;
        Author_name = author_name;
        this.pblcton_date = pblcton_date;
    }

    public  String getBook_name() {
        return book_name;
    }

    public int getNumber_page() {
        return number_page;
    }

    public String getAuthor_name() {
        return Author_name;
    }

    public String getPblcton_date() {
        return pblcton_date;
    }


    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setNumber_page(int number_page) {
        this.number_page = number_page;
    }

    public void setAuthor_name(String author_name) {
        Author_name = author_name;
    }

    public void setPblcton_date(String pblcton_date) {
        this.pblcton_date = pblcton_date;
    }

    @Override
    public  int compareTo(book o) {
        return book_name.compareTo(o.book_name);
    }
}
public class Sort {


    public static void main(String args[]) {





        Set<book> bookset=new TreeSet<>();

        bookset.add(new book("Anadolu Mirasları",246,"Kemal Işık","2004"));
        bookset.add(new book("Selçuk Mimarisi",345,"Meliha Aydoğdu","1975"));
        bookset.add(new book("Yarının Sınırında",194,"Sezer Uzungol","1953"));
        bookset.add(new book("Uzak Yollar",501,"Suzan Eryılmazer","2007"));
        bookset.add(new book("Hanımın Çiftliği",248,"Talat Aksoy","2018"));


        for(book book:bookset){

            System.out.println(book.getBook_name());
        }




        Set<book> bookset2 = new TreeSet<>(new Comparator<book>() {
            @Override
            public int compare(book o1, book o2) {
                return o1.getNumber_page() - o2.getNumber_page();


            }
        });


        bookset2.addAll(bookset);


        for (book book:bookset2 ) {

            System.out.println(book.getNumber_page());
        }





    };



}

