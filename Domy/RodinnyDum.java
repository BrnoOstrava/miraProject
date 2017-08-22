public class RodinnyDum{
    private Obdelnik oknoJedna;
    private Obdelnik oknoDva;
    private Obdelnik dvere;
    private Obdelnik stena;
    private Trojuhelnik strecha;

    
    public RodinnyDum(){
        Platno.getPlatno().setRozmer(600, 1000);
        stena = new Obdelnik();
        oknoJedna = new Obdelnik();
        oknoDva = new Obdelnik();
        dvere = new Obdelnik();
        strecha = new Trojuhelnik();

        stena.setRozmer(150, 75);
        stena.setPozice(50, 600);
        stena.setBarva(Barva.SEDA);
        
        oknoJedna.setRozmer(22, 22);
        oknoJedna.setPozice(70, 615);
        
        oknoDva.setRozmer(22, 22);
        oknoDva.setPozice(100, 615);
        
        dvere.setRozmer(30, 50);
        dvere.setPozice(150, 625);
        
        strecha.setRozmer(150, 75);
        strecha.setPozice(50, 525);
        strecha.setBarva(Barva.CERVENA);
    }       
}
