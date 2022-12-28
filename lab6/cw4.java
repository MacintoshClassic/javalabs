class Books{
    String title;
    String author;
    String ganre;
    int[] edition = {1111111111};


    void method(){
        System.out.println("Title: "+title+
        "\nAuthor: "+author+"\nGanre: "+ganre+
        "\nEdition: "+edition[0]+"\n"); // wyswiatlamy tablice edition[0], gdzie 0 to jest index
    }
}

public class cw4 {
    public static void main(String[] args) {
        Books a = new Books();

        a.title = "1984";
        a.author = "George Orwell";
        a.ganre = "Dystopian fiction";
        a.method();

        Books b = new Books();
        b.title = "A History of Western Philosophy";
        b.author = "Bertrand Russell";
        b.ganre = "Philosophy literature";
        b.method();
    }
}