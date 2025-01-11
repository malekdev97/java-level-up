package classrelationships.inheritance;

class Taxi implements Car{

    private String name;

    public void start(){
        System.out.println("Taxi is starting");
    }
    public void stop() {
        System.out.println("Taxi is stopping");
    }

    public void set_name(){ 
        this.name = name;
    }

    public String get_name(){
        return name;
    }
}