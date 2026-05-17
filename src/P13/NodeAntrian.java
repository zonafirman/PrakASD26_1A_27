package P13;

class NodeAntrian {
    int noAntrian;
    Pembeli pembeli;
    NodeAntrian prev;
    NodeAntrian next;

    NodeAntrian(int noAntrian, Pembeli pembeli) {
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
    }
}