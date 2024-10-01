package skibidilinkedlist;
public class SkibidiLinkedList {

    //ini adalah NODE doubly linked list
    public class Node<String> {
        //ini langkah membuat node sesuai gambar yang 1 kotak dibagi jadi --> | prev | data | next |
        Node prev; //jadi aku punya kotak buat simpan prev
        Node next; //dan aku punya kotak buat next
        String data; // ini kotakan buat simpan datanya
    
        public Node(String data) { //biasa, constructor
          this.data = data;
        }
      }
    
      Node head; //ini nanti digunakan untuk menentukan alamat head
      Node tail; //ini digunakan untuk menentukan alamat tail
    
      public void tambahAkhir(String data) { //fungsi untuk menambah di akhir, ada di PPT
        // kondisi kosong
        if (head == null && tail == null) {
          Node n = new Node(data);
          head = n;
          tail = n;
          return;
        }
        
        Node n = new Node(data);
        tail.next = n; //ini nih yang paling penting yang ada di ppt
        n.prev = tail; //ini nih yang paling penting yang ada di ppt
        tail = n;      //ini nih yang paling penting yang ada di ppt
      }
    
      public void cetak() {
        Node cursor = head; //ini untuk membantu menentukan posisi saat ini, kita pakai cursor
        System.out.println(cursor.data);
        while (cursor.next != null) {
          cursor = cursor.next;
          System.out.println(cursor.data); //cetak data yang ada pada node dimana cursor berada
        } 
      }
    
      public void cetakMundur() {
        Node cursor = tail; //ini untuk membantu menentukan posisi saat ini, kita pakai cursor
        System.out.println(cursor.data);
        while (cursor.prev != null) {
          cursor = cursor.prev;
          System.out.println(cursor.data); //cetak data yang ada pada node dimana cursor berada
        } 
      }

      public void insertMiddle(String data){
        Node cursor = head;
        while (cursor.data != "pasti" && cursor.next != null){
          cursor = cursor.next;
        }
        Node e = new Node(data);
        e.prev = cursor;
        e.next = cursor.next;
        cursor.next = e;
        e.next.prev = e;
      }

      public void removeLast(){
        Node cursor = tail;
        tail = tail.prev;
        tail.next = null;
        cursor.prev = null;
      }
    
}
