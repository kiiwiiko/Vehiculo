public class Dueno {
    String propietario="";
    int cedula=0;
    int edad=0;
    String fechaNacido="";
    int telefono=0;
    String domicilio="";

    String genero;
    String tipo;

    public String genero(){
        String sexo="";
        if(tipo.equals("M")){
            sexo="Masculino";
        }else{
            sexo="Femenino";
        }
        return sexo;
    }
}
