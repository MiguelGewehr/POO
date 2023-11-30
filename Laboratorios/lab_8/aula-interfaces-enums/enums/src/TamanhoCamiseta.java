public enum TamanhoCamiseta {
    P(US.S), M(US.M), G(US.L), GG(US.XL);

    private US correspondente;

    private TamanhoCamiseta(US correspondente) {
        this.correspondente = correspondente;
    }

    public US getCorrespondenteUS() {
        return this.correspondente;
    }

    public static enum US {
        S, M, L, XL;
    }

}
