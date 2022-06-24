package com.demo.oops;

class Box extends MainBox {
    int height;
    int length;
    int width;

    @Override
    public void dimensions() {
        System.out.println("Implemented abstract method");
    }
    public void dimensions(int height){
        System.out.println("Height of the box is " + height );
    }
   void dimensions(int height,int length){
       System.out.println("Height of the box is " + height );
       System.out.println("Length of box is " + length);
   } void dimensions(int height,int length,int width){
       System.out.println("Height of the box is " + height );
       System.out.println("Length of box is " + length);
       System.out.println("Width of the box is " + width);
   }


   public static void main(String[] args) {
       Box box = new Box();
       box.dimensions(325);
       box.dimensions(32,25);
       box.dimensions(32,25,63);
       box.dimensions();
   }



}
