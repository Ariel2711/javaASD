package skibidilinkedlist;
public class MyApp {
 

  public static void main(String[] args) {
    SkibidiLinkedList sll = new SkibidiLinkedList(); //bikin objek skibidi linke list
    sll.tambahAkhir("kita");  //nambah data
    sll.tambahAkhir("pasti"); //nambah data
    sll.tambahAkhir("bisa");  //nambah data
    sll.insertMiddle("juga"); //nambah ditengah
    sll.cetak(); //cetak data dari head kebelakang
    // System.out.println("===========");
    // sll.removeLast(); //hapus data terakhir
    // sll.cetak(); //cetak lagi
    //kalau mau cetak dari tail kedepan, bisa pakai cetakMundur
    // ssl.cetakMundur();
  }

}