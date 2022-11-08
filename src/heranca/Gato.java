package heranca;

public class Gato extends Pet{
    
    private boolean temGarraRetratil;

    
    public boolean isTemGarraRetratil() {
        return temGarraRetratil;
    }

    public void setTemGarraRetratil(boolean temGarraRetratil) {
        this.temGarraRetratil = temGarraRetratil;
    }
   
    @Override
    public void emitirSom(){
        System.out.println("miau, miau, miau!!!");
    }
    
}
