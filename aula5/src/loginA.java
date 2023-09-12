

public class loginA extends  Pessoa{


    private double n1;
    private double n2;
    private double media;



    public double getN1(){
        return n1;
    }
    public void setN1(final double n1){
        this.n1 = n1;
    }
    public double getN2(){
        return n2;
    }
    public void setN2(final double n2){
        this.n2 = n2;
    }

    public void calcmedia(){
        media = (n1 + n2) / 2;

    }

    public double getMedia() {
        return media;
    }
}
