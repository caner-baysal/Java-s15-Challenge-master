1- Library ve Author dosyalarında books değişkeni Set olarak yeniden tanımlandı.
2- Assignable dosyasındaki metodlar ilgili sınıflarda oluşturularak kullanıldığı için kaldırıldı.
   Book sınıfında changeOwner, getOwner, display, updateStatus metodları işlevsellik açısından gerekli olmadıkları için kaldırıldı
3- Kitap kategorileri Enum olarak yeninden düzenlendi.
4- Reader sınıfında borrowedBooks initialize edildi ve hatadan kaçınmak için purchaseBook, borrowBook, returnBook, getBooks ve setBooksRead metodlarına if kontrolleri eklendi.
5- Library dosyasında removeBook() methodunda; String olarak verilen book parametresi kitap ismi olarak kullanılarak findBookByTitle method ile bulunarak kitap listesinden çıkarıldı
   Böylece mantık hatası giderildi.
6- Library sınıfında bulunan lendBook() metodundaki book parametresi String yerine Book sınıfından türetilecek şekilde değiştirildi.
   Kitabın müsait olup olmadığı if bloğu içerisinde !lendedBooks.containsKey(book) kontrolü ile; 5 kitap limiti canBorrowMore() kontrolü ile eklendi.
   Fatura oluşturma kısmı için çalışma yapılacak.
7- Fatura kısmı ile ilgili çalışma yapılacak.
8- Library sınıfında yer alan aşağıdaki metdolardaki mantık hataları düzeltildi.
   findBookById(Book book) → Book book yerine int id parametresi verilerek düzenlendi.
   findBookByAuthor(Book book) → Book book yerine Author author parametresi verilerek düzenlendi.
   getBooksByAuthor(Author author) → Author author yerine Category category parametresi verilerek düzenlendi.
9- Main sınıfında getBooksByAuthor çağrılırken author çağrılırken Author sınıfından türetiliyordu, bu mantık hatası authorName'in String olarak çağrılmasıyla giderildi.
10-Main sınıfına Id'ye göre kitap seçme, kategoriye göre listeleme ve kitap güncelleme seçenekleri (updateBook() metodu Library sınıfına eklenerek) eklendi.