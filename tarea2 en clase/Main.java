public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Juliams" ,"jr 28 de julio 523");
        tienda.addCliente(new Cliente("Juan","Maylle",73301548));
        tienda.addCliente(new Cliente("Miguel","Serrano",22642836));
        tienda.addCliente(new Cliente("Frans","Aquino",21368525));
        tienda.addCliente(new Cliente("Nelvi","Revolledo",25456395));

        System.out.println(tienda.getNombre() +" "+ tienda.getDireccion());

        for (Cliente cliente : tienda.getClientes()) {
            System.out.println(cliente.getNombres() +" "+ cliente.getApellidos() +" "+ cliente.getDni());

        }


    }


}
