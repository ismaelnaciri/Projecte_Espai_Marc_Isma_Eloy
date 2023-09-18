package cat.insvidreres.inmrec.projecte_espai.classes;

public class Fisic extends Persona implements Cientific {

    private String adreca, ciutat;
    private int salari, edat, anys_experiencia;
    private char sexe;

    public Fisic(String nom, String codi_professional) {
        super(nom, codi_professional);
    }

    @Override
    public void fitxar(String codi_professional) {
        Cientific.super.fitxar(codi_professional);
    }
}
