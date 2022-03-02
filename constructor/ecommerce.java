public class E_Commerce {
    String name;
    int id;
    float length;
    float height;
    String image;

    public E_Commerce(String name,int id,float length,float height,String image){
        this.name = name;
        this.id = id;
        this.length = length;
        this.height = height;
        this.image = image;
    }
    void display(){
        System.out.println("Name="+name);
        System.out.println("Id= "+id);
        System.out.println("Length="+length);
        System.out.println("Height="+height);
        System.out.println("Image type="+image);
    }

    public static void main(String[] args) {
        E_Commerce e = new E_Commerce("Laptop",12,2,3,"Colourful");
        e.display();
    }
}