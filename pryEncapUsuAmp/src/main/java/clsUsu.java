import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class clsUsu {
    private int id;
    private String nom;
    private int edad;
    private long dni;
    private String corr;
    private double saldo;
    private float alt;
    private  boolean est;
    private LocalDate fecNa;
    private LocalDateTime fecReg;
    private Pattern patExpReg;
    private Matcher matcher;

    public clsUsu() {
        this.id = 0;
        this.nom = "";
        this.edad = 0;
        this.dni = 0;
        this.corr = "";
        this.saldo = 0.0;
        this.alt = 0.0f;
        this.est = false;
        this.fecNa = LocalDate.of(1980, 1,1);
        this.fecReg = LocalDateTime.now();
        this.patExpReg = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

    }

    public clsUsu setId(int id) {//metodo chaini
        if (id > 0) this.id = id;
        return this;
    }

    public clsUsu setNom(String nom) {
        if (nom != null && !nom.trim().isEmpty())this.nom = nom;

        return this;
    }

    public clsUsu setEdad(int edad) {
        if (edad > 17 && edad < 110) this.edad = edad;

        return this;
    }

    public clsUsu setDni(long dni) {
        if (dni >= 1) this.dni = dni;
        return this;
    }

    public clsUsu setCorr(String corr) {
        Matcher relacionador = patExpReg.matcher(corr);
        if (relacionador.matches()){
            this.corr = corr;
        }else{
            System.out.println("ERROR: Correo invalido.");
        }
        return this;
    }

    public clsUsu setSaldo(double saldo) {
        if (saldo >= 0 ) this.saldo = saldo;
        return this;

    }

    public clsUsu setAlt(float alt) {
        if (alt > 40 && alt < 3.00) this.alt = alt;
        return this;
    }

    public clsUsu setEst(boolean est) {
        this.est = est;
        return this;
    }

    public clsUsu setFecNa(LocalDate fecNa) {
        this.fecNa = fecNa;
        return this;
    }

    public clsUsu setFecReg(LocalDateTime fecReg) {
        this.fecReg = fecReg;
        return this;
    }

    public long getDni() {
        return dni;
    }
}
