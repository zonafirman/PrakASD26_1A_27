package P14.Percobaan1;

public class BinaryTreeArray27 {
    Mahasiswa27[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray27() {
        this.dataMahasiswa = new Mahasiswa27[100];
        this.idxLast       = -1;
    }

    void populateData(Mahasiswa27 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast       = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }


    public void add(Mahasiswa27 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }

        int current = 0;
        while (true) {
            if (data.ipk < dataMahasiswa[current].ipk) {
                int left = 2 * current + 1;
                if (dataMahasiswa[left] == null) {
                    dataMahasiswa[left] = data;
                    if (left > idxLast) idxLast = left;
                    return;
                }
                current = left;
            } else {
                int right = 2 * current + 2;
                if (dataMahasiswa[right] == null) {
                    dataMahasiswa[right] = data;
                    if (right > idxLast) idxLast = right;
                    return;
                }
                current = right;
            }
        }
    }


    
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
