package test2;

import java.util.ArrayList;
import java.util.Objects;

public class Mission<T, S> {
    private T id;
    private S mission;
    private static ArrayList<Mission> missionList = new ArrayList<>(); // Tüm görevleri tutacak liste

    public Mission() {
    }

    // Constructor
    public Mission(T id, S mission) {
        this.id = id;
        this.mission = mission;
    }

    // Getter ve Setter metodları
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getMission() {
        return mission;
    }

    public void setMission(S mission) {
        this.mission = mission;
    }

    // Görevleri listeye eklemek için add metodu
    public static void add(Mission mission) {
        missionList.add(mission);
    }

    // Görevleri listeden silmek için remove metodu
    public static void remove(Mission mission) {
        missionList.remove(mission);
    }

    // Listeyi ekrana yazdırmak için toString metodu
    @Override
    public String toString() {
        return "Görev id: " + getId() + " Görev içeriği: " + getMission();
    }

    // hashCode ve equals metodları
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mission<?, ?> mission1 = (Mission<?, ?>) obj;
        return Objects.equals(id, mission1.id) && Objects.equals(mission, mission1.mission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mission);
    }

    // Listeyi döndürmek için getter
    public static ArrayList<Mission> getMissionList() {
        return missionList;
    }
}
