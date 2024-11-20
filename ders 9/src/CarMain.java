public class CarMain {
    public static void feature(){
        System.out.println("--------- Ümumi xüsusiyyətlər ---------\nYüksək texnologiya: Hər üç markada ən son texnologiyalar və təhlükəsizlik sistemləri mövcuddur.");
        System.out.println("Lüks və komfort: Hər biri premium təcrübə təklif edir və sürücü və sərnişinlər üçün yüksək komfort təmin edir.");
        System.out.println("İnnovasiya: Hər üç marka, avtomobil sənayesində yeni trendləri müəyyən edir və innovativ xüsusiyyətlər təklif edir.");
    }
    public static void main(String[] args) {
        feature();
        Bmw bmw = new Bmw();
        Mercedes mercedes = new Mercedes();
        Tesla tesla = new Tesla();
    }
}
