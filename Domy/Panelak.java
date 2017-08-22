

public class Panelak{
    private Obdelnik stena;
    private Trojuhelnik strecha;
    private Obdelnik dvere;
    public Panelak(){
        Platno.getPlatno().setRozmer(600, 1000);
        stena = new Obdelnik();
        strecha = new Trojuhelnik();
        dvere = new Obdelnik();
        
        stena.setRozmer(300, 700);
        stena.setBarva(Barva.SEDA);
        stena.setPozice(200, 300);
        
        strecha.setRozmer(300, 50);
        strecha.setPozice(200, 250);
        
        dvere.setRozmer(25, 60);
        dvere.setBarva(Barva.CERVENA);
        dvere.setPozice(350, 940);
        
    }
}
