package exc2;

public class POO extends EngenhariaComputacao implements IPOO{
    public float nota;
    public POO(float nota){
        setNota(nota);
    }

    public float getNota() {
        return this.nota;
    } 

    public void setNota(float nota) {
        if(nota < 0 || nota > 10){
            throw new ArithmeticException();
        }
        else{
            this.nota = nota;
        }
    }
    
    public String toString(){
        return "Nota: " + this.nota;
    }
}
