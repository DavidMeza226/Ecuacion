package Modelo;

public class Cuadratica {

    private Integer n1, n2, n3, n4;
    public String ec, cu;

    public Cuadratica() {
    }

    public Cuadratica(Integer n1, Integer n2, Integer n3, Integer n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public Integer getN1() {
        return n1;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public Integer getN3() {
        return n3;
    }

    public void setN3(Integer n3) {
        this.n3 = n3;
    }

    public Integer getN4() {
        return n4;
    }

    public void setN4(Integer n4) {
        this.n4 = n4;
    }

    public void Calcular(Integer n1, Integer n2, Integer n3, Integer n4) {

        if (n1 > 0 && n2 > 0 && n3 > 0 && n4 == 1) {
            ec = "Su figura corresponde a un  ELIPSOIDE";
        }
        if (n1 > 0 && n2 > 0 && n3 < 0 && n4 == 0) {
            ec = "Su figura corresponde a un  CONO ELIPTICO";
        }
        if (n1 > 0 && n2 > 0 && n3 < 0 && n4 == 1) {
            ec = "Su figura corresponde a un  HIPERBOLOIDE DE UNA HOJA";
        }
        if (n1 > 0 && n2 < 0 && n3 < 0 && n4 == 1) {
            ec = "Su figura corresponde a un  HIPERBOLOIDE DE DOS HOJAS";
        }
        if (n1 > 0 && n2 > 0 && n3 == 0 && n4 != 1 && n4 != 0) {
            ec = "Su figura corresponde a un  PARABOLOIDE ELIPTICO";
        }
        if (n1 > 0 && n2 < 0 && n3 == 0 && n4 != 1 && n4 != 0) {
            ec = "Su figura corresponde a un  PARABOLOIDE HIPERBOLICO";
        }
    }

    public void Mostrar(Integer n1, Integer n2, Integer n3, Integer n4) {

        cu = n1 + "x²+" + n2 + "y²+" + n3 + " z²  = " + n4 + "c";

    }

}
