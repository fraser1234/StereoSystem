public abstract class Component {

    String make;
    String model;

    public Component(String make, String model){
        this.make = make;
        this.model = model;
    }


    public String getModel(){
        return "2.0";
    }

    public String getMake(){
        return "Samsung";
    }




}
