package Java8;

interface NewInterface{
    /* This is a default method. There is no need
     * to implement this method in the implementation 
     * classes  
     */
    default void newMethod(){  
        System.out.println("This is the default method");  
    }  
    
    void existingMethod(String str);  

    static void anotherNewMethod(){
    	System.out.println("This is the static method");
    }
}
public class DefaultMethod implements NewInterface {
    public void method(){
System.out.println("Hey, this is Navpreet Kaur.");
    }

    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
        DefaultMethod obj = new DefaultMethod();
        
        //calling the default method of interface
        obj.newMethod();     
        //calling the abstract method of interface
        obj.existingMethod("JAVA 8 is interesting."); 
        NewInterface.anotherNewMethod();
    }
}