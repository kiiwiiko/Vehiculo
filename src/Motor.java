public class Motor {
    double cilindraje;
    String combustible;
    public double caballosFuerza(){
        double cf=0;
        if(combustible.equals("Diesel")){
            cf=10.5;
        }else{
            cf=5.2;
        }
        return cf;
    }
}
