package composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoMascotas implements MascotaComponent {
    private List<MascotaComponent> mascotas = new ArrayList<>();

    public void add(MascotaComponent m) {
        mascotas.add(m);
    }

    @Override
    public void mostrar() {
        for (MascotaComponent m : mascotas) {
            m.mostrar();
        }
    }
}