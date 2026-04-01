package P6;

public class MahasiswaBerprestasi27 {
    Mahasiswa27[] listMhs = new Mahasiswa27[5];
    int idx;

    void tambah(Mahasiswa27 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa27 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------------");
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            if (listMhs[i] != null) {
                Mahasiswa27 temp = listMhs[i];
                int j = i;
                while (j > 0 && listMhs[j - 1] != null && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
                listMhs[j] = temp;
            }
        }
    }
    }
