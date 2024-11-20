public class Main {


    public static void main(String[] args) {
        Pet pet2 = new Pet("DOber", 2);  // "DOber" adı ilə 2 yaşında bir ev heyvanı

        // Valideynlər üçün Pet obyektləri yaradılır
        Pet pet1 = new Pet("Buddy", 3); // 3 yaşında bir başqa ev heyvanı
        Human petOwner = new Human("Ali", "Mehmedov", 1990, pet1); // Bu insanın adı Ali və ev heyvanı var

        // Human obyektinin yaradılması: Valideynlər (ana və ata) təyin edilir
        Human mother = new Human("Leyla", "Mehmedova", 1992, pet2);  // Ana
        Human father = new Human("Vahid", "Mehmedov", 1991, pet2);  // Ata

        // İnsan obyektinin yaradılması (ata, ana, ev heyvanı ilə)
        Human human = new Human("HUseyn", "Rustemli", 2004, pet2, mother, father);
        System.out.println(human);
    }
}
