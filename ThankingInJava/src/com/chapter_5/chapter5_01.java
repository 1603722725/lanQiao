package com.chapter_5;

/**
 * @Author: wl
 * @Date: 2019/10/19 16:55
 * 垃圾回收  finalze()方法
 */
public class chapter5_01 {
    static class  Book{
        boolean checkOut = false;
        Book(boolean checkOut){
            checkOut = checkOut;
        }
        void checkIn(){
            checkOut = false;
        }
        protected void  finalize(){
            if (checkOut)
                System.out.println("66666666666666666666666666");
        }

    }
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        new Book(false);
        System.gc();
    }
}
