public class Main {
    public static void main(String[] args) {
        clsUsu objUsu = new clsUsu();
        objUsu.setId(1);
        objUsu.setNom("Victor");
        objUsu.setEdad(12);

        objUsu.setId(1).setNom("Hugo").setEdad(19).setDni(Long.parseLong("01234567")).setCorr("Hugo@gmail.com").setSaldo(23.4344).setAlt(1.67f);

        System.out.printf("Tu DNI es: %08d%n",objUsu.getDni());
    }
}
