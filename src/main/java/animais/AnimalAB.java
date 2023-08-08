package animais;

public abstract class AnimalAB implements AnimalIF {
    protected double comidaIngerida;
    protected double caminhoPercorrido;
    protected double horasDormidas;
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
    public void imprimirInformacoes() {
        System.out.println(nome + " Tem "+ idade + " anos de idade " +
                " Pesa " + peso + "kg" + " tem " + altura + " cm de altura" + ", seu habitat é "+ habitat + " e é do tipo "+ tipoAnimal+". Comeu "
                + comidaIngerida + " vezes hoje, "
                + "se moveu "+ caminhoPercorrido+ " km" + " e dormiu "+ horasDormidas +" hora .");
    }
}
