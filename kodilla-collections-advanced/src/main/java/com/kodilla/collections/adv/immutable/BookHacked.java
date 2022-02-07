//package com.kodilla.collections.adv.immutable;
////klasa, która dziedziczy z naszej klasy Book i można dodać do niej metody modyfikujące pola klasy,
//// a następnie można użyć klasy BookHacked w metodzie main jako substytutu klasy Book i zmienić 'title'
//class BookHacked extends Book { // dlaczego nie ma 'public'?
//    private String realTitle; // krok 2 hackowania, wprowadzamy własne, nie 'final' pole do przechowywania tytułu
//
//    public BookHacked(String author, String title) {
//        super(author, title);
//       realTitle = title; // krok 2 tutaj i poniżej (@Override) przełaumjemy zabezpieczenie 'protected final String title"
//    }
//
//    public void modifyTitle(String newTitle) {
//        //title = newTitle;
//      realTitle = newTitle; // krok 2
//    }
//
//    @Override // krok 2
//    public String getTitle() {
//        return realTitle;
//    }
//}
