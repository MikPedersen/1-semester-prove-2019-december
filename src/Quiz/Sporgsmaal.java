package Quiz;
//klassen spørgsmål med variabler der tildeles getters og setters,
// og dertilhørende metoder og constructors jævnfør opgaven
public class Sporgsmaal implements Translatable {
    private String sporgsmaal;
    private int point;
    private String svarmulighed1;
    private String svarmulighed2;
    private String svarmulighed3;
    private String rigtigtSvar;

    public Sporgsmaal(){
        this.sporgsmaal = sporgsmaal;
        this.point = point;
        this.svarmulighed1 = svarmulighed1;
        this.svarmulighed2 = svarmulighed2;
        this.svarmulighed3 = svarmulighed3;
        this.rigtigtSvar = rigtigtSvar;
    }
    public String getSporgsmaal() {
        return sporgsmaal;
    }

    public void setSporgsmaal(String sporgsmaal) {
        if(sporgsmaal.length() <= 100){
            this.sporgsmaal = sporgsmaal;}
        else
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if( point > 0 && point <= 100 )
        {this.point = point;}
        else
            throw new IllegalArgumentException("Point kan kun være mellem 0 og 100");
    }

    public String getSvarmulighed1() {
        return svarmulighed1;
    }

    public void setSvarmulighed1(String svarmulighed1) {
        this.svarmulighed1 = svarmulighed1;
    }

    public String getSvarmulighed2() {
        return svarmulighed2;
    }

    public void setSvarmulighed2(String svarmulighed2) {
        this.svarmulighed2 = svarmulighed2;
    }

    public String getSvarmulighed3() {
        return svarmulighed3;
    }

    public void setSvarmulighed3(String svarmulighed3) {
        this.svarmulighed3 = svarmulighed3;
    }

    public String getRigtigtSvar() {
        return rigtigtSvar;
    }

    public void setRigtigtSvar(String rigtigtSvar) {
        this.rigtigtSvar = rigtigtSvar;
    }

}
