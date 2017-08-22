

public class Panelak{
    private Obdelnik stena;
    private Trojuhelnik strecha;
    private Obdelnik dvere;
    private Obdelnik okna;
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
        for(int j = 0; j <= 20; j++){
          
            for(int i = 0; i <= 9; i++){
                if(i != 2){
                okna = new Obdelnik();
                okna.setRozmer(22, 22);
                okna.setBarva(Barva.AZUROVA);
                okna.setPozice(222 + i * 26, 342 + j * 26);
            } 
           }
        }
        
    }
}
