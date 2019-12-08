package dc;

public class Main {
    public static void main(String[] args) {
        SamochódOsobowy osobowy1 = new SamochódOsobowy("Ford", "Focus", 2015, 6.2);
        osobowy1.zatankujPaliwo(40);
        SamochódDostawczy dostawczak1 = new SamochódDostawczy("Mercedes","Vito", 2017, 12.5, 2000);
        dostawczak1.zatankujPaliwo(120);
        try {
            osobowy1.ruszajWTrasę(300);
            osobowy1.zakończTrasę();
            dostawczak1.ruszajWTrasę(230, 400);
            dostawczak1.zakończTrasę();
            dostawczak1.ruszajWTrasę(630, 400);
            dostawczak1.zakończTrasę();
            dostawczak1.ruszajWTrasę(730, 400);
            dostawczak1.zakończTrasę();
        }
        catch(TrasaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
